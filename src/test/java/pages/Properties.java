package pages;

import java.util.Locale;
import com.github.javafaker.Faker;
import elements.WebElements;

public class Properties {
	
	// Usuario de cadastro e login

	String User = "UsuarioTest1212";

	// Email de cadastro
	// Nota de falha* e possivel criar mais de uma conta com o mesmo Email

	String Email = ("usertest@usertest.com");

	// Senha para cadastro

	String Senha = ("Password123");
	String ConfSenha = ("Password123");
	
	Metodos metodo = new Metodos();
	WebElements elemento = new WebElements();
	Faker faker = new Faker(new Locale("pt_Br"));

	int Cel = (int) faker.number().randomNumber(11, false);

	
	String Pnome = faker.name().firstName();
	String Snome = faker.name().lastName();
	String Numero = Integer.toString(Cel);
	String Cidade = faker.address().city();
	String Endereco = faker.address().streetName();
	String Estado = faker.address().cityPrefix();
	String Cep = faker.address().zipCode();
	String CardNum = "123123123123";
	String CvvNum = "1123";
	String Usuario = "SafePay123" ;

	
}
