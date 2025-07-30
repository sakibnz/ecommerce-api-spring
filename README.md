# **🛒 ecommerce-api-spring**

A backend RESTful API built with **Spring Boot** to power an e-commerce platform. This project uses the **Repository Pattern** for database operations, integrates **.env files** for environment-specific configuration, and uses **Retrofit** for consuming third-party APIs.

## **🚀 Features**

* ✅ **Spring Boot REST API**: Exposes API endpoints.  
* 🔐 **Secure Configuration**: Manages environment-specific settings using .env files (via dotenv support).  
* 🔁 **Retrofit Integration**: Seamlessly interacts with external APIs.  
* 🗃️ **Repository Pattern**: Ensures clean and organized database access.  
* 🧪 **Testable & Extensible**: Designed for easy testing and future enhancements.  
* 📦 **Modular & Maintainable**: Structured for clarity and long-term upkeep.

## **📁 Project Structure**

ecommerce-api-spring/  
├── src/  
│   ├── main/  
│   │   ├── java/com/nxsakib/ecommercespring/  
│   │   │   ├── configurations/       \# Retrofit and other configs  
│   │   │   ├── controllers/          \# REST controllers (Category, Product)  
│   │   │   ├── dtos/                 \# DTOs for API responses and inputs  
│   │   │   ├── entities/             \# JPA entities  
│   │   │   ├── gateways/  
│   │   │   │   ├── api/              \# Retrofit interfaces  
│   │   │   │   └── \*Gateway.java     \# Gateway implementations  
│   │   │   ├── mappers/              \# DTO \<-\> Entity mappers  
│   │   │   ├── repositories/         \# Spring Data repositories  
│   │   │   ├── services/             \# Interfaces and implementations  
│   │   │   └── EcommerceSpringApplication.java  
│   ├── resources/  
│   │   ├── application.properties  
│   │   ├── static/  
│   │   └── templates/  
├── .env                              \# Environment variables  
├── build.gradle  
├── .gitignore  
└── README.md

## **📦 Dependencies**

* **Spring Boot**: Core framework for building the application.  
* **Spring Data JPA**: For simplified data access with JPA repositories.  
* **Retrofit2**: A type-safe HTTP client.  
* **dotenv-java**: For loading environment variables from .env files.  
* **MySQL Driver**: To connect with MySQL Database  
* **Lombok**: Reduces boilerplate code (e.g., getters, setters, constructors).
