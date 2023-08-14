FROM openjdk:17
VOLUME /tmp
ADD ./target/worker-microservice-0.0.1-SNAPSHOT.jar hr-worker.jar
ENTRYPOINT ["java","-jar","/hr-worker.jar"]