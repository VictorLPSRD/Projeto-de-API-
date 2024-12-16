# Projeto de API com Consumo de Dados Externos

Este projeto utiliza o Spring Boot para criar uma API RESTful que consome dados de uma API externa através do uso do Spring Cloud Feign. A API externa retorna informações detalhadas sobre livros em formato JSON, que são mapeadas para objetos da classe Book. O controlador REST (BookController) fornece acesso a esses dados, permitindo que os consumidores recuperem informações como título, autor, área, imagem, editora, ano de publicação e ISBN dos livros

###Funcionalidades

-Consumo de uma API externa usando Spring Cloud Feign.
-Mapeamento automático dos dados JSON usando Jackson.
-Retorno de detalhes completos dos livros no formato esperado.

--Tecnologias Utilizadas

- Spring Boot: Framework para desenvolvimento de APIs RESTful.
- Spring Cloud Feign: Cliente HTTP declarativo para consumo de APIs externas.
- Lombok: Simplificação do uso de getters, setters, construtores e toString.
- Jackson: Bibliotecas para serialização/deserialização de JSON.
- Spring Boot DevTools habilita recursos como recarga automática da aplicação durante modificações no código.
- Spring Web: fornece funcionalidades para criação de endpoints web e processamento de requisições HTTP

  ### Como Rodar o Projeto
  ## Pré-requisitos
  - JDK 8 ou superior.
  - Maven ou Gradle para gerenciamento de dependências.
 
    ├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.example.api_exemplo
│   │   │   │   ├── controles
│   │   │   │   │   └── BookController.java
│   │   │   │   ├── domain
│   │   │   │   │   └── Book.java
│   │   │   │   └── feing
│   │   │   │       └── BookCliente.java
│   │   │   └── services
│   │   │       └── BookService.java
│   │   └── resources
│   │       └── application.properties
└── README.md
