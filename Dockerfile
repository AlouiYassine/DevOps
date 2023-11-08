FROM openjdk:8
COPY 	tn/esprit/DevOps_Project/2.1/DevOps_Project-2.1.jar .
EXPOSE 8082
ENTRYPOINT ["java","-jar","DevOps_Project-2.1.jar"]
