# RabbitMQ

> The rabbitmq implements real-time referesh configuration files.

# Install management version rabbitmq which support UI management.

* docker pull rabbitmq:3.7.4-rc.4-management
* docker run -d -p 4369:4396 -p 5671:5671 -p 5672:5672 -p 15671:15671 -p 15672:15672 -p 25672:25672 --name rabbitmq rabbitmq:3.7.4-rc.4-management

# Bus refresh url 

* Bus refresh url is changed to "/actuator/bus-refresh" in spring boot 2.0. But the actuator is disabled default, We need to enable it in spring boot 2.0.