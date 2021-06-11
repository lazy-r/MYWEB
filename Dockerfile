FROM java:8
COPY target/*.jar /app.jar

CMD ["--server.port=8040"]

EXPOSE 8040

CMD exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=prod -jar /app.jar
