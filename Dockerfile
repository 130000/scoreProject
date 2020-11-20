FROM sapmachine/jdk11:latest
MAINTAINER abc
ADD Score-4444/target/Score-4444-1.0-SNAPSHOT.jar /Score.jar
VOLUME /opt
ENTRYPOINT ["java","-jar","/Score.jar","&"]