#language: pt
#Author: pedrolucapuzzoni@gmail.com

@Executa @Cadastro
Funcionalidade: Login e Cadastro
  Eu como usuario quero efetuar o cadastro para logar no site
   
  Fundo: Acessar o site da loja Advantage
  Dado que eu esteja no site "http://advantageonlineshopping.com/#/"
  
   
 @CAD_01      
  Cenario: Cadastro da conta
    Quando  preencher o formulario
    Entao fecho o navegador
    
    
 @CAD_02
  Cenario: Enviar formulario de cadastro com usuario ja existente
    Quando  preencher o formulario com usuario ja existemte
    Entao valido as informacoes de erro do cadastro
    
 @CAD_03
  Cenario: Enviar formulario de cadastro com email invalido
    Quando  preencher o formulario com email invalido
    Entao valido as informacoes de erro do cadastro
    
 @L_01
  Cenario: Login do usuario
    Quando preencher o campo de login e senha
    Entao valido se esta logado
    
 @L_02
  Cenario: Login error por credenciais incorretas e/ou nao cadastradas
    Quando preencher o campo de login e senha erradas
    Entao fecho o browser
    