package soot.jimple.infoflow.test.securibench.suite;

import soot.jimple.infoflow.test.securibench.SecuriBenchTestCase;

public class StrongUpdateSuiteTest extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro.strong_updates";
    }

    @Override
    public String entryPointMethod() {
        return "void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)";
    }
}
