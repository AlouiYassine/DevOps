
# Use the openjdk image as the base image
FROM openjdk:8

# Install curl
RUN apt-get update && apt-get install -y curl

# Create a directory for your application
WORKDIR /app

# Download the JAR file from Nexus using curl
RUN curl -o DevOps_Project-2.1.jar http://192.168.1.26:8081/repository/maven-releases/tn/esprit/DevOps_Project/2.1/DevOps_Project-2.1.jar

# Expose the port your application will run on
EXPOSE 8082

# Define the entry point to run your application
ENTRYPOINT ["java", "-jar", "DevOps_Project-2.1.jar"]
