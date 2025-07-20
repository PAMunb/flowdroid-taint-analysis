package soot.jimple.infoflow;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MetricsManager {
    private final Map<String, Metrics> metricsByTest = new HashMap<>();

    private Metrics getOrCreateMetrics(String testName) {
        Metrics m = metricsByTest.get(testName);
        if (m == null) {
            m = new Metrics();
            metricsByTest.put(testName, m);
        }
        return m;
    }

    // Reporting methods
    public void reportTruePositives(String testName, int n) {
        getOrCreateMetrics(testName).reportTruePositives(n);
    }
    public void reportFalsePositives(String testName, int n) {
        getOrCreateMetrics(testName).reportFalsePositives(n);
    }
    public void reportFalseNegatives(String testName, int n) {
        getOrCreateMetrics(testName).reportFalseNegatives(n);
    }
    public void reportTrueNegatives(String testName) {
        getOrCreateMetrics(testName).reportTrueNegatives();
    }
    public void reportPassedTest(String testName) {
        getOrCreateMetrics(testName).reportPassedTest();
    }
    public void reportFailedTest(String testName) {
        getOrCreateMetrics(testName).reportFailedTest();
    }
    public void reportExpected(String testName, int n) {
        getOrCreateMetrics(testName).reportExpected(n);
    }
    public void reportFound(String testName, int n) {
        getOrCreateMetrics(testName).reportFound(n);
    }

    // Automated computation
    public void compute(String testName, int expected, int found) {
        getOrCreateMetrics(testName).compute(expected, found);
    }

    // Metric calculation methods (per test or aggregate)
    public double precision(String testName) {
        return round(getOrCreateMetrics(testName).precision());
    }
    public double recall(String testName) {
        return round(getOrCreateMetrics(testName).recall());
    }
    public double f1Score(String testName) {
        return round(getOrCreateMetrics(testName).f1Score());
    }
    public double passRate(String testName) {
        return round(getOrCreateMetrics(testName).passRate());
    }
    public int vulnerabilities(String testName) {
        return getOrCreateMetrics(testName).vulnerabilities();
    }
    public int vulnerabilitiesFound(String testName) {
        return getOrCreateMetrics(testName).vulnerabilitiesFound();
    }

    // Aggregate metrics
    public double precision() {
        double tp = 0, fp = 0;
        for (Metrics m : metricsByTest.values()) {
            tp += m.truePositives;
            fp += m.falsePositives;
        }
        if (tp + fp == 0) return 0.0;
        return round(tp / (tp + fp));
    }
    public double recall() {
        double tp = 0, fn = 0;
        for (Metrics m : metricsByTest.values()) {
            tp += m.truePositives;
            fn += m.falseNegatives;
        }
        if (tp + fn == 0) return 0.0;
        return round(tp / (tp + fn));
    }
    public double f1Score() {
        double p = precision();
        double r = recall();
        if (p + r == 0) return 0.0;
        return round(2 * (p * r) / (p + r));
    }
    public double passRate() {
        int passed = passedTests();
        int failed = failedTests();

        if (passed + failed == 0) return 0.0;
        return round((passed * 1.0 / (passed + failed)) * 100);
    }
    public int passedTests() {
        int passed = 0;
        for (Metrics m : metricsByTest.values()) {
            passed += m.passedTests;
        }
        return passed;
    }
    public int failedTests() {
        int failed = 0;
        for (Metrics m : metricsByTest.values()) {
            failed += m.failedTests;
        }
        return failed;
    }
    public int vulnerabilities() {
        int sum = 0;
        for (Metrics m : metricsByTest.values()) {
            sum += m.vulnerabilities();
        }
        return sum;
    }
    public int vulnerabilitiesFound() {
        int sum = 0;
        for (Metrics m : metricsByTest.values()) {
            sum += m.vulnerabilitiesFound();
        }
        return sum;
    }

    public int truePositives() {
        int sum = 0;
        for (Metrics m : metricsByTest.values()) {
            sum += m.truePositives;
        }
        return sum;
    }

    public int falsePositives() {
        int sum = 0;
        for (Metrics m : metricsByTest.values()) {
            sum += m.falsePositives;
        }
        return sum;
    }

    public int falseNegatives() {
        int sum = 0;
        for (Metrics m : metricsByTest.values()) {
            sum += m.falseNegatives;
        }
        return sum;
    }

    // Access
    public Metrics metricsFor(String testName) {
        return getOrCreateMetrics(testName);
    }

    // Reporting
    public void report(String testName) {
        Metrics m = getOrCreateMetrics(testName);
        System.out.println(String.format("Test: %s", testName));
        System.out.println(String.format("failed = %d, passed = %d of = %d tests.", m.failedTests, m.passedTests, (m.passedTests + m.failedTests)));
        System.out.println(String.format("Pass Rate: = %.2f", m.passRate()));
        System.out.println(String.format("Expecting %d of %d warnings.", m.vulnerabilities(), m.vulnerabilitiesFound()));
        System.out.println(String.format("TP = %.2f FP = %.2f FN = %.2f TN = %.2f", m.truePositives, m.falsePositives, m.falseNegatives, m.trueNegatives));
        System.out.println(String.format("Precision = %.2f Recall = %.2f F-score = %.2f", m.precision(), m.recall(), m.f1Score()));
    }

    public void reportAll() {
        for (String testName : metricsByTest.keySet()) {
            report(testName);
            System.out.println();
        }
    }

    public void reportSummary() {

        int passed = passedTests();
        int failed = failedTests();
        int total = passed + failed;
        double passRate = (double) passed / total * 100;

        System.out.println(String.format(
            "- **???** - failed: %d, passed: %d of %d tests. `(%.2f%%)`",
            failed, passed, total, passRate
        ));
        
        System.out.println("| Test | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1 |");
        System.out.println("|------|-------|----------|--------|----|----|----|-----------|--------|----|");

        List<Map.Entry<String, Metrics>> entries = new ArrayList<>(metricsByTest.entrySet());
        Collections.sort(entries, new java.util.Comparator<Map.Entry<String, Metrics>>() {
            @Override
            public int compare(Map.Entry<String, Metrics> a, Map.Entry<String, Metrics> b) {
                return a.getKey().compareTo(b.getKey());
            }
        });
        
        for (Map.Entry<String, Metrics> entry : entries) {
            String testName = entry.getKey().split("\\.")[entry.getKey().split("\\.").length - 1];
            Metrics m = entry.getValue();
            String status = (m.failedTests == 0) ? "PASS" : "FAIL";
            
            System.out.println(String.format(
                "| %s | %d | %d | %s | %.0f | %.0f | %.0f | %.2f | %.2f | %.2f |",
                testName, m.vulnerabilitiesFound(), m.vulnerabilities(), status, m.truePositives, m.falsePositives, m.falseNegatives, m.precision(), m.recall(), m.f1Score()
            ));
        }
        // Totals
        System.out.println(String.format(
            "| TOTAL    | %d | %d | %d/%d | %d | %d | %d | %.2f | %.2f | %.2f |",
            vulnerabilitiesFound(),
            vulnerabilities(),
            passed, (passed + failed),
            truePositives(),
            falsePositives(),
            falseNegatives(),
            precision(),
            recall(),
            f1Score()
        ));
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
} 