# Use a base image with Java runtime
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY aws-assignment-0.0.1.jar /app/aws-assignment-0.0.1.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "aws-assignment-0.0.1.jar"]

