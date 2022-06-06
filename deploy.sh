#!/bin/bash
git reset --hard
git pull
mvn -U -am clean package
docker rm -f lazy_notion
docker rmi -f lazy_web_backend:v1
docker build -t lazy_web_backend:v1 .
docker run -d --name="lazy_web_backend" -p 8040:8040 lazy_web_backend:v1
