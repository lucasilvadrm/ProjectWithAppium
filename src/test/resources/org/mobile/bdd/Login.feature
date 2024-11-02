#language:pt

Funcionalidade: Login

  Esquema do Cenario: Login com sucesso
    Dado que estou na tela de login
    Quando eu preencher o campo email com "<email>" e a senha com "<senha>"
    E clicar no botão de login
    Então devo ser direcionado para a tela inicial

    Exemplos:
      | email           | senha  |
      | teste@teste.com | 123456 |