# Projeto Loja Virtual - Persistência com JPA

Este é um projeto Java que demonstra a implementação de persistência de dados usando JPA (Jakarta Persistence API) com Hibernate como provider.

## 📋 Descrição
O projeto implementa um sistema básico de loja virtual com funcionalidades de CRUD para categorias e produtos, utilizando as melhores práticas de persistência com JPA.

## 🛠 Tecnologias Utilizadas

- Java 17

- JPA (Jakarta Persistence API) 3.1.0

- Hibernate 6.2.0.Final

- Spring Data JPA 3.1.0

- MySQL 8.3.0

- Maven para gerenciamento de dependências

## 🗃 Entidades

**Categoria**

- id (Long) - Identificador único

- nome (String) - Nome da categoria

**Produto**

- **id (Long)** - Identificador único

- **nome (String)** - Nome do produto

- **descricao (String)** - Descrição do produto

- **preco (BigDecimal)** - Preço do produto

- **dataCadastro (LocalDate)** - Data de cadastro (automática)

- **categoria (Categoria)** - Relacionamento Many-to-One com Categoria

## 🔧 Configuração
  ### Banco de Dados

Configure o banco de dados MySQL no arquivo persistence.xml:

```
<property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/loja_virtual"/>
<property name="jakarta.persistence.jdbc.user" value="root"/>
<property name="jakarta.persistence.jdbc.password" value="root"/>
```
## Dependências Maven

As principais dependências estão configuradas no pom.xml:

- Hibernate Core

- Spring Data JPA

- Jakarta Persistence API

- MySQL Connector

## 🚀 Funcionalidades

**CategoriaDao**

- Cadastrar categoria

- Atualizar categoria

- Listar categoria

- Deletar categoria

- Procurar categoria por nome

**ProdutoDao**

- Cadastrar produto

- Buscar produto por ID

- Buscar todos os produtos

- Buscar produtos por nome

- Buscar produtos por categoria

Buscar preço do produto por nome
