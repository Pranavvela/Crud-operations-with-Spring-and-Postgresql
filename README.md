# CRUD Operations with Spring Boot & PostgreSQL

This project demonstrates simple CRUD (Create, Read, Update, Delete) operations using **Spring Boot** and **PostgreSQL**, with all endpoints tested and verified using **Postman**.  
It serves as a clean and easy-to-understand starter template for building REST APIs.

## 🚀 Features
- Spring Boot REST API
- Full CRUD operations
- PostgreSQL integration using Spring Data JPA
- JSON request/response handling
- Tested using Postman

## 📦 Technologies Used
- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Postman**


## 📁 Project Setup

### 1️⃣ Clone the repository
```bash
git clone https://github.com/Pranavvela/Crud-operations-with-Spring-and-Postgresql.git
cd Crud-operations-with-Spring-and-Postgresql
````

### 2️⃣ Create PostgreSQL Database

```sql
CREATE DATABASE your_database_name;
```

### 3️⃣ Update Database Configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4️⃣ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or using wrapper:

```bash
./mvnw spring-boot:run
```

The API will be available at:

```
http://localhost:8080
```


## 🔗 API Endpoints

Replace `/items` with your actual entity name if different.

| Method | Endpoint      | Description            |
| ------ | ------------- | ---------------------- |
| GET    | `/items`      | Get all records        |
| GET    | `/items/{id}` | Get record by ID       |
| POST   | `/items`      | Create a new record    |
| PUT    | `/items/{id}` | Update existing record |
| DELETE | `/items/{id}` | Delete record by ID    |



## 🧪 Testing With Postman

You can test all CRUD operations using Postman:

1. **POST** – Send JSON body to create data
2. **GET** – Fetch all or one record
3. **PUT** – Update existing data
4. **DELETE** – Remove data by ID

Make sure the server is running before testing.


## 📂 Project Structure

src/
 ├─ main/
 │   ├─ java/
 │   │   └─ com.example/
 │   │       ├─ controller/
 │   │       ├─ service/
 │   │       ├─ repository/
 │   │       └─ entity/
 │   └─ resources/
 │       └─ application.properties
 └─ test/
pom.xml
```


## 🤝 Contributing

Feel free to fork this repository and improve it with additional features or enhancements.


## 📜 License

This project is open-source and free to use.

