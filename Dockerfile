# Use an OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from your project into the container
COPY target/DevOps_Project-2.1.jar /app/DevOps_Project-2.1.jar

# Expose the port your Spring Boot application runs on (change to the actual port)
EXPOSE 8082

# Define the command to run your Spring Boot application
ENTRYPOINT  ["java", "-jar", "DevOps_Project-2.1.jar"]

