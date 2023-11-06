FROM openjdk:8
COPY target/DevOps_Project-2.1.jar .
EXPOSE 8082
ENTRYPOINT ["java","-jar","DevOps_Project-2.1.jar ."]
