<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<!-- scriplet -->
	<%
		String msgs[] = (String[]) request.getAttribute("myWelcomeMsg");
		String welcomeMsg = "";
		for(String msg: msgs){
			welcomeMsg += msg + " ";
		}
		out.print(welcomeMsg);
	%>
</body>
</html>