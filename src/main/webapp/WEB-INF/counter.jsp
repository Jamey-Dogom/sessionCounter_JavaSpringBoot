<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link href="css/style.css" rel="stylesheet">
	<script type="text/javascript" src="js/myscript.js"></script>
	<meta charset="UTF-8">
	<title>Current visit count</title>
</head>
<body>
<div class = "container">
<h3>You have visited <a href="/">http://localhost8080</a> <c:out value="${count}"></c:out> times.</h3>

<a href="/">Test another visit?</a>
</div>

</body>
</html>