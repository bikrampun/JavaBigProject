<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="learning.programming.util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
        <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
        <a href="${addUrl}">New Item</a>
        <table border="1" cellpadding="5">

            <caption><h2>Todo Items</h2></caption>

            <tr>
                <th>Title</th>
                <th>Deadline</th>
            </tr>

            <c:forEach var="item" items="${todoData.items}">

                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                    <c:param name="id" value="${item.id}"/>
<!-- param tag used to specify request to parameter with URL which in our case is item ID -->
                </c:url>

                <tr>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.deadLine}"/></td>
                    <td><a href="${deleteUrl}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>