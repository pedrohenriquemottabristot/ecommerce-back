# E-commerce API

API REST desenvolvida em Spring Boot para gerenciamento de um sistema de e-commerce, incluindo funcionalidades de gerenciamento de usuários, produtos, pedidos, pagamentos e categorias.

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- Spring Validation
- Spring Actuator
- PostgreSQL
- H2 Database (Desenvolvimento)
- Lombok
- Maven

## 📋 Estrutura do Projeto

O projeto está organizado nas seguintes camadas:

```
src/main/java/com/senai/ecommerce/
├── controllers/     # Controladores REST
├── dtos/           # Objetos de Transferência de Dados
├── entities/       # Entidades JPA
├── repository/     # Repositórios JPA
└── service/        # Camada de Serviços
```

## 🚀 Funcionalidades

### Usuários
- CRUD completo de usuários
- Gerenciamento de dados pessoais

### Produtos
- Cadastro e atualização de produtos
- Categorização de produtos
- Consulta de produtos por categoria

### Pedidos
- Criação de pedidos
- Adição de itens ao pedido
- Acompanhamento de status do pedido
- Diferentes estados: WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELLED

### Pagamentos
- Processamento de pagamentos
- Integração com pedidos
- Registro de transações

### Categorias
- Gerenciamento de categorias de produtos
- Organização do catálogo

## 💻 Como Executar

### Pré-requisitos
- Java 17
- Maven
- PostgreSQL (Produção)

### Passos para Execução

1. Clone o repositório:
```bash
git clone https://github.com/dacasfilipe/ecommerce-aula.git
```

2. Navegue até o diretório do projeto:
```bash
cd ecommerce-aula
```

3. Execute o projeto com Maven:
```bash
mvn spring-boot:run
```

Por padrão, a aplicação iniciará em `http://localhost:8080`

### Perfis de Execução

- **Desenvolvimento**: Utiliza banco H2 em memória
- **Produção**: Utiliza PostgreSQL

## 📚 Documentação da API

A documentação completa dos endpoints está disponível através da collection do Postman incluída no projeto: `Ecommerce API.postman_collection.json`

### Principais Endpoints

#### Usuários
- `GET /users` - Lista todos os usuários
- `POST /users` - Cria novo usuário
- `GET /users/{id}` - Busca usuário por ID
- `PUT /users/{id}` - Atualiza usuário
- `DELETE /users/{id}` - Remove usuário

#### Produtos
- `GET /products` - Lista todos os produtos
- `POST /products` - Cadastra novo produto
- `GET /products/{id}` - Busca produto por ID
- `PUT /products/{id}` - Atualiza produto
- `DELETE /products/{id}` - Remove produto

#### Pedidos
- `GET /orders` - Lista todos os pedidos
- `POST /orders` - Cria novo pedido
- `GET /orders/{id}` - Busca pedido por ID
- `PUT /orders/{id}` - Atualiza pedido

#### Pagamentos
- `POST /payments` - Registra novo pagamento
- `GET /payments/{id}` - Busca pagamento por ID

#### Categorias
- `GET /categories` - Lista todas as categorias
- `POST /categories` - Cria nova categoria
- `GET /categories/{id}` - Busca categoria por ID

## 🔧 Configuração

As configurações da aplicação podem ser ajustadas através do arquivo `application.properties` para diferentes ambientes de execução.

## 🤝 Contribuição

1. Faça o fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request
