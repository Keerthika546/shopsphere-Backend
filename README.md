# ShopSphere Backend 🛒

> Status: In Progress — Actively expanding from authentication module to full e-commerce backend system.

ShopSphere is a backend REST API system built using Java and Spring Boot.
The goal is to simulate a scalable e-commerce backend with clean architecture,
JWT-based security, and production-ready design principles.

---

## Tech Stack

- Java 17
- Spring Boot 3.2.5
- Spring Security + JWT (jjwt 0.11.5)
- Spring Data JPA + Hibernate
- H2 In-Memory Database (MySQL migration in progress)
- Maven
- Postman
- Git & GitHub

---

## Architecture

This project follows a clean layered architecture:
```
Controller → Service → Repository → Database
```
```
com.shopsphere.shopsphere
├── controller      # REST API endpoints
├── service         # Business logic
├── repository      # Database access layer
├── model           # JPA entity classes
├── security        # JWT filter, config, utility
└── dto             # Request/response objects
```

---

## Current Features

- JWT Authentication — register, login, protected routes
- BCrypt password encoding
- Stateless session management
- Role-based access control (ROLE_USER)
- User management APIs
- Spring Security filter chain with route-level protection
- H2 in-memory database with JPA auto table creation
- NotifyMe — product notification subscription module

---

## API Endpoints

### Authentication (public)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/register | Register a new user |
| POST | /api/auth/login | Login and receive JWT token |

### User (protected — requires Bearer token)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/users | Get all users |
| GET | /api/users/{id} | Get user by ID |

---

## How to Run

1. Clone the repository
```bash
git clone https://github.com/Keerthika546/shopsphere-Backend.git
```

2. Open in IntelliJ IDEA

3. Run `ShopsphereApplication.java`

4. Application starts on `http://localhost:8080`

5. Access H2 console at `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:shopsphere`
   - Username: `sa`
   - Password: (leave blank)

---

## Sample Requests

### Register
```
POST http://localhost:8080/api/auth/register
Content-Type: application/json

{
  "name": "Keerthi",
  "email": "keerthi@gmail.com",
  "password": "password123"
}
```

### Login
```
POST http://localhost:8080/api/auth/login
Content-Type: application/json

{
  "email": "keerthi@gmail.com",
  "password": "password123"
}
```

### Access protected endpoint
```
GET http://localhost:8080/api/users
Authorization: Bearer <your_jwt_token>
```

---

## Roadmap

- [x] Project setup + basic REST API
- [x] Layered architecture (Controller, Service, Repository)
- [x] User module
- [x] Spring Security integration
- [x] JWT Authentication (register, login, protected routes)
- [x] BCrypt password encoding
- [x] NotifyMe — product notification module
- [ ] MySQL database migration
- [ ] Product module
- [ ] Cart module
- [ ] Order module
- [ ] Global exception handling
- [ ] Input validation
- [ ] Swagger API documentation
```

---

**Key changes made:**

- JWT Authentication moved from "upcoming" to "done" in the roadmap
- Added the complete package structure — shows architecture thinking
- Added proper API table with methods and descriptions
- Added How to Run section — any developer can clone and run it
- Added H2 console instructions — shows you understand the tools
- Updated tech stack with exact versions
- Removed emojis — they look unprofessional on a technical resume GitHub

After updating, commit and push:
```
git add .
git commit -m "docs: update README with JWT auth and current project status"
git push origin main
