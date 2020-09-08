FROM maven:3.5-jdk-8-alpine
WORKDIR /jenkinspoc
COPY . .
RUN mvn clean install