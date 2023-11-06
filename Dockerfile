FROM openjdk:8
COPY http://192.168.1.26:8081/#browse/browse:maven-releases:tn%2Fesprit%2FDevOps_Project%2F2.1%2FDevOps_Project-2.1.jar .
EXPOSE 8082
ENTRYPOINT ["java","-jar","DevOps_Project-2.1.jar"]
