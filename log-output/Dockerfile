FROM openjdk:11

WORKDIR /usr/src/myapp

COPY . ./

RUN javac RandomStringGenerator.java

CMD [ "java", "RandomStringGenerator" ]
