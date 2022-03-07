package pages;

import java.io.IOException;

public class Cadastro extends Properties {

	// Metodos de escrita e evidencia de formulario

	public void preencherCadastro() throws IOException, InterruptedException {

		Thread.sleep(2000);

		metodo.escrever(elemento.getUser(), User);
		metodo.escrever(elemento.getEmail(), Email);
		metodo.escrever(elemento.getSenha(), Senha);
		metodo.escrever(elemento.getConfSenha(), ConfSenha);
		metodo.escrever(elemento.getPnome(), Pnome);
		metodo.escrever(elemento.getSnome(), Snome);
		metodo.escrever(elemento.getNumero(), Numero);
		metodo.screenShot("EVD 01 - Cadastro");
		metodo.escrever(elemento.getCidade(), Cidade);
		metodo.escrever(elemento.getEndereco(), Endereco);
		metodo.escrever(elemento.getEstado(), Estado);
		metodo.escrever(elemento.getCep(), Cep);
		metodo.click(elemento.getBtnPais());
		metodo.click(elemento.getBtnPais1());
		metodo.click(elemento.getBtnAgree());
		metodo.screenShot("EVD 02 - Cadastro");
		Thread.sleep(1000);
		metodo.click(elemento.getBtnRegistro());

		Thread.sleep(2000);

		if (metodo.validarTexto(elemento.getLoginSucessful()).equals(User)) {

			metodo.screenShot("EVD 03 - Cadastro Concluido");

		}

	}

	public void preencherCadExistente() throws IOException, InterruptedException {

		Thread.sleep(2000);

		metodo.escrever(elemento.getUser(), "BeeMo");
		metodo.escrever(elemento.getEmail(), Email);
		metodo.escrever(elemento.getSenha(), Senha);
		metodo.escrever(elemento.getConfSenha(), ConfSenha);
		metodo.click(elemento.getBtnAgree());
		Thread.sleep(1000);
		metodo.click(elemento.getBtnRegistro());
		metodo.escrever(elemento.getEmail(), Email);
		Thread.sleep(500);

		// String para comparar o elemento com o nome da classe
		String Comparar = "User name already exists";

		if (metodo.validarTexto(elemento.getUsuarioRegistrado()).equals(Comparar)) {

			metodo.screenShot("EVD 04 - Erro Cadastro");

		}
	}

	public void preencherCadInvalido() throws IOException, InterruptedException {

		Thread.sleep(2000);

		metodo.escrever(elemento.getUser(), "BeeMo");
		Thread.sleep(2000);
		metodo.escrever(elemento.getEmail(), "test@");
		Thread.sleep(2000);
		metodo.click(elemento.getSenha());

		Thread.sleep(500);

		// String para comparar o elemento com o nome da classe
		String Comparar = "Your email address isn't formatted correctly";

		if (metodo.validarTexto(elemento.getMsgEmailInv()).equals(Comparar)) {

			metodo.screenShot("EVD 05 - Email Invalido");

		}

	}

}