FROM openjdk:17
ADD target/product-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]