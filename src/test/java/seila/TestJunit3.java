package seila;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit3 {

   String message = "Function";	
   //MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSomatoria() {
      System.out.println("Inside testSomatorio()");
      
      int resultado = seila.funcoes.somar(10, 20);
      
      assertEquals(resultado,30);
      //assertEquals(message,messageUtil.salutationMessage());
      
   }
}