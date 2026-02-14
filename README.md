# ShopSphere-Backend 🛒

> 🚧 Status: In Progress — Expanding from user module to full e-commerce backend system.

ShopSphere is a backend REST API system built using Java and Spring Boot.  
The goal of this project is to simulate a scalable e-commerce backend with clean architecture and production-ready design principles.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Maven
- REST APIs
- JSON
- Postman
- Git

---

## 🏗 Architecture

This project follows a layered architecture:

Controller → Service → Repository (Upcoming)  

Clear separation of concerns is maintained to ensure scalability and maintainability.

---

## 📌 Current Features

- Health Check API
- Create User API
- Get User by ID API
- RESTful request/response handling

---

## 📡 API Endpoints

### Health Check
GET /hello

### User APIs
POST /users  
GET /users/{id}

---

## 📝 Sample Request

POST http://localhost:8080/users

{
  "name": "Keerthika",
  "email": "keerthika@gmail.com",
  "password": "1234",
  "phone": "9999999999"
}

---

## 🔜 Upcoming Enhancements

- MySQL database integration
- JPA/Hibernate persistence layer
- DTO pattern implementation
- Exception handling (Global)
- Input validation
- JWT Authentication
- Product & Order modules

---

## ✅ Roadmap (In Progress)

- [x] Project setup + basic REST API
- [x] User module (Create, Get by ID)
- [ ] MySQL integration + JPA/Hibernate
- [ ] Repository + Service layer separation
- [ ] DTO + Validation
- [ ] Global Exception handling
- [ ] JWT Authentication
- [ ] Product module
- [ ] Cart module
- [ ] Order module
- [ ] Swagger API documentation

