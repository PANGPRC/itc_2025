# itc_2025

## Challenge 1
Just run the application and the test via IDE.

4 Jan - Tried to use Dropwizard, but it was not working as expected, so I used Spring Boot instead.

## Challenge 2
### Build the Docker image:  
docker build -t my-spring-boot-app .
### Run the Docker container:  
docker run -p 8080:8080 my-spring-boot-app
### Test the REST service:  
Open a web browser or use a tool like curl or Postman to send requests to http://localhost:8080.
Verify that the REST endpoints are responding as expected.
