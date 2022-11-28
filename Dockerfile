FROM kimminsic/test:task-app
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=build/libs/task-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]