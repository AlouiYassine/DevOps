FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Download the JAR file from Nexus
RUN curl -o DevOps_Project-2.1.jar http://192.168.1.26:8081/repository/maven-releases/tn/esprit/DevOps_Project/2.1/DevOps_Project-2.1.jar 

# Expose the port your Spring Boot application runs on (change to the actual port)
EXPOSE 8082

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "DevOps_Project-2.1.jar"]
