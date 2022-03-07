package pages;

import java.io.IOException;

public class Comprar extends Login {
	

	public void consultarLaptop() throws InterruptedException, IOException {
		
		metodo.click(elemento.getBtnLaptop());
		Thread.sleep(4000);
		metodo.screenShot("EVD 10 - Acessando pagina Laptop");
		Thread.sleep(4000);


	}
	
	public void adicionarLaptop() throws InterruptedException, IOException {
		
		metodo.click(elemento.getBtnProdutoLaptop());
		Thread.sleep(4000);
		metodo.screenShot("EVD 13 - Selecionando Laptop");
		metodo.click(elemento.getBtnSaveToCart());
		Thread.sleep(2000);
		metodo.screenShot("EVD 14 - Adicionando Laptop ao carrinho");
		
	}
	
	public void consultarTablet() throws IOException, InterruptedException {
		
		metodo.click(elemento.getBtnTablets());
		Thread.sleep(4000);
		metodo.screenShot("EVD 12 - Acessando pagina Tablets");
		Thread.sleep(4000);

	}
	
	public void adicicionarTablet() throws InterruptedException, IOException {
		
		metodo.click(elemento.getBtnProdutoTablet());
		Thread.sleep(4000);
		metodo.screenShot("EVD 19 - Selecionando Tablet");
		metodo.click(elemento.getBtnSaveToCart());
		Thread.sleep(2000);
		metodo.screenShot("EVD 20 - Adicionando Tablet ao carrinho");
		
	}

	public void comprarProdutoLaptop() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		metodo.click(elemento.getBtnCarrinho());
		Thread.sleep(2000);
		metodo.screenShot("EVD 15 - Acessando pagina do carrinho");
		metodo.click(elemento.getBtnCheckout());
		Thread.sleep(4000);
		metodo.screenShot("EVD 16 - Acessando a pagina de checkout");
		metodo.click(elemento.getBtnNext());
		Thread.sleep(4000);
		metodo.escrever(elemento.getTextSafePayNome(), Usuario);
		metodo.escrever(elemento.getTextSafePaySenha(), Senha);
		Thread.sleep(2000);
		metodo.screenShot("EVD 17 - Efetuando pagamento com SafePay");
		Thread.sleep(2000);
		metodo.click(elemento.getBtnPayNowSafePay());
		Thread.sleep(4000);
		metodo.screenShot("EVD 18 - Compra com SafePay efetuada com sucesso");
		

	}

	public void comprarProdutoTablet() throws InterruptedException, IOException {
		
		Thread.sleep(4000);
		metodo.click(elemento.getBtnCarrinho());
		Thread.sleep(2000);
		metodo.screenShot("EVD 21 - Acessando pagina do carrinho");
		metodo.click(elemento.getBtnCheckout());
		Thread.sleep(4000);
		metodo.screenShot("EVD 22 - Acessando a pagina de checkout");
		metodo.click(elemento.getBtnNext());
		Thread.sleep(4000);
		metodo.click(elemento.getBtnMasterCard());
		Thread.sleep(2000);
		metodo.escrever(elemento.getTextNumeroCartao(), CardNum);
		metodo.escrever(elemento.getTextCVV(), CvvNum);
		Thread.sleep(2000);
		metodo.screenShot("EVD 23 - Campos de cartao preenchidos");
		metodo.escrever(elemento.getTextNomeCartao(), Pnome);
		Thread.sleep(4000);
		metodo.click(elemento.getBtnPayNow());
		Thread.sleep(2000);
		metodo.screenShot("EVD 24 - Compra com Cartao de credito efetuada com sucesso");

	}
}
