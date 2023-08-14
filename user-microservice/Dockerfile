FROM openjdk:17
VOLUME /tmp
ADD ./target/user-microservice-0.0.1-SNAPSHOT.jar hr-user.jar
ENTRYPOINT ["java","-jar","/hr-user.jar"]
