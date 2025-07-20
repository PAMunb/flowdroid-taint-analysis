package soot.jimple.infoflow.test.securibench.suite;

import soot.jimple.infoflow.test.securibench.SecuriBenchTestCase;

public class SecuribenchSuiteTest extends SecuriBenchTestCase {

    @Override
    public String basePackage() {
        return "securibench.v1.micro";
    }

    @Override
    public String entryPointMethod() {
        return "void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)";
    }
}
