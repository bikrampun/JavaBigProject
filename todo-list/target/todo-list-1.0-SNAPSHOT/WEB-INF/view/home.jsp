<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="learning.programming.util.Mappings" %>
<html>
<head>
    <title>Todo List Application</title>
</head>
<body>
    <div align="center">
        <!-- this tag automatically performs a URL rewriting wherever necessary -->
        <!-- var attribute specify the variable that will contain the formatted URL
        value attribute is the base URL which in this case is items -->
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo Items</a></h2>
    </div>

</body>
</html>