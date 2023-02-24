# This Dockerfile uses the image @ https://hub.docker.com/_/openjdk

FROM openjdk:11
COPY ./target/Calculator-SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
