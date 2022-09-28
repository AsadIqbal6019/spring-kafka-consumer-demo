# define base docker image
FROM openjdk:11

LABEL maintainer="Thecloudflash.com"
EXPOSE 8080/tcp

ADD target/kafka-database-demo-0.0.1-SNAPSHOT.jar kafka-database-demo.jar

ENTRYPOINT ["java", "-jar", "kafka-database-demo.jar"]