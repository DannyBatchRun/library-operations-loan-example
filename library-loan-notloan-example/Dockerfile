FROM openjdk:21-jdk
ENV ENCRYPTION_PASSWORD=passwordtoencrypt
WORKDIR /app
COPY /target/libraryloan.jar libraryloan.jar
EXPOSE 8082
ENTRYPOINT ["java", "-Djasypt.encryptor.password=${ENCRYPTION_PASSWORD}", "-jar", "libraryloan.jar"]
