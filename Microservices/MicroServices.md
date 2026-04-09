What are Microservices
    It is an architectural style where an application is divided into small independent services, each handling specific business functionality.These services are loosely coupled,independently deployable and communicate via APIs like REST or message queues

Mono vs Micro
    In Monolythic architecture the entire application is built and deployed as a single unit.In microservices the application is split into multiple smaller services that can be developed and scaled independently.

Advantages
   Microservices provide independent deployment, better scalability, fault isolation, and allow teams to work in parallel. If one service fails, it doesn't bring down the entire system.

Disadvantages
   Microservices introduce complexity, require proper monitoring, have network latency due to inter-service communication, and handling data consistency is challenging.

How do they communicate
    Microservices communicate either synchronously using REST APIs over HTTP or asynchronously using messaging systems.
    Example:Kafka,RabbitMQ,REST API

What are API Gateways
    API Gateway acts as a single entry point for all client requests. It routes requests to the appropriate microservices and handles cross-cutting concerns like authentication, logging, and rate limiting.
    Example:Spring Cloud Gateway

What is Service Discovery
    In microservices, services are dynamically created and destroyed, so their locations keep changing. Service discovery helps services find each other using a registry.
    Example:Spring Cloud Consul

Load Balancing
    Load balancing distributes incoming requests across multiple instances of a service to improve performance and availability.
    Example:Spring Cloud LoadBalancer

What is Circuit Breaker
    Circuit breaker is a design pattern used to prevent cascading failures. If a service is down, it stops further calls to that service and provides a fallback response.
    Example:Spring Cloud CircuitBreaker

How to handle failures
    I handle failures using circuit breakers, retries, timeouts, and fallback mechanisms. This ensures system stability even when some services fail.

What is Distributed Tracing
    Distributed tracing is a technique used to track requests as they flow through multiple microservices making debugging and performance monitoring easier.
    Example:Zipkin,Jaeger

What is Centralized Logging
    Centralized logging is a technique used to collect logs from all microservices in a central location making it easier to monitor and debug issues.
    Example:ELK Stack,Splunk

Database per service
    In microservices, each service has its own database.To Ensure loose coupling and independent deployment.
    However, this introduces data consistency challenges.

CAP Theorem
    CAP Theorem states that a distributed system can only provide two out of three guarantees: Consistency, Availability, and Partition Tolerance. In microservices, we often prioritize Availability and Partition Tolerance over strict Consistency.

Saga Pattern
    Saga pattern is a way to handle distributed transactions in microservices. It is a sequence of local transactions where each transaction updates the database and publishes an event that triggers the next transaction. If any transaction fails, the saga rolls back all previous transactions.

Security in Microservices
    Security in microservices is handled using API Gateways, JWT tokens, and OAuth 2.0 for authentication and authorization.

How would you design microservices ?
    I would start by identifying business domains using domain-driven design. Then I split services based on functionality, assign each service its own database, and enable communication via REST or messaging. I would also include API Gateway, service discovery, centralized logging, and fault tolerance mechanisms.