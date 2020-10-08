# Springboot-docker-demo

bulid application 

* mvn clean install

Create docker image and upload to doker hub

* docker build -t hello-spring-demo . 
* docker tag hello-spring-demo arunkumarshahi/hello-spring-demo
* docker push arunkumarshahi/hello-spring-demo

Pull the docker image and start the instance 

* docker pull arunkumarshahi/hello-spring-demo
* docker run -p 8090:8080 -it arunkumarshahi/hello-spring-demo

Access the application 

* http://localhost:8090/test
* http://localhost:8090/swagger

Stop the container 

* docker stop 
* docker rmi -f <<image id>>

