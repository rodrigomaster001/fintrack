# FinTrack

**FinTrack** is a modern financial accounting system designed to manage chart of accounts, financial records, and distributed transactions across global branches with microservices architecture.

> Built with Spring Boot, Kafka, RabbitMQ, PostgreSQL, MongoDB, Elasticsearch, and powered by Docker.

---

## 🚀 Project Goals

- 📘 Manage accounts and subaccounts across multinational branches.
- 📊 Support distributed transactions with SAGA orchestration and choreography.
- 📚 Implement CQRS for separating write (PostgreSQL) and read (MongoDB + Elasticsearch) operations.
- 🧠 Adopt DDD, SOLID principles, and event-driven architecture.
- 🔐 Integrate with Keycloak for identity and access management.

---

## 🧱 Architecture Overview

This is a **monorepo** with modular services:

fintrack/ 
│── backend/ 
│ ├── account-service/ # Manages chart of accounts 
│ ├── transaction-service/ # Handles financial transactions 
│ ├── query-service/ # Read operations using MongoDB + Elasticsearch 
│ ├── command-service/ # Write operations (CQRS) 
│ ├── saga-orchestrator/ # Centralized SAGA management 
│ ├── event-broker/ # Event routing (Kafka, RabbitMQ) 
│ ├── event-store/ # Event sourcing and rollback logs 
│ ├── api-gateway/ # Unified API access 
│ ├── auth-service/ # Keycloak auth integration 
│ └── common-lib/ # Shared libraries and DTOs

## 🛠️ Tech Stack

| Purpose             | Technology                         |
|---------------------|-------------------------------------|
| Backend Framework   | Spring Boot                        |
| Messaging           | Apache Kafka, RabbitMQ             |
| Data (Write)        | PostgreSQL                         |
| Data (Read)         | MongoDB, Elasticsearch             |
| Auth & IAM          | Keycloak                           |
| Orchestration       | Docker, Docker Compose             |
| Distributed IDs     | UUIDs, Snowflake IDs               |

---

## 🧪 Status

✅ Initial setup complete with working `account-service`  
🧩 Services being developed in stages  
🌍 Public version open source under MIT License  
🔒 Trademark protected – see [TRADEMARK.md](./TRADEMARK.md)

---

## 👤 Author

**Rodrigo Gianetti Serrano**  
📧 rodrigo.master.001@gmail.com

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE).  
Trademark and brand use is governed separately – see [TRADEMARK.md](./TRADEMARK.md).