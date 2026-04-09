Spring Boot
    Spring Boot is a framework built on top of Spring that simplifies application development by providing auto-configuration, embedded servers, and minimal setup, allowing us to quickly build production-ready applications.

Why Spring Boot over Spring
    Spring Boot reduces configuration effort compared to traditional Spring by providing auto-configuration and starter dependencies. It also comes with embedded servers, so we don’t need to deploy WAR files externally.

What is Auto Configuration?
    Auto-configuration automatically configures beans based on the dependencies present in the classpath. For example, if Spring Boot detects a database dependency, it automatically configures a DataSource.

What are Starter Dependencies?
    Starter dependencies are pre-defined dependency bundles that simplify dependency management. Instead of adding multiple dependencies, we can include a single starter.
    Example: spring-boot-starter-web includes Tomcat, Spring MVC, and Jackson.

What is Embedded Server
    Spring Boot provides embedded servers like Apache Tomcat, so we can run applications as standalone JARs without deploying them to external servers.

What is @SpringBootApplication?
    @SpringBootApplication is a combination of three annotations:

    @Configuration
    @EnableAutoConfiguration
    @ComponentScan

It is the main entry point of a Spring Boot application.

What is RestController?
    @RestController is used to create RESTful web services. It combines @Controller and @ResponseBody, so the response is directly returned as JSON.

What is Dependency Injection?
    Dependency Injection is a design pattern where objects are created and managed by the Spring container instead of manually instantiating them, promoting loose coupling.

What is IOC Container?
    IOC Container is the core of Spring that manages the lifecycle of beans and injects dependencies into them.

What is @Autowired
    @Autowired is used to inject dependencies into a bean. It can be used with constructors, setters, or fields.

What is @Qualifier
    @Qualifier is used to specify which bean to inject when there are multiple beans of the same type.

What is @Component
    @Component is a generic stereotype annotation that marks a class as a Spring bean.

What is application.properties?
    application.properties or application.yml is used to configure application settings like database configuration, server port, and environment-specific properties.

What is Spring Boot Actuator?
    Spring Boot Actuator provides production-ready features like health checks, metrics, and monitoring for Spring Boot applications.

What is @ComponentScan?
    @ComponentScan is used to scan for components in the classpath and register them as beans in the Spring container.

What is @Bean?
    @Bean is used to define a method that returns a bean to be managed by the Spring container.

What is @Configuration?
    @Configuration is used to define a class that contains bean definitions.

What is Spring DevTools?
    DevTools improves developer productivity by enabling automatic restart and live reload during development.

What is Spring Boot Profiles?
    Profiles allow us to define environment-specific configurations like dev, test, and prod.

spring.profiles.active=prod

How do you connect Spring Boot to Database?
    We can connect Spring Boot to a database by adding the appropriate database dependency (e.g., spring-boot-starter-data-jpa) and configuring the database properties in application.properties.

What is Spring Data JPA?
    Spring Data JPA simplifies data access by providing a simple way to implement JPA repositories.
