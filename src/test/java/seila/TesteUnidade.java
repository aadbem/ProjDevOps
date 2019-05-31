package seila;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TesteUnidade {//extends TestCase {  
	private int x = 1;  
	private int y = 1;
	
	@Test 
	public void metodo() {    
		int z = x + y;    
		assertEquals(2, z);  
	}
	
	@Test
	public void executa() {
		String s[] = new String[1];
		s[0] = "primeiro";
		seilaStart.main(s); 
		
		assertEquals(1, 1);
	}
}

