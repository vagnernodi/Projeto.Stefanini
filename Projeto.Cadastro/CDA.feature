#language: pt
#Author: vagnernodi29@gmail.com

@DESAFIO
Funcionalidade: Cadastro do Sistema
eu como usuario do sistema. desejo realizar o cadastro de novos usuarios

Contexto:
Dado que acesse o site de cadastro de usuario "http://prova.stefanini-jgr.com.br/teste/qa/"


Esquema do Cenario: cadastro de usuario
E preencher <nome>, <email> e <senha>
Quando clicar em cadastrar
Entao o sistema deve exibir mensagem de confirmacao de cadastro <mensagem>


    Exemplos: 
      | nome           |email                   | senha      |mensagem                                   |  
      |"             " |"                      "|"      "    |"         Apresentacao da tela            "|
      |"             " |"vagnernodi29@gmail.com"|"12345678"  |"  O campo nome deve ser obrigatorio      "|
      |"Vagner Franca" |"                      "|"12345678"  |"  O campo email � obrigatorio            "|
      |"Vagner Franca" |"vagnernodi29@gmail.com"|"         " |"  O campo senha � obrigatorio            "|
      |"             " |"                      "|"      "    |"todos os campos devem ser preenchidos    "|
      |"Vagner       " |"vagnernodi29@gmail.com"|"12345678 " |"Por favor insira o nome completo         "|
      |"Vagner Franca" |"vagnern               "|"12345678"  |"Por favor insira um email completo       "|
      |"Vagner Franca" |"vagnernodi29@gmail.com"|"12345    " |"A senha deve conter ao menos o caracteres"|
      |"Vagner Franca" |"vagnernodi29@gmail.com"|"12345678"  |"        Usuario Cadastrados              "|
      |"Vah Franca   " |"vah@gmail.com         "|"87654321  "|"        Usuarios Cadastrados             "|
      
     
           

Cenario: Excluir Usuario

Quando excluir um usuario
Entao o sistema deve exibir mensagem de confirmacao de exclusão





     
    