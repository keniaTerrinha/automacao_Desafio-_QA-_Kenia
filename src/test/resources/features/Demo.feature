#language:pt
Funcionalidade: Demo

  Contexto:

  @Demo
  Cenario: Capiturar o titulo de todos os tópicos fechados da pagina Demo

    Dado que acesso o site Demo
   E clico na opção Demo disponível no menu principal
   Quando faco o scroll até o final da página
  Então imprimo o título de todos os tópicos fechados

  E imprimo a Quantidade de itens de cada categoria e dos que não possui categoria
  E imprimo o título do tópico que contém o maior número de views












