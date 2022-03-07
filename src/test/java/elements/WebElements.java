package elements;

import org.openqa.selenium.By;

public class WebElements {
	
	//Elementos Web
	
	private By User = By.name("usernameRegisterPage");
	private By Email = By.name("emailRegisterPage");
	private By Senha = By.name("passwordRegisterPage");
	private By ConfSenha = By.name("confirm_passwordRegisterPage");
	private By Pnome = By.name("first_nameRegisterPage");
	private By Snome = By.name("last_nameRegisterPage");
	private By Numero = By.name("phone_numberRegisterPage");
	private By Cidade = By.name("cityRegisterPage");
	private By Endereco = By.name("addressRegisterPage");
	private By Estado = By.name("state_/_province_/_regionRegisterPage");
	private By Cep = By.name("postal_codeRegisterPage");
	private By btnPais = By.name("countryListboxRegisterPage");
	private By btnPais1 = By.cssSelector("option[label='Brazil']");
	private By btnAgree = By.name("i_agree");
	private By btnRegistro = By.id("register_btnundefined");
	private By btnUser = By.cssSelector("#menuUserLink");
	private By btnCadastro = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By btnSign = By.id("sign_in_btnundefined");
	private By LoginSucessful = By.cssSelector("span[class='hi-user containMiniTitle ng-binding']");
	private By Login = By.name("username");
	private By Password = By.name("password");
	private By UsuarioRegistrado = By.cssSelector("label[data-ng-show='!registerSuccess']");
	private By MsgEmailInv = By.cssSelector("#formCover > div:nth-child(1) > div:nth-child(2) > sec-view:nth-child(2) > div > label");
	private By BtnLaptop = By.id("laptopsTxt");
	private By BtnProdutoLaptop = By.xpath("//*[@id='7']");
	private By BtnSaveToCart = By.name("save_to_cart");
	private By BtnSignOut = By.cssSelector("#loginMiniTitle > label:nth-child(3)");
	private By BtnTablets = By.id("tabletsTxt");
	private By BtnProdutoTablet = By.xpath("//*[@id='18']");
	private By BtnCarrinho = By.xpath("/html/body/header/nav/ul/li[2]");
	private By BtnCheckout = By.id("checkOutButton");
	private By BtnNext = By.id("next_btn");
	private By BtnMasterCard = By.name("masterCredit");
	private By TextNumeroCartao = By.name("card_number");
	private By TextCVV = By.name("cvv_number");
	private By TextNomeCartao = By.name("cardholder_name");
	private By BtnPayNow = By.id("pay_now_btn_ManualPayment");
	private By TextSafePayNome = By.name("safepay_username");
	private By TextSafePaySenha = By.name("safepay_password");
	private By BtnPayNowSafePay = By.id("pay_now_btn_SAFEPAY");
	private By ValidateTextOrder = By.xpath("//*[@id='orderPaymentSuccess']/h2/span");
	
	
	
	
	
	
	 //Metodos Publicos dos Elementos
	
	public By getUsuarioRegistrado() {
		return UsuarioRegistrado;
	}

	public By getLogin() {
		return Login;
	}

	public By getPassword() {
		return Password;
	}

	public By getLoginSucessful() {
		return LoginSucessful;
	}
	
	public By getBtnSign() {
		return btnSign;
	}

	public By getUser() {
		return User;
	}
		
	public By getBtnUser() {
		return btnUser;
	}
	public By getBtnCadastro() {
		return btnCadastro;
	}
	public By getBtnAgree() {
		return btnAgree;
	}
	public By getBtnRegistro() {
		return btnRegistro;
	}
	public By getBtnPais() {
		return btnPais;
	}
	public By getBtnPais1() {
		return btnPais1;
	}

	public By getEmail() {
		return Email;
	}
	public By getSenha() {
		return Senha;
	}
	public By getConfSenha() {
		return ConfSenha;
	}
	public By getPnome() {
		return Pnome;
	}
	public By getSnome() {
		return Snome;
	}
	public By getNumero() {
		return Numero;
	}
	public By getCidade() {
		return Cidade;
	}
	public By getEndereco() {
		return Endereco;
	}
	public By getEstado() {
		return Estado;
	}
	public By getCep() {
		return Cep;
	}

	public By getBtnLaptop() {
		return BtnLaptop;
	}

	public By getBtnProdutoLaptop() {
		return BtnProdutoLaptop;
	}

	public By getBtnSaveToCart() {
		return BtnSaveToCart;
	}

	public By getMsgEmailInv() {
		return MsgEmailInv;
	}

	public By getBtnSignOut() {
		return BtnSignOut;
	}

	public By getBtnTablets() {
		return BtnTablets;
	}

	public By getBtnProdutoTablet() {
		return BtnProdutoTablet;
	}

	public By getBtnCarrinho() {
		return BtnCarrinho;
	}

	public By getBtnCheckout() {
		return BtnCheckout;
	}

	public By getBtnNext() {
		return BtnNext;
	}

	public By getBtnMasterCard() {
		return BtnMasterCard;
	}

	public By getTextNumeroCartao() {
		return TextNumeroCartao;
	}

	public By getTextCVV() {
		return TextCVV;
	}

	public By getTextNomeCartao() {
		return TextNomeCartao;
	}

	public By getBtnPayNow() {
		return BtnPayNow;
	}

	public By getTextSafePayNome() {
		return TextSafePayNome;
	}

	public By getTextSafePaySenha() {
		return TextSafePaySenha;
	}

	public By getBtnPayNowSafePay() {
		return BtnPayNowSafePay;
	}

	public By getValidateTextOrder() {
		return ValidateTextOrder;
	}

	

}