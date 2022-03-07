#language: pt
#Author: pedrolucapuzzoni@gmail.com

@Executa @Consulta
Funcionalidade: Consulta e compra de produtos
  Eu como usuario quero efetuar uma consulta e comprar um produto do site
   
  Fundo: Acessar o site da loja Advantage
  Dado que eu esteja no site "http://advantageonlineshopping.com/#/"
  
   
 @CONS_01     
  Cenario: 	Consultar laptop
    Quando logo no site e consulto laptop
    Entao efetuo o logout e fecho o navegador

 @CONS_02     
  Cenario: 	Consultar tablet
  
    Quando  Logo no site e consulto tablet
    Entao efetuo o logout e fecho o navegador
    
 @COMP_01  
  Cenario: 	Comprar laptop
    Quando  Logo no site e adiciono laptop no carrinho
    Entao faco a compra com SafePay e depois efetuo logout
    
 @COMP_02  
  Cenario: 	Comprar tablet
    Quando  Logo no site e adiciono tablet no carrinho
    Entao faco a compra com Cartao de credito e depois efetuo logout