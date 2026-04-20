When we extend JpaRepository in a Spring application, Spring Data JPA provides implementations for CRUD methods like save and find. These methods internally use JPA, which is a specification defining how Java objects should be mapped to relational databases. Hibernate acts as the JPA persistence provider, implementing these specifications by converting entity operations into SQL queries and executing them on the database.

ORM is the concept that enables this mapping between object-oriented classes and relational tables.

Controller
   ↓
Service
   ↓
Repository (JpaRepository)
   ↓
Spring Data JPA
   ↓
JPA (EntityManager)
   ↓
Hibernate
   ↓
SQL Query
   ↓
Database