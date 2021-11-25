FROM java:8

COPY ./biz-module/target/fuserest-v1.0.war /usr/local/fuserest-v1.0.war

USER root

EXPOSE 9099

CMD java -jar /usr/local/fuserest-v1.0.war