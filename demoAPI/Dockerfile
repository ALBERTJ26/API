# Use official Java 21 JDK image
FROM eclipse-temurin:21-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Download dependencies (offline mode)
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Package the Spring Boot app
RUN ./mvnw clean package -DskipTests

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the Spring Boot jar
CMD ["java", "-jar", "target/demo-api-0.0.1-SNAPSHOT.jar"]
