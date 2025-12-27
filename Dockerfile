FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# 🔧 make mvnw executable
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/restaurant-0.0.1-SNAPSHOT.jar"]
