package seila;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 */

public class seilaStartSelenium {

	public void TestSelenium() throws Exception {
	//public void preencheFormularioGoogle() {
		  
		  File file = new File("C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		  System.out.println("Path : " + file.getAbsolutePath());
		
		
		  //firefox
		  //System.setProperty("webdriver.gecko.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver_win32\\chromedriver.exe");
		  System.out.println(System.getProperty("webdriver.chrome.driver"));
		  		  
		  WebDriver driver = new ChromeDriver();		  
		  //System.setProperty("webdriver.chrome.driver", "/opt/local/bin/chromedriver");		  
		  
		  // Visita a página do Correios
		  //driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/buscaLogBairro.cfm");
		  driver.get("https://www.google.com/");
		 
		  /* EXEMPLO PAGINA DO CORREIO
		  // Escolhe o valor de UF
		  Select selectUF = new Select(driver.findElement(By.name("UF")));
		  selectUF.selectByVisibleText("RJ");
		  // Preenche a Localidade com o valor "Rio de Janeiro"
		  WebElement inputLocalidade = driver.findElement(By.name("Localidade"));
		  inputLocalidade.sendKeys("Rio de Janeiro");
		  // Preenche o campo Bairro com o valor "Copacabana"
		  WebElement inputBairro = driver.findElement(By.name("Bairro"));
		  inputBairro.sendKeys("Copacabana");
		  */
		  
		  //q its the search box name/ID
		  WebElement element = driver.findElement(By.name("q"));
		   
		  // Seaching for Juliano Marcos Martins - me
		  element.sendKeys("Juliano Marcos Martins");
		  
		  //Submit the form
		  element.submit();
		   
		  //Printing the page title - just for example
		  System.out.println("Page title is: " + driver.getTitle());
		  
		  /* EXEMPLO PAGINA DO CORREIO
		  // clica no botão Buscar
		  WebElement buttonBuscar = driver.findElement(By.cssSelector("input[type='submit'"));
		  buttonBuscar.click();
		  */
	}
}
