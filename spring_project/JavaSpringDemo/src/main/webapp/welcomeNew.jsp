<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<c:forEach var="msgItem" items="${myWelcomeMsg}">
		<c:out value="${msgItem}"></c:out>
	</c:forEach>
</body>
</html>