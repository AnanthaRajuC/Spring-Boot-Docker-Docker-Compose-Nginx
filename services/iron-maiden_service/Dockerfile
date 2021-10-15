# Start with a base image containing Java runtime
FROM openjdk:11-jre-slim-buster

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/iron_maiden-latest.jar

# Add the application's jar to the container
ADD ${JAR_FILE} iron_maiden-latest.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/iron_maiden-latest.jar"]