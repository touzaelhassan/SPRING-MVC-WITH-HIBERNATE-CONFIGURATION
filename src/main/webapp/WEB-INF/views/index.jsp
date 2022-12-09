<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
   <head>
       <title>SPRING MVC APPLICATION WITH HIBERNATE</title>
   </head>
   <body>
       <h2>WELCOME TO THE HOMEPAGE</h2>
       <p>Name : ${users.get(0).name}</p>
       <p>Name : ${users.get(0).email}</p>
   </body>
</html>
