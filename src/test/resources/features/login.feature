#language:pt
Funcionalidade: Login

  Contexto:
    Dado que estou na tela de Login
  @link
  Cenario: Na tela de login clicar no link Sign Up

    Quando for realizado um clique em Sign Up
    Então A tela de Login sera redirecionada para tela Sign Up


  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |

    Quando for realizado um clique no botao Log in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | email          | password |
      | campos obrigatorios | kenia@deel.com | Keniameta6!|

  @LoginInvalido
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro campo email

    Exemplos:
      | identificacao    | email           | password   |
      | email invalido | kenia@gmail.com | Keniameta6!|


  @LoginInvalido
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro campo password

    Exemplos:
      | identificacao    | email           | password   |
      | senha invalida   | kenia@deel.com  | invalido   |

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro campos obrigatorios vazios

    Exemplos:
      | identificacao                  | email          | password   |
      | email e passord em branco      |                |            |



  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro campo email

    Exemplos:
      | identificacao        | email          | password   |
      | email em branco      |                | Keniameta6!|

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | Email address| <email>    |
      | password     | <password> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro para campo password

    Exemplos:
      | identificacao        | email           | password   |
      | password em branco   | kenia@gmail.com |            |











