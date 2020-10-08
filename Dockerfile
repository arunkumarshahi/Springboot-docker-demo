FROM java:8
EXPOSE 8080
ADD target/ak-docker-demo.jar ak-docker-demo.jar

ENTRYPOINT ["java","-jar","ak-docker-demo.jar"]