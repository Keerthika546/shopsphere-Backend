# ShopSphere (Backend) – Spring Boot REST API

ShopSphere is a backend REST API project built using **Java** and **Spring Boot**.
The project currently focuses on user management and RESTful API development.

## Tech Stack
- Java
- Spring Boot
- Maven
- REST APIs, HTTP, JSON
- Postman
- GitHub

## Features (Current)
- Create User API
- Get User by ID API
- Basic health check endpoint

## API Endpoints

### Health Check
- GET `/hello`

### User APIs
- POST `/users`
- GET `/users/{id}`

## Sample Request

### Create User
POST `http://localhost:8080/users`

```json
{
  "name": "Keerthika",
  "email": "keerthika@gmail.com",
  "password": "1234",
  "phone": "9999999999"
}
