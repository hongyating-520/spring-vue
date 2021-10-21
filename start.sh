#!/bin/bash
echo "启动打包脚本。。。"
echo $1

#mvn clean package
add=$(pwd)

now=$add/spring-web/target

echo $now

java -jar $now/$1 
