package Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import seila.TestJunit1;
import seila.TestJunit2;
import seila.TestJunit3;

@RunWith(Suite.class)
@SuiteClasses({TestJunit1.class ,TestJunit2.class, TestJunit3.class, TesteCase.class
})
public class AllTests {

}
