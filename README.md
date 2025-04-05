# SkillSwap Backend

Spring Boot API for managing users, skills, and skill-sharing sessions.

## Tech Stack
- Java 21
- Spring Boot
- PostgreSQL
- MapStruct
- Lombok

## 🚀 How to Run

1. Configure your database in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/skillswap
   spring.datasource.username=your_db_user
   spring.datasource.password=your_db_password
   spring.jpa.hibernate.ddl-auto=update

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

