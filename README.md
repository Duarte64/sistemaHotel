<h1 align="center">Gerenciador de Hotel</h1>
<p>Este projeto consiste em um sistema de gerenciamento de um hotel para aplicar os conhecimentos da matéria de Programação Orientada a Objetos, ministrada pelo professor Paulo Roberto Miranda Meirelles na Universidade Federal do ABC.</p>

<img src="https://img.shields.io/badge/license-MIT-green"> <img src="https://img.shields.io/github/stars/Duarte64/sistemaHotel"> <img src="https://img.shields.io/twitter/url?url=https%3A%2F%2Fgithub.com%2FDuarte64%2FsistemaHotel">

<!--ts-->
   * [Features](#Features)
   * [Pré Requisitos](#Pré-requisitos)
   * [Como Instalar](#Rodando-a-Aplicacao)
      * [Deploy Aplicação](#local-files)
      * [Executando em Servidor Local](#multiple-files)
      * [Possíveis Erros](#combo)
   * [Como Utilizar](#Como-Utilizar)
   * [Testes](#testes)
   * [Tecnologias](#tecnologias)
   * [Autor](#Autor)
<!--te-->

<h4 align="center"> 
	🚧  Sistema de Hotelaria 🏨 Em construção...  🚧
</h4>

### Features

- [x] Cadastro de Acomodações
- [x] Cadastro de Clientes
- [x] Cadastro de Reservas
- [x] Testes Automatizados
- [-] Tratamento de Erros (Em Andamento)
- [-] Responsividade (Em Andamento)

## Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java](https://nodejs.org/en/), [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html), [TomCat V9.0](https://tomcat.apache.org/download-90.cgi).

Além disto é bom ter um editor de código como o [Eclipe EE](https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-ee-developers).

## Como Instalar

### Clone este repositório
$ git clone <https://github.com/Duarte64/sistemaHotel.git>

### O servidor inciará na porta:8080 - acesse <http://localhost:8080> 

## Como Utilizar

Para utilizar a ferramenta, realize os seguintes passos:

### Realize o Cadastro de Clientes 
É possível realizar quantos cadastros quiser. Após feito, você será redirecionado para a página de listagem de clientes, onde é possível consultar todos os cadastros, com a possibilidade de alterar as informações ou deletar os registros que julgar necessário.

### Realize o Cadastro de Acomodações
Definindo o seu respectivo tipo (Simples, Padrão e Luxo); É possível realizar quantos cadastros quiser. Após feito, você será redirecionado para a página de listagem de acomodações, onde é possível consultar todos os cadastros, com a possibilidade deletar os registros que julgar necessário.

### Registre Reservas. 
Será necessário unir um Cliente (com seu número de CPF) a uma Acomodação (pelo seu ID). Você deve definir a data de check-in e de check-out. Se o cadastro for bem sucessido e não for encontrado nenhum erro, você será redirecionado para a página de listagem de Reservas, onde irá mostrar as informações da reserva, a quantidade de dias da estadia e o valor da mesma.

### Observações
Ao consultar as reservas, você pode solicitar os diferentes serviços disponíveis para cada tipo de acomodação.
- As reservas de Acomodação Simples não possuem nenhum serviço adicional.
- As reservas de Acomodação Simples e Luxo tem os adicionais de Serviço de Quarto e Solicitar Refeição.
- A Acomodação de Luxo é a única que possui Serviço de Praia.
Ao solicitar um serviço, será exibida uma mensagem na tela. Se atente ao texto escrito, é possível reparar que para diferentes tipo de acomodação, o texto muda.

## 👷⚙ Testes

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- HTML5
- CSS3

## 💻 Autor

### Gabriel Duarte 🧑‍💻
### Feito com ❤️ por Gabriel Duarte 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Gabriel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/gabriel-duarte-da-paz-figueiredo-3aaa35197/)](https://www.linkedin.com/in/gabriel-duarte-da-paz-figueiredo-3aaa35197/) 
[![Gmail Badge](https://img.shields.io/badge/-gabriel.duartepaz@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:gabriel.duartepaz@gmail.com)](mailto:gabriel.duartepaz@gmail.com)
