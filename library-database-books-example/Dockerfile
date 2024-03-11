FROM openjdk:21-jdk
RUN apt-get update && \
    apt-get install -y maven
EXPOSE 8081
ADD /target/librarydatabase.jar librarydatabase.jar
ENTRYPOINT ["java", "-jar", "librarydatabase.jar"]
