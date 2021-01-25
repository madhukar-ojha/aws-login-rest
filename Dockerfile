FROM openjdk:8
ADD target/aws-login-rest.jar aws-login-rest.jar
COPY ./target/aws-login-rest.jar .
WORKDIR .
ARG JAR_FILE
RUN sh -c 'touch aws-login-rest.jar'
EXPOSE 8071
ENTRYPOINT ["java", "-jar", "aws-login-rest.jar"]

