FROM maven:3.9.6-eclipse-temurin-21
EXPOSE 8082
ADD /target/libraryloan.jar libraryloan.jar
ENTRYPOINT ["java", "-jar", "libraryloan.jar"]
