# Using OpenAPI 3 with GraalVM Native Image

### Pre-requisites
- GraalVM 22.2.0 / JDK 11
- Swagger UI

### Building Executable JAR
To create an executable jar, execute:

```sh
 mvn clean package
```

or

```sh
./gradlew clean build
```

## Running the JAR application

```sh
java -jar target/springdoc-openapi-spring-boot-2-webflux-3.1.6-SNAPSHOT.jar
```

or

```sh
java -jar build/libs/springdoc-openapi-spring-boot-2-webflux-3.1.6-SNAPSHOT.jar
```

### Building native image with GraalVM
To create a `native image`, execute the following command

```sh
mvn package -Pnative
```

or

```sh
./gradlew nativeCompile
```

## Running the native application

To run the demo, execute the following:

```sh
target/springdoc-openapi-spring-boot-2-webflux
```

or

```sh
build/native/nativeCompile/springdoc-openapi-spring-boot-2-webflux
```

## Start the Swagger UI

```sh
docker run --rm -p 80:8080 swaggerapi/swagger-ui
```

Open the Swagger UI by browsing to http://localhost:8082/