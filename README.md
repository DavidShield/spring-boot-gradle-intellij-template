# spring-boot-gradle-intellij-template

## the template to start a spring boot web application for beginners.

## Tips: 
      the default web directory is main/resources/static
      if you add dependencies 'compile("org.springframework.boot:spring-boot-starter-thymeleaf")'
      the default web directory will be main/resources/templates
      
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
