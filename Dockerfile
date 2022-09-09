FROM openjdk:8
EXPOSE 8080
ADD target/ratings.jar ratings.jar
ENTRYPOINT ["java", "-jar", "/ratings.jar"]