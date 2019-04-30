FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER qianlizeguo@163.com

RUN mkdir -p /box/dome

WORKDIR /box/dome

EXPOSE 8010

ADD ./target/demo-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

#CMD ["--spring.profiles.active=test"]