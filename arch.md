graph LR
    User[User Terminal] -->|Input| Client[calculator-client]
    Client -->|HTTP Request| Math[math-service]
microservices-lab/                 # ROOT FOLDER
│
├── docker-compose.yml             # Orchestration file linking the services
│
├── math-service/                  # SERVICE 1: The Backend
│   ├── Dockerfile                 # Instructions to containerize the backend
│   ├── pom.xml                    # Maven build file (dependencies)
│   ├── target/                    # (Created after running 'mvn package')
│   │   └── math-service-0.0.1.jar # The compiled application
│   └── src/
│       └── main/
│           └── java/
│               └── com/
│                   └── example/
│                       └── math/
│                           └── MathController.java
│
└── calculator-client/             # SERVICE 2: The Frontend/Client
    ├── Dockerfile                 # Instructions to containerize the client
    ├── pom.xml                    # Maven build file (dependencies)
    ├── target/                    # (Created after running 'mvn package')
    │   └── calculator-client-0.0.1.jar
    └── src/
        └── main/
            └── java/
                └── com/
                    └── example/
                        └── client/
                            └── CalculatorApp.java    Math -->|JSON Response| Client