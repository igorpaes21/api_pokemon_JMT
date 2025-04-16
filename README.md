<h2 align="left">API Pokémon JMT!</h2>

###

<p align="left">Este projeto é uma API REST desenvolvida em Java, utilizando o framework Spring Boot, que fornece informações sobre Pokémon. O objetivo é oferecer uma interface simples para acessar dados de Pokémon, ideal para estudos, testes ou como base para projetos maiores.<br>Minha experiência anterior como técnico em telecomunicações proporcionou-me competências valiosas, como resolução de problemas, pensamento analítico e trabalho em equipe que agora aplico no universo da programação.</p>

###

<h2 align="left">Tecnologias Utilizadas</h2>

###

<div align="left">
  <img src="https://skillicons.dev/icons?i=java" height="40" alt="java logo"  />
  <img width="12" />
  <img src="https://skillicons.dev/icons?i=spring" height="40" alt="spring logo"  />
  <img width="12" />
  <img src="https://skillicons.dev/icons?i=maven" height="40" alt="apachemaven logo"  />
</div>

###

<p align="left">Java: Linguagem principal do projeto.<br><br>Spring Boot: Framework para criação de aplicações Java.<br><br>Maven: Gerenciador de dependências e build.<br><br>PokéAPI: API pública utilizada como fonte de dados sobre Pokémon.</p>

###

<h2 align="left">Estrutura do Projeto</h2>

###

<p align="left">api_pokemon_JMT/<br>├── .mvn/<br>├── src/<br>│   └── main/<br>│       └── java/<br>│           └── com/<br>│               └── jmt/<br>│                   └── pokemon/<br>│                       ├── controller/<br>│                       ├── model/<br>│                       └── service/<br>├── .gitignore<br>├── mvnw<br>├── mvnw.cmd<br>└── pom.xml</p>

###

<p align="left">controller/: Contém os controladores REST que definem os endpoints da API.<br><br>model/: Define as classes de modelo que representam os dados dos Pokémon.<br><br>service/: Implementa a lógica de negócios e integrações com APIs externas.</p>

###

<h2 align="left">Como Executar</h2>

###

<p align="left">1. Pré-requisitos:<br><br>Java 11 ou superior instalado.<br><br>Maven instalado.<br><br>2.  Clonar o repositório:<br>git clone https://github.com/igorpaes21/api_pokemon_JMT.git<br>cd api_pokemon_JMT<br><br>3. Compilar o projeto:<br>./mvnw clean install<br><br>4. Executar a aplicação:<br>./mvnw spring-boot:run<br><br>A aplicação estará disponível em http://localhost:8080.</p>

###

<h2 align="left">Endpoints Disponíveis</h2>

###

<p align="left">GET /pokemon/{id}: Retorna informações detalhadas sobre o Pokémon especificado pelo nome.<br><br>GET /pokemon: Lista todos os Pokémon disponíveis na base de dados.<br><br>POST /pokemon: Cria o pokemon com todas as informações no banco de dados.<br><br>PUT /pokemon/(id:): Atualiza as informações do pokemon no banco de dados via id.<br><br>DELETE /pokemon/(id): Deleta o pokemon do banco de dados.</p>

###

<h2 align="left">Contribuição</h2>

###

<p align="left">Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.</p>

###

<h2 align="left">Licença</h2>

###

<p align="left">Este projeto está licenciado sob a MIT License.</p>

###
