# Use an official Maven image with JDK 17 as a parent image
FROM maven:3.6.3-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and project source code to the container
COPY pom.xml ./
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Use an official OpenJDK image as a base for the application image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file from the build stage
COPY --from=build /app/target/myFirstProject-0.0.1-SNAPSHOT.jar ./myFirstProject.jar

# Expose the port the application will run on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "myFirstProject.jar"]
