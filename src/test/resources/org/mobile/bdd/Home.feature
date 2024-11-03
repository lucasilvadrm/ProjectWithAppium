#language:pt

Funcionalidade: Home

  Contexto: Como usuário de aplicativo desejo visualizar a home após ter realizado login no app.

  Cenario: Visualizar tela home após login
    Dado que estou logado no app
    Entao devo visualizar o texto "Lojas"

  Esquema do Cenário: Verificar funcionamento da barra de pesquisa
    Dado que estou logado no app
    Quando eu pesquisar pelo termo "<termo>"
    Entao devo visualizar o resultado da pesquisa

    Exemplos:
      | termo      |
      | Pastelaria |

  Esquema do Cenário: Visualizar seleção de endereço
    Dado que estou logado no app
    Quando eu clicar no botão de seleção de endereço
    Entao devo visualizar um modal solicitando minha permissão para acessar a localização
    E devo visualizar a mensagem "<mensagem>"

    Exemplos:
      | mensagem                       |
      | Podemos pegar sua localização? |

  @important
  Cenario: Permitir acesso a localização
    Dado que estou logado no app
    Quando eu permitir o acesso a localização
    Entao devo visualizar o endereço atual na tela