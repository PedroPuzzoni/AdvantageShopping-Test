package steps;

import java.io.IOException;
import elements.WebElements;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.Cadastro;
import pages.Login;
import pages.Metodos;
import pages.Comprar;

public class Steps {

	Metodos metodo = new Metodos();
	WebElements elemento = new WebElements();
	Cadastro cadastro = new Cadastro();
	Login lgn = new Login();
	Comprar consulta = new Comprar();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {

		metodo.abrirNavegador(appUrl);

	}

	//--------------------------------------------- Cadastro -------------------------------------------------

	@Quando("preencher o formulario")
	public void preencher_o_formulario() throws IOException, InterruptedException {

		Thread.sleep(4000);
		metodo.click(elemento.getBtnUser());
		Thread.sleep(2000);
		metodo.click(elemento.getBtnCadastro());
		cadastro.preencherCadastro();

	}

	@Entao("fecho o navegador")
	public void fecho_o_navegador() {

		metodo.fecharNavegador();

	}

	//------------------------------------------- Cadastro Error ----------------------------------------------

	@Quando("preencher o formulario com usuario ja existemte")
	public void preencher_o_formulario_com_usuario_ja_existente() throws IOException, InterruptedException {

		Thread.sleep(4000);
		metodo.click(elemento.getBtnUser());
		Thread.sleep(2000);
		metodo.click(elemento.getBtnCadastro());
		cadastro.preencherCadExistente();

	}

	@Entao("valido as informacoes de erro do cadastro")
	public void valido_as_informacoes_de_erro_do_cadastro() throws IOException {

		metodo.fecharNavegador();

	}
	
	@Quando("preencher o formulario com email invalido")
	public void preencher_o_formulario_com_email_invalido() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		metodo.click(elemento.getBtnUser());
		Thread.sleep(2000);
		metodo.click(elemento.getBtnCadastro());
		cadastro.preencherCadInvalido();
	   
	}

	

	//------------------------------------------------- Login -------------------------------------------------

	@Quando("preencher o campo de login e senha")
	public void preencher_o_campo_de_login_e_senha() throws InterruptedException, IOException {

		Thread.sleep(4000);
		lgn.logar();

	}

	@Entao("valido se esta logado")
	public void valido_se_esta_logado() throws IOException, InterruptedException {

		Thread.sleep(3000);
		metodo.screenShot("EVD 08 - Login Validado");
		metodo.fecharNavegador();

	}

	//----------------------------------------------- Login Error ----------------------------------------------

	@Quando("preencher o campo de login e senha erradas")
	public void preencher_o_campo_de_login_e_senha_erradas() throws InterruptedException, IOException {

		Thread.sleep(4000);
		lgn.loginErrado();

	}

	@Entao("fecho o browser")
	public void fecho_o_browser() {

		metodo.fecharNavegador();
		
		//----------------------------------------------- Consulta de Produtos ----------------------------------------------

	}
	
	@Quando("logo no site e consulto laptop")
	public void logo_no_site_e_consulto_laptop() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		lgn.logar();
		Thread.sleep(4000);
		consulta.consultarLaptop();
		
	}

	@Entao("efetuo o logout e fecho o navegador")
	public void efetuo_o_logout_e_fecho_o_navegador() throws InterruptedException, IOException {
	    
		Thread.sleep(2000);
		lgn.logout();
        Thread.sleep(2000);
        metodo.screenShot("EVD 11 - Logout");
		metodo.fecharNavegador();
		
        
	}

	@Quando("Logo no site e consulto tablet")
	public void logo_no_site_e_consulto_tablet() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		lgn.logar();
		Thread.sleep(4000);
		consulta.consultarTablet();
		
	}

	@Quando("Logo no site e adiciono laptop no carrinho")
	public void logo_no_site_e_adiciono_laptop_no_carrinho() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		lgn.logar();
		Thread.sleep(4000);
		consulta.consultarLaptop();
		consulta.adicionarLaptop();
		
	}

	@Entao("faco a compra com SafePay e depois efetuo logout")
	public void faco_a_compra_com_safe_pay_e_depois_efetuo_logout() throws InterruptedException, IOException {
		

		consulta.comprarProdutoLaptop();
		Thread.sleep(2000);
		lgn.logout();
        Thread.sleep(2000);
		metodo.fecharNavegador();
		
	}

	@Quando("Logo no site e adiciono tablet no carrinho")
	public void logo_no_site_e_adiciono_tablet_no_carrinho() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		lgn.logar();
		Thread.sleep(4000);
		consulta.consultarTablet();
		consulta.adicicionarTablet();
		
	}

	@Entao("faco a compra com Cartao de credito e depois efetuo logout")
	public void faco_a_compra_com_cartao_de_credito_e_depois_efetuo_logout() throws InterruptedException, IOException {
	    
		
		consulta.comprarProdutoTablet();
		Thread.sleep(2000);
		lgn.logout();
        Thread.sleep(4000);
        metodo.fecharNavegador();
		
	}


}