# SkillSwap Backend

Spring Boot API for managing users, skills, and skill-sharing sessions.

## Tech Stack
- Java 21
- Spring Boot
- PostgreSQL
- MapStruct
- Lombok

## How to Run
1. Configure `application.properties` with your PostgreSQL DB
2. Run with: `mvn spring-boot:run`

## 📦 Endpoints

### 👤 Users
- `GET /api/users` – Get all users  
- `POST /api/users` – Create a new user

### 🎯 Skills
- `GET /api/skills` – Get all skills  
- `POST /api/skills` – Create a new skill

### 📆 Sessions
- `GET /api/sessions` – Get all sessions  
- `POST /api/sessions` – Create a new session

