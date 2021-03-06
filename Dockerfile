FROM openjdk:8-jdk
EXPOSE 8089:8080
RUN mkdir /app
COPY ./build/install/com.example.ktor-sample/ /app/
WORKDIR /app/bin
CMD ["./com.example.ktor-sample"]