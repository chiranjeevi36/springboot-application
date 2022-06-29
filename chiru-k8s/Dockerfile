FROM openjdk:17
ARG JAR_FILE=./build/libs/chiru-k8s-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /chiru-k8s-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/chiru-k8s-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
