#!/bin/bash
mvn -U -am clean package
docker rm -f myweb
docker rmi -f myweb:v1
docker build -t myweb:v1 .
docker run -d --name="myweb" -p 8040:8040 myweb:v1
