# Customer and Loan Management Project

## Description
This project demonstrates a Many-to-One relationship between Customer and Loan entities using JPA and Hibernate, where multiple loans can be associated with a single customer. CRUD operations on loans will be reflected under each respective customer.

## Features
- **Many-to-One Relationship**: Defines a relationship where multiple loans relate to a single customer.
- **CRUD Operations**: Provides full Create, Read, Update, and Delete operations on both Customer and Loan entities.

## Technologies Used
- **Java**
- **JPA (Java Persistence API)**
- **Hibernate ORM**
- **MySQL (or any other relational database)**
- **Maven** for dependency management

## Project Structure
- **Entity Classes**: Contains Customer and Loan entities with `@ManyToOne` and `@JoinColumn` annotations to define relationships.
- **DAO Classes**: Includes methods to perform CRUD operations, ensuring that changes in loans are tied to the associated customer.

## Annotations and APIs Used
- `@ManyToOne`: Establishes a Many-to-One relationship from Loan to Customer.
- `@JoinColumn`: Specifies the foreign key column in the Loan table that links to the Customer entity.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Shubham-Patil30/JPA-Hibernate-ManyToOne-Customer-Loan-App.git
   cd customer-loan-management
