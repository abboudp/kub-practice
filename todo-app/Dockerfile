FROM openjdk:11

WORKDIR /usr/src/myapp/server

COPY . ./

RUN javac SimpleWebServer.java

CMD [ "java", "SimpleWebServer" ]