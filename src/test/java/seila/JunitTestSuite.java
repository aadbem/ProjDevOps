package seila;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestSuite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
	
   TestJunit1.class ,TestJunit2.class, TestJunit3.class
})

public class JunitTestSuite {
}