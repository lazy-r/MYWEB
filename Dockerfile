FROM java:8
COPY *.jar /app.jar

CMD ["--server.port=8040"]

EXPOSE 8040

ENTRYPOINT ["java","-jar","/app.jar"]
