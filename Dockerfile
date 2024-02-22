FROM openjdk:18
WORKDIR ./
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java","-cp","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]
