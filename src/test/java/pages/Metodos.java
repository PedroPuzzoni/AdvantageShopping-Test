package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {
	
	//Metodo de clique

	public void click(By elemento) {

		driver().findElement(elemento).click();

	}
	
	//Metodo de Escrita

	public void escrever(By elemento, String texto) {

		driver().findElement(elemento).sendKeys(texto);

	}
	
	//Metodo de valida��o

	public String validarTexto(By elemento) {

		return driver().findElement(elemento).getText();

	}
	
	//Metodo de ScreenShot

	public void screenShot(String nomeSrc) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver());
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeSrc + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
}