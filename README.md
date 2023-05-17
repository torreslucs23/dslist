# Projeto Java Spring - Dev Superior

## Descrição 

Este projeto foi realizado em uma semana de intensivo de Java Spring, feito pela plataforma Dev Superior. O objetivo dele foi introduzir o framework, mostrando algumas funcionalidades, sua arquitetura, ecossistema, como ele se comporta utilizando banco de dados e como disponibilizar uma API.<br><br>
Foram 3 dias de projeto, passo-a-passo, na qual foi desenvolvida uma aplicação simples, com um banco de dados PostgreeSQL e algumas funcionalidades CRUD.

## Como Rodar o Projeto no Shell Linux?

### 1.
Para rodar o seu projeto, certifique-se que o Maven está instalado na sua máquina.

```
maven --version
```

Caso não tenha instalado, você pode usar o seguinte comando: 
```
sudo apt-get install maven
```

### 2 .
Em seguida, vá no diretório raíz do seu projeto, onde está localizado o arquivo pom.xml, e digite o seguinte comando:
```
mvn clean package
```
### 3.
Após fazer o passo 2, pode digitar o seguinte comando para executar o servidor do Spring Boot:
```
java -jar nome-do-arquivo.jar

```

Com esses passos, sua aplicação já irá estar rodando.


## Funcionalidades do Projeto

Esse projeto tem a função de criar uma API, com um banco de dados que contém objetos que são jogos. Ele fornecerá esses jogos pela API, juntamente com suas listas de tipos de jogos.<br>
Você pode acessar os jogos do servidor através desse link: https://dslist-production-5c09.up.railway.app/games <br>
<br>
Você pode acessar a mais detalhes de um jogo específico passando o ID: https://dslist-production-5c09.up.railway.app/games/{id} 

<br><br>
Dá para acessar as listas dos tipos de jogos usando esse link: https://dslist-production-5c09.up.railway.app/lists <br>
Se for passado um id + /games, você pode acessar todos os jogos de uma certa lista:
https://dslist-production-5c09.up.railway.app/list/{id}/games <br><br>

Por último, é permitido alterar a posição dos jogos nas listas usando um POST no mesmo link acima, passando um JSON com as seguintes propriedades, por exemplo:
``` JSON
{
    "sourceIndex":1,
    "destinationIndex": 2
}
```
## Esquema de Banco

Utilizei o esquema relacional do PostgreSQL para criar o banco de dados da minha aplicação. Aqui vai uma imagem de como ele está implementado:
<br>

<img src="https://github.com/torreslucs23/dslist/blob/main/Esquema.png" alt="Modelo de Domínio Projeto" />

Foi utilizado a tabela Games para registrar os jogos, GameList para mostrar a lista de tipos de jogos e uma tabela Belonging para fazer a relaçãod de Games e GameList.<br>

## Arquitetura do Projeto
Uma demonstração de como o código do projeto está organizado, seguindo os padrões de Clean Architeture padrões do Java Spring, mostrando um cógido mais fácil de fazer alguma manuntenção e legível.

<img src="https://github.com/torreslucs23/dslist/blob/main/Arquitetura.png" alt="Arquitetura Projeto"/>




