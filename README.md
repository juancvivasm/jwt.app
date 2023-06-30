# API: Autenticación con JWT

![SpringBoot](https://img.shields.io/badge/SpringBoot-3.1.0-green)
![JAVA](https://img.shields.io/badge/JAVA-17-blue)
![MySQL](https://img.shields.io/badge/MySQL-yellow)
![JPA](https://img.shields.io/badge/JPA-yellow)

Este proyecto demuestra una implementación básica de seguridad usando Spring Boot 3.0 y JSON Web Tokens (JWT).

Es importante señalar, que el desarrollo es parte del curso: [Spring Framework & Spring Boot desde cero a experto](https://www.udemy.com/course/spring-framework-5/).

## Características

- Inicio de sesión con autenticación JWT.
- Cifrado de contraseña usando BCrypt.
- Autorización basada en roles con Spring Security.

## Inicio 

Para compilar y ejecutar el proyecto:
1. Clone el repositorio: git clone https://github.com/juancvivasm/jwt.app.git
2. Navegue al directorio del proyecto: cd jwt.app
3. Agregue la base de datos a MySQL y defina las variables de entorno o reemplace en el archivo `application.properties` para 
    conectarse a la base de datos Ej.:
   - MYSQL_USER=jhon
   - MYSQL_PASSWORD=12345
   - MYSQL_DB=db_springboot
   - MYSQL_PORT=3306
4. Ejecute el proyecto

## Endpoints:

| Methods | Requests                           | Query Params                                                                        |
|---------|------------------------------------|-------------------------------------------------------------------------------------|
| POST    | http://localhost:8080/api/login    | <code> { <br>&nbsp;"username": "admin", <br>&nbsp;"password": "12345" <br>} </code> |
| GET     | http://localhost:8080/api/clients  |                                                                                     |