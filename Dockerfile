
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM openjdk:17
copy target/ApiGestionContratos-v1.jar app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]
