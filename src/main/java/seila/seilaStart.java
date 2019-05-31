package seila;
import seila.seilaStartSelenium;

public class seilaStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ola Mundo");
		System.out.println("teste nova versao");
		System.out.println("alteracao programa");
		
		System.out.println("alteração programa via GIT");	
		
		seilaStartSelenium TesteChrome = new seilaStartSelenium();
		try {
			//TesteChrome.TestSelenium();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}