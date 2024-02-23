FROM openjdk:21
ADD ./target/Calculator-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
CMD ["java","-jar","Calculator-1.0-SNAPSHOT-shaded.jar"]
