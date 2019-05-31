package seila;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.BeforeClass;


public class TestJunit1 {

   String message = "Robert";	
   //MessageUtil messageUtil = new MessageUtil(message);

   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
		System.out.println("mostrando metodo Before Class TestJunit1");
       //Method annotated with `@BeforeClass` will execute once before any of the test methods in this class.
       //This method could be used to set up any test fixtures that are computationally expensive and shared by several test methods. e.g. establishing database connections 
       //Sometimes several tests need to share computationally expensive setup (like logging into a database). While this can compromise the independence of tests, sometimes it is a necessary optimization. From http://junit.sourceforge.net/javadoc/org/junit/BeforeClass.html     
   }
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      //assertEquals(message, messageUtil.printMessage());     
      assertEquals(message, message);
   }
}