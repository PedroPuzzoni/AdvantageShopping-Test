package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser{

	private static WebDriver driver;
	public static WebDriver driver() {
		return driver;

	}

	
	public void abrirNavegador(String appUrl) {
		
   //   SELECIONE O NAVEGADOR NO QUAL QUEIRA EXECUTAR OS TESTES.
   //   "Chrome" para usar o google chrome, "Opera" para usar o opera e "IE" para usar o internet explorer.
		
		 String navegador = "Chrome";
		 
   //=======================================================================================================
		
		if (navegador == "Chrome") {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (navegador == "Opera") {

			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();

		} else if (navegador == "IE") {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.get(appUrl);

	}

	public void fecharNavegador() {

		driver.quit();

	}

}