FROM maven:3.9.6-eclipse-temurin-21
EXPOSE 8081
ADD /target/librarydatabase.jar librarydatabase.jar
ENTRYPOINT ["java", "-jar", "librarydatabase.jar"]
