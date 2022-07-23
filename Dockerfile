FROM maven:3.6.0-jdk-8-alpine

COPY src /home/MavenFromScratch/src

COPY pom.xml /home/MavenFromScratch

RUN mvn -f /home/MavenFromScratch/pom.xml clean test