package pages;

import java.io.IOException;

public class Login extends Cadastro {

	public void logar() throws InterruptedException, IOException {

		metodo.click(elemento.getBtnUser());
		metodo.escrever(elemento.getLogin(), User);
		Thread.sleep(2000);
		metodo.escrever(elemento.getPassword(), Senha);
		metodo.screenShot("EVD 06 - CamposPreenchidos");
		metodo.click(elemento.getBtnSign());

	}

	public void loginErrado() throws InterruptedException, IOException {

		metodo.click(elemento.getBtnUser());

		// Login intencionalmente incorreto
		metodo.escrever(elemento.getLogin(), "Usr");
		Thread.sleep(2000);

		// Senha qualquer
		metodo.escrever(elemento.getPassword(), "ABC12Pass");

		metodo.click(elemento.getBtnSign());
		Thread.sleep(1000);
		metodo.screenShot("EVD 09 - Erro Login");

	}
	
	public void logout() throws InterruptedException, IOException {
		
		metodo.click(elemento.getBtnUser());
		Thread.sleep(1000);
		metodo.click(elemento.getBtnSignOut());
	}

}