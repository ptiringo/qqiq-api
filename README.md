# QQIQ API
This is the project for the APIs about QQIQ.

## Development Notes
### Using Development Tools
- [Spring Tool Suite](https://spring.io/tools)
- [Gradle](http://gradle.org/)

### Using Libraries
- [Spring Boot](http://projects.spring.io/spring-boot/)
  - Spring MVC
  - [Spring Data JPA](http://projects.spring.io/spring-data-jpa/)
- [Lombok](https://projectlombok.org/)
- [H2 Database](http://www.h2database.com/html/main.html)
- [Flyway](http://flywaydb.org/)

## Available Operation Commands
### Gradle
#### Build The Application for Development
```
./gradlew build
```

#### Build The Application for Production
```
./gradlew build -Pprofile=production
```

### Cloud Foundry
#### Deploy The Application
```
cf push
```