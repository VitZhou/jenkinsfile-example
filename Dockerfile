FROM java:8

COPY target/jenkins-parent-0.1.0-SNAPSHOT.jar /squid/demo/jenkins-parent.jar

EXPOSE 8080

CMD ["java","-jar","/squid/demo/jenkins-parent.jar"]
