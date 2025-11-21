# REST Users API – Spring Boot (Arquitectura en Capas)

Este proyecto implementa una API REST CRUD para gestionar usuarios (`users`) usando:

- Spring Boot 3
- Arquitectura en capas
- Spring Data JPA
- Repositorio que extiende `CrudRepository`
- Base de datos en memoria H2
- Probado fácilmente desde Postman o cURL

---

## 📁 Estructura del Proyecto
rest-users/
├─ pom.xml
├─ src/main/java/com/example/restusers/
│ ├─ RestUsersApplication.java
│ ├─ controller/UserController.java
│ ├─ model/User.java
│ ├─ repository/UserRepository.java
│ ├─ service/UserService.java
│ └─ service/impl/UserServiceImpl.java
└─ src/main/resources/
├─ application.properties
└─ data.sql (opcional)


---

## 🧩 Capas Implementadas

### ✔ Modelo (JPA)
`User.java` define la entidad con anotaciones JPA (`@Entity`, `@Table`, etc.).

### ✔ Repositorio
`UserRepository.java` extiende `CrudRepository` para acceso CRUD básico sin necesidad de código adicional.

### ✔ Servicio
Incluye:

- Interfaz (`UserService`)
- Implementación (`UserServiceImpl`)

Se encarga de la lógica de negocio.

### ✔ Controlador REST
`UserController.java` expone los endpoints REST para consumir desde Postman o cualquier cliente HTTP.

---

## 🔧 Requisitos

- Java 17+
- Maven 3+
- IDE opcional (IntelliJ, VSCode, Eclipse, etc.)

---

## ▶ Ejecución

Desde la raíz del proyecto ejecutar:

```bash
mvn spring-boot:run
