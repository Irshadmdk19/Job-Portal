# Job Search Spring Boot Application

## Overview

This is a Spring Boot application designed to search for jobs. It connects to an Atlas DB to store and retrieve job information.

## Features

- Search for jobs
- Filter jobs by category, location, and other criteria
- Detailed job descriptions

## Technologies Used

- Spring Boot
- Atlas DB (MongoDB Atlas)
- Java
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MongoDB Atlas account

### Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/job-search-spring-boot.git
    cd job-search-spring-boot
    ```

2. **Configure MongoDB Atlas:**
    - Create a MongoDB Atlas cluster.
    - Get the connection string and replace `<connection-string>` in the `application.properties` file.

    ```properties
    spring.data.mongodb.uri=<connection-string>
    ```

3. **Build the application:**
    ```bash
    mvn clean install
    ```

4. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```