FROM openjdk:18
WORKDIR ./
COPY ./target/Calculator-1.0-SNAPSHOT-shaded.jar ./
CMD ["java","-cp","Calculator-1.0-SNAPSHOT-shaded.jar","Calculator"]
