# Docker
> Please download and install from  docker offical site http://www.docker.com.

> If you run project send to the remote docker deamon, please set the system varibale or IDE VM arguments:
* DOCKER_HOST=tcp://192.168.1.101:2375

> Java maven project:
* mvn clean install -DskipTests dockerfile:build
* docker run -d -p 35001:35001 -t springcloud/configuration-server


