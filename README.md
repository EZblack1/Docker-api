# DOCKER-API

API REST para gerenciamento de usuários, desenvolvida com Spring Boot.

## Funcionalidades

- Criar usuário: `POST /users`
- Listar usuários: `GET /users`
- Buscar usuário por ID: `GET /users/{id}`
- Atualizar usuário: `PUT /users/{id}`
- Remover usuário: `DELETE /users/{id}`

## Como executar

1. **Build do projeto**
   ```sh
   ./mvnw clean package

   ```markdown
# James API

API REST para gerenciamento de usuários, desenvolvida com Spring Boot.

## Funcionalidades

- Criar usuário: `POST /users`
- Listar usuários: `GET /users`
- Buscar usuário por ID: `GET /users/{id}`
- Atualizar usuário: `PUT /users/{id}`
- Remover usuário: `DELETE /users/{id}`

## Como executar

1. **Build do projeto**
   ```sh
   ./mvnw clean package
   ```
2. **Subir com Docker Compose**
   ```sh
   docker compose up --build
   ```

A aplicação estará disponível em: [http://localhost:5000](http://localhost:5000)

## Documentação

Acesse o Swagger UI para testar os endpoints:
- http://localhost:5000/swagger-ui.html
- ou [http://localhost:5000/swagger-ui/index.html](http://localhost:5000/swagger-ui/index.html)

