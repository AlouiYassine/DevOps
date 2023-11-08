FROM openjdk:8
COPY target/DevOps_Project-2.1.jar .
EXPOSE 8081
ENTRYPOINT ["java","-jar","DevOps_Project-2.1.jar"]
