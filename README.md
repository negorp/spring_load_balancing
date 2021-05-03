# Start Eureka Server by executing below maven command from the project's root folder

- mvn -pl eureka spring-boot:run -DskipTests -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka

# Start Spring Cloud Gateway Server by executing below maven command

- mvn -pl gateway spring-boot:run -DskipTests -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka

# Start multiple instances of test-service 

## Instance #1 on port 9001

- mvn -pl test-service spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka -Dspring-boot.run.jvmArguments=-Dserver.port=9001

## Instance #1 on port 9001

- mvn -pl test-service spring-boot:run -Dspring-boot.run.arguments=--EUREKA_SERVER_ADDRESS=http://localhost:8761/eureka -Dspring-boot.run.jvmArguments=-Dserver.port=9002


