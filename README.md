# Kafka Spring - Event-Driven Architecture

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

This project uses Event-Driven Architecture with Java 17, Spring Boot 3 and Kafka.

Two microservices were created, ms-kafka-producer and ms-kafka-consumer. 
Both communicate with Kafka through Spring Boot to create and access topics and partitions.

## Table of Contents

- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [Screenshots](#screenshots)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/jonasfschuh/kafka-spring.git
```

2. Install dependencies with Maven

3. Install [Docker](https://docs.docker.com/get-started/get-docker/)
4. Install [Offset Explorer](https://offsetexplorer.com/download.html)
5. Install [Postman](https://www.postman.com/downloads/)

## Usage

1. Start docker containers, through the Docker folder

```bash
docker-compose up
```

To stop docker containers, use:
```bash
docker-compose down
```
2. Configure Offset Explorer for Kafka (9092) and Zookeeper (2181) ports.

Note:
Kakfa can be accessed directly via IntelliJ

3. Start the application ms-kafka-producer with Maven or through the Services tab in intelliJ.
4. The producer API will be accessible at http://localhost:8080/
5. Access Postman and post a request.

Example
```JSON
{
    "code": "2008", 
    "productName": "Toyota Camry XLE V6",
    "value": "60000.00"
}
```

5. Start the application ms-kafka-consumer with Maven or through the Services tab in intelliJ.

## API Endpoints

The API provides the following endpoints:

```markdown
POST /api/save-order - Register an event in Kafka. In this case, a purchase order.
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.

## Screenshots

Starting containers 
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/containers.jpg?raw=true&sanitize=true)

Starting ms-producer
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/ms-kafka-consumer.gif?raw=true&sanitize=true)

Offset explorer
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/offset_explorer.gif?raw=true&sanitize=true)

Postman
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/postman.gif?raw=true&sanitize=true)

Ms-kafka-consumer - details 
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/ms-kafka-consumer.gif?raw=true&sanitize=true)

Offset explorer - details
![](https://github.com/jonasfschuh/kafka-spring/blob/master/docs/img/offset_explorer_details.gif?raw=true&sanitize=true)

