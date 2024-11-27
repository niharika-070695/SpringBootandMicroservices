<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>My First JSP Page</title>
  </head>
  <body style="background-color: lightgreen">
    <div style="text-align: center; color: red">${wishMessage}</div>
    <div style="text-align: center; color: blue">${requestData}</div>
    <div style="text-align: center; color: brown">${requestData.username}</div>
    <div style="text-align: center; color: yellow">${requestData.city}</div>
    <div style="text-align: center; color: pink">${requestData.contactNo}</div>
  </body>
</html>
