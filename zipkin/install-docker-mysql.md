# install md

> Install mysql in docker
* docker search mysql
* docker pull mysql
* docker run --name mysql -p 3306:3306  -e MYSQL_ROOT_PASSWORD=123456 -d mysql

> Please connect the mysql in MySQL client to run [mysql.sql](./mysql.sql)
>> root/123456
