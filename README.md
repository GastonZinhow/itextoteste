
# api devall

Desafio técnico proposto pela itexto em que seria necessário criar 2 requisições GET


## Linha de raciocínio

Conforme discutido na entrevista os sistemas que a empresa desenvolveu recebem milhões de requisições diariamente então
optei por utilizar um banco de dados não relacional (NoSQL), o MongoDB. Como muitas
requisições seriam feitas e o banco de dados seria alterado constantemente escolhi o
NoSQL, para essa tarefa ele terá um escalamento e desempenho melhor do que o SQL, tendo
um custo computacional menor do que um banco de dados relacionais por exemplo, 
além de possuir uma evolução horizontal em vez da vertical. Escolhi o MongoDB, 
pois é o banco de dados 
não relacional que possuo maior afinidade, por mais que no próprio desafio estivesse
presente o MySQL.

Criei as collections Posts com as informações do Posts e outra Performance para salvar
os clicks, a minha ideia foi assim que houvesse uma requisição que acionaria o clique, o 
mesmo pegaria o ID do post e aumentaria um (1) clique e salvaria no BD.

Construí a API aplicando meus conhecimento em Spring e as queries com os 
conhecimentos em MongoDB.

O que eu mais aprendi nesse projeto foi a persistência, pois no 
começo minhas queries não estavam dando certo para retornar os Posts em 
datas de publicação de forma decrescente (ou descendente) então tive que ir 
a fundo na documentação do MongoDB com Spring, além disso dei uma pequena estudada
para saber como funcionaria a composição da imagem do banco de dados no Docker.

## Futuras mudanças
Durante o desenvolvimento identifiquei algumas mudanças que seriam positivas.
Enquanto estava criando a classe Performance foi que ela poderia ter atributos como
data, assim teria um controle melhor de qual e quando algum Post teve bastante sucesso, além de conseguir
o retorno de tráfego no site, o que poderia ser interessante para a empresa.
Os IDs seriam String em vez de INT para não ter problemas de repetição, ou até mesmo
de limite de memória, que acontece quando utilizamos Inteiros muito altos.

## Documentação da API

#### Buscando posts

```http
GET /api/v2/post 

```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `titlesearch` | `string` | Procura post por semelhança com titulo ou sumário |

• Retorna uma lista de posts com os títulos ou sumários que possuem a palavra-chave.
#### Click e URL

```http
 GET /post/clique/{id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `id` | **Obrigatório**. O ID do post que você quer acessar |

#### 

• Registra o clique no link.

• Retorna a URL que representa o link para, aí sim, ser acessada diretamente.



## Uso do docker

```
docker-compose up
```


## Stack utilizada

**Back-end:** Java, SpringBoot

**Banco de dados:** MongoDB

