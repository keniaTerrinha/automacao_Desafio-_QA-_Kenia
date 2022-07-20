#language:pt

Funcionalidade: Sign Up

  Contexto:
    Dado que estou na tela de Sing Up


  Cenario: Inscrição do tipo Contractor inválida
  Quando clico na opcao "I'm A Contractor"
  Entao clico no botao "Next"
  E Insert First Name "Kenia"
  E Insert Last Name "Olinquevicz"
  E Insert email address "kenia@gmail.com"
  E Insert Password "1234567"
  E select opcao How Did You Hear AboutDell "Google"
  E Click button Create Your Deel Account"

  @SignUp
  Cenario: Inscrição do tipo Contractor válida
    Quando clico na opcao "I'm A Contractor"
    Entao clico no botao "Next"
    E Insert First Name "Kenia"
    E Insert Last Name "Olinquevicz"
    E Insert email address "kenia@deel.com"
    E Insert Password "Keniameta6!"
    E select opcao How Did You Hear AboutDell "Google"
    E Click button Create Your Deel Account"





  Cenario: Inscrição do tipo Business inválido

    Quando clico em "I’m A Business"
    Entao clico no botao "Next"
    E Insert First Name "Alan"
    E Insert Last Name "Silva"
    E Insert email address "alan@gmail.com"
    E Insert Password "Anm1234@!"
    E select opcao How Did You Hear AboutDell "Google"
    E Click button Create Your Deel Account"








