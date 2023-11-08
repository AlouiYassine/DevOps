FROM openjdk:8
COPY http://192.168.1.26:8081/repository/maven-releases/tn/esprit/DevOps_Project/2.1/DevOps_Project-2.1.jar .
EXPOSE 8082
ENTRYPOINT ["java","-jar","DevOps_Project-2.1.jar"]
