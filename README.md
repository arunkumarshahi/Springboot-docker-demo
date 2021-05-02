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
* docker rmi -f image_id


# Deploy docker image on AWS ECS
* Create a registry in ECR say hello-spring-demo 

* Execute following command to retrieve AWS ECR credentail to upload 
```sh
$ aws ecr get-login --registry-ids <<Account_NO>>

```

*  following output will get response of above command 

```sh
$   sudo docker login -u AWS -p xxxxxxxxxxxxxxxxxxxxxffffffffffffffffffffkkkkkkkkkkkkkkkkkkkggggggggg== 
https://account_no.dkr.ecr.us-east-1.amazonaws.com

```



*  Create docker image 
```sh
$  docker build -t hello-spring-demo .
$  docker tag hello-spring-demo:latest <<Account_no>>.dkr.ecr.us-east-1.amazonaws.com/spring-boot-hello:latest
$  docker push <<Account_no>>.dkr.ecr.us-east-1.amazonaws.com/spring-boot-hello:latest
```
  


Create a ECS cluster giving docker image name in conainer configuration

link to folllwing for more --> https://dzone.com/articles/deploying-spring-boot-to-ecs-part-2

aws ecs update-service --cluster getting-started --region us-east-1 --service spring-boot-hello-service --task-definition spring-boot-hello:15 --desired-count 1