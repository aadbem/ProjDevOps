package seila;

import org.junit.Test;
import junit.framework.TestCase; 

public class TesteUnidade extends TestCase {  
	private int x = 1;  
	private int y = 1;    
	
	@Test 
	public void metodo() {    
		int z = x + y;    
		assertEquals(2, z);  
	}
}