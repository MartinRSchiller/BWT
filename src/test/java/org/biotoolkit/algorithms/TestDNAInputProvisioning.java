package org.biotoolkit.algorithms;

import org.biotoolkit.algorithms.bwtx.BWTApplication;
import org.junit.Test;

public class TestDNAInputProvisioning{

    @Test
    public void test(){
        /**
         * This shouldnt throw a runtime exception, if it does, this test will fail, because
         * unit tests fail on RuntimeExceptions or any other uncaught exception
         */
        BWTApplication.runInputProvider("org.biotoolkit.algorithms.bwtx.DNAInputProviderSIMPLE");
    }
}
