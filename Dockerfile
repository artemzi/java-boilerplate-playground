FROM anapsix/alpine-java

MAINTAINER Artem Z

COPY build/libs/Playground-1.0-SNAPSHOT.jar /home/Playground-1.0-SNAPSHOT.jar

CMD ["java","-jar","/home/Playground-1.0-SNAPSHOT.jar"]