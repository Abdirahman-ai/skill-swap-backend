# SkillSwap Backend

Spring Boot API for managing users, skills, and skill-sharing sessions.

## 🛠 Tech Stack

- Java 21
- Spring Boot
- PostgreSQL
- Spring Data JPA
- MapStruct
- Lombok

## 🧩 Dependencies

This project uses the following Spring Boot starters and libraries:

- `spring-boot-starter-web` – For building RESTful APIs
- `spring-boot-starter-data-jpa` – For database interaction using JPA
- `spring-boot-devtools` – For live reload during development
- `postgresql` – As the relational database
- `mapstruct` – For mapping between entities and DTOs
- `lombok` – To reduce boilerplate code (getters/setters/constructors)


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

