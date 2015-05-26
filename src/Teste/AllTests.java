package Teste;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(ManagerTest1.class);
		suite.addTestSuite(ManagerTest2.class);
		//$JUnit-END$
		return suite;
	}

}
