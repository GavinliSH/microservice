##
## Spring boot 2.0 don't support the latest version 2.7.1 zipkin-server.jar，So you must install zipkin in yourself.
##
docker search zipkin
docker pull openzipkin/zipkin

## cd the git project zipkin path and run the below command.
docker-compose up -d

