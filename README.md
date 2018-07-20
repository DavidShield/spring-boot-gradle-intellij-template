# spring-boot-gradle-intellij-template

## the template to start a spring boot web application for beginners.

To import the project, open intellij, select import by gradle. 

Tips: 
  1. 
      
      the default web directory is main/resources/static
      if you add dependencies 'compile("org.springframework.boot:spring-boot-starter-thymeleaf")'
      the default web directory will be main/resources/templates
      
  2.
      
      the content of gradle/wrapper/gradle-wrapper.properties should be:
      distributionBase=GRADLE_USER_HOME
      distributionPath=wrapper/dists
      zipStoreBase=GRADLE_USER_HOME
      zipStorePath=wrapper/dists
      distributionUrl=https\://services.gradle.org/distributions/gradle-4.6-bin.zip
      
Examples of html file in templates which can interact with the backend:
      
      <!DOCTYPE HTML>
      <html xmlns:th="http://www.thymeleaf.org">
      <head> 
            <title>Getting Started: Serving Web Content</title> 
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      </head>
      <body>
          <p th:text="'Hello, ' + ${name} + '!'" />
      </body>
      </html>
