### This is a project that CREATES READS UPDATES AND DELETES DATA
Connected to Postgres database locally

One of the few applications in java that seeds ROLES once the application starts
Robust

And this is the structure for all my springboot projects
Controller ---> handles HTTP requests and responses
DTO ----> Only expose what is needed to APIs
Entity ----> domain models, also called JPA entities
Repository ----> interfaces to talk to the database
service -----> interface, and implementations clean code
mapper ----> converts between entity and DTO (using mapstruct)
exceptions ----> custom exceptions and handlers
config -----> configuration classes, security, CORS
util ------> utility/helper classes
Payload -----> for API responses


User Entity Implemented basic CRUD in springboot
Employee Entity delved deeply into proper useful RESTful API


Here's a detailed and professional `README.md` file for your Spring Boot project that seeds roles into the database on application startup using best practices like constructor injection, `CommandLineRunner`, and JPA repositories.

---

````markdown
# Spring Boot Employee Management System

## 🚀 Overview

This is a robust **Spring Boot-based Employee Management System** built with best practices and modern Java architecture. It supports full CRUD operations for employees, and features an integrated **Role-Based Access Control (RBAC)** system using the `@ManyToMany` relationship between `Employee` and `Role`.

Roles are automatically seeded into the database on application startup using a custom **RoleSeeder** component.

---

## 🔧 Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Lombok
- H2 / PostgreSQL / MySQL (any JPA-compatible DB)
- MapStruct for mapping entities to DTOs
- Jakarta Persistence (JPA)
- VSCODE and LINUX

---

## 📌 Key Features

### ✅ Employee Management
- Create, update, partially update, delete (soft & hard), and list employees.
- Duplicate checks for email and phone number using efficient repository calls.

### ✅ Role-Based Access Control (RBAC)
- Supports roles: `ROLE_ADMIN`, `ROLE_EXECUTIVE`, `ROLE_THIRDPARTY`.
- Roles are modeled as an entity and stored in the `employeeroles` table.
- Employees are linked to roles via a `@ManyToMany` relationship.
- A join table `employee_roles` manages this relationship.

### ✅ Automatic Role Seeding
- On application startup, the `RoleSeeder` component seeds the predefined roles using the `EmployeeRoleName` enum.
- Only non-existing roles are seeded to prevent duplication.

---

## 🧠 Database Model

### Employee Table (`dataemployees`)
| Field       | Type     | Description                  |
|-------------|----------|------------------------------|
| id          | Long     | Primary key                  |
| firstName   | String   | Required                     |
| lastName    | String   | Required                     |
| email       | String   | Required, Unique             |
| phoneNumber | String   | Required, Unique             |
| salary      | Double   | Required                     |
| status      | Enum     | ACTIVE or DELETED INACTIVE   |

### Role Table (`employeeroles`)
| Field     | Type             | Description         |
|-----------|------------------|---------------------|
| id        | Long             | Primary key         |
| roleName  | EmployeeRoleName | Unique Enum field   |

### Join Table (`employee_roles`)
This table is automatically created by JPA to manage the many-to-many link between `Employee` and `Role`.

---

## 🧪 Example Role Seeder

```java
@Component
@RequiredArgsConstructor
public class RoleSeeder implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {
        for (EmployeeRoleName roleName : EmployeeRoleName.values()) {
            if (!roleRepository.existsByRoleName(roleName)) {
                Role role = Role.builder()
                        .roleName(roleName)
                        .build();
                roleRepository.save(role);
                System.out.println("Seeded role: " + roleName);
            }
        }
    }
}
````

> 🔐 This uses constructor injection (`@RequiredArgsConstructor`) and only seeds roles not already present.

---

## 📦 DTO & Mapping

* DTOs are used to decouple entity and API layers.
* `EmployeeMapper` uses MapStruct for conversion:

  * Converts request DTO → Entity
  * Converts Entity → Response DTO (includes mapping roles to enum set)

---

## 📁 Folder Structure

```
com.practice.springcrud
├── config
│   └── RoleSeeder.java
├── controller
├── dto
│   ├── EmployeeRequestDto.java
│   ├── EmployeeResponseDto.java
├── entity
│   ├── Employee.java
│   ├── Role.java
│   └── EmployeeRoleName.java
├── mapper
│   └── EmployeeMapper.java
├── repository
│   ├── EmployeeRepository.java
│   └── RoleRepository.java
├── service
│   └── EmployeeServiceImpl.java
```

---

## 🎯 How to Run

1. Clone the repo.
2. Set up your DB (or use H2 in-memory for testing).
3. Run with:

   ```bash
   ./mvnw spring-boot:run
   ```
4. Check the console to verify role seeding.

---

## ✅ Best Practices Implemented

* Constructor-based dependency injection
* DTO pattern for clean API boundaries
* Centralized exception handling
* Soft deletes with `@Transactional`
* Proper seeding using `CommandLineRunner`
* Enum-based role enforcement with `ROLE_` prefix for Spring Security compatibility
* Efficient DB usage with minimal hits

---

## 📚 References

* [Spring Data JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [MapStruct Documentation](https://mapstruct.org/documentation/stable/)
* [Baeldung on Role Seeding](https://www.baeldung.com/spring-data-new-entity)

---

## 🙌 Contributing

Pull requests are welcome. For major changes, please open an issue first.

---

## 📄 License

[MIT](LICENSE)

```

---

Let me know if you’d like this saved as a downloadable file or want help [generating API docs](f) or [writing Swagger annotations](f).
```
