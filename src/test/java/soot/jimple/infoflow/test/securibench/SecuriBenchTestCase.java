package soot.jimple.infoflow.test.securibench;

import soot.jimple.infoflow.Metrics;
import soot.jimple.infoflow.MetricsManager;
import soot.jimple.infoflow.JUnitTests;
import soot.jimple.infoflow.Infoflow;
import org.junit.Assert;
import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import securibench.v1.micro.MicroTestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class SecuriBenchTestCase extends JUnitTests {

    public abstract String entryPointMethod();

    public abstract String basePackage();

    @SuppressWarnings("unchecked")
    protected Set<Class<? extends MicroTestCase>> findClassesInBasePackage() {
        Reflections reflections = new Reflections(basePackage(), new SubTypesScanner(false));
        Set<?> rawSet = reflections.getSubTypesOf(MicroTestCase.class);
        Set<Class<? extends MicroTestCase>> result = new java.util.HashSet<Class<? extends MicroTestCase>>();
        for (Object clazz : rawSet) {
            if (clazz instanceof Class) {
                Class<?> cls = (Class<?>) clazz;
                if (MicroTestCase.class.isAssignableFrom(cls)) {
                    result.add((Class<? extends MicroTestCase>) cls);
                }
            }
        }
        return result;
    }

    @Test
    public final void testSuite() throws Exception {
        Set<Class<? extends MicroTestCase>> classes = findClassesInBasePackage();
        List<String> report = new ArrayList<>();

        boolean failure = false;

        MetricsManager metricsManager = new MetricsManager();

        for (Class c: classes) {
            Object instance = c.newInstance();

            if (! (instance instanceof MicroTestCase)) {
                throw new RuntimeException("Could not instantiate " + c.getName() + " as a MicroTestCase");
            }

            MicroTestCase microTestCase = (MicroTestCase) instance;
            int expected = microTestCase.getVulnerabilityCount();
            int found = 0;
            String testName = c.getName();
            try {
                List<String> epoints = new ArrayList<String>();
                epoints.add("<" + testName + ": " + entryPointMethod() + ">");
                Infoflow infoflow = initInfoflow(epoints);
                infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
                found = infoflow.getResults().size();

            } catch(Throwable e) {
                report.add(String.format("- %s failure to execute. Error = %s", c.getName(), e));
                failure = true;
            }

            metricsManager.compute(testName, expected, found);
        }

        Collections.sort(report);
        for(String s: report) {
            System.out.println(s);
        }

        if (failure) {
            System.err.println("We found errors in the Joana execution or configuration.");
        }

        if (metricsManager.vulnerabilitiesFound() == metricsManager.vulnerabilities()) {
            Assert.assertTrue(true);
        }

        metricsManager.reportSummary();
    }

}
