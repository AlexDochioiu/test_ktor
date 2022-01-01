Run the commands:
```
./gradlew installDist 

docker build -t my-application .

docker run -p 8089:8080 my-application
```