# Springdoc OpenAPI Using GraalVM Native Image

## Building application

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
mvn -Pnative
```

or

```sh
./gradlew nativeCompile
```

## Running the native application

To run the demo using docker, invoke the following:

```sh
target/springdoc-openapi-spring-boot-2-webflux
```

or

```sh
build/native/nativeCompile/springdoc-openapi-spring-boot-2-webflux
```

Open the Swagger UI by browsing to http://localhost:8082/