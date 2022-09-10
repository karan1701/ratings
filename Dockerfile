FROM openjdk:8
EXPOSE 9094
ADD target/ratings.jar ratings.jar
ENTRYPOINT ["java", "-jar", "/ratings.jar"]