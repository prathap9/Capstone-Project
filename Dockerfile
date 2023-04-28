FROM openjdk:19
EXPOSE 9696
ADD build/libs/employee-management-systems-0.0.1-SNAPSHOT.jar employee-management-systems-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employee-management-systems-0.0.1-SNAPSHOT.jar"]