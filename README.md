# Javamicroseerviceapp

this a practice project , created  to practice containerization of microservice application and deploy it on aws using bosth openstack and aws native platform# Project Context: Java Microservices Calculator

## 1. Project Overview
We are building a **Java-based Microservices Application** that performs basic arithmetic operations. The system consists of a frontend console client and a backend REST API, both containerized using Docker and orchestrated with Docker Compose.

**Goal:** To demonstrate a clean, decoupled architecture where a client application communicates with a backend service over a Docker bridge network.

## 2. Architecture & Technologies
* **Language:** Java 17+
* **Framework:** Spring Boot 3.2.0 (Maven)
* **Containerization:** Docker & Docker Compose
* **Communication:** REST (HTTP) via `RestTemplate`
* **Service Discovery:** Docker Internal DNS (using service names as hostnames)

### Data Flow
`User Input (Console)` -> `calculator-client` -> **HTTP GET** -> `math-service` -> `JSON Response` -> `calculator-client` -> `Console Output`

## 3. File Structure
```text
microservices-lab/                 # ROOT
├── docker-compose.yml             # Orchestration
├── PROJECT_CONTEXT.md             # This file
│
├── math-service/                  # BACKEND (Port 8080)
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/main/java/.../MathController.java
│
└── calculator-client/             # FRONTEND (Console App)
    ├── Dockerfile
    ├── pom.xml
    └── src/main/java/.../CalculatorApp.java
