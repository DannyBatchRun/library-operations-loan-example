FROM openjdk:21-jdk
RUN apt-get update && \
    apt-get install -y maven
EXPOSE 8082
ADD /target/libraryloan.jar libraryloan.jar
ENTRYPOINT ["java", "-jar", "libraryloan.jar"]