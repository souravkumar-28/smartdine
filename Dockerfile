# Use Java 17
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy project files
COPY . .

# Build the app
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/restaurant-0.0.1-SNAPSHOT.jar"]
