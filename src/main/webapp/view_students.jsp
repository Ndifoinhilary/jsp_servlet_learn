<%--
  Created by IntelliJ IDEA.
  User: hilaryd
  Date: 13/01/2024
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students </title>
</head>
<body>
<h2>Student Dome Data</h2> <br><br>
<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>

    <c:forEach var="student" items="${Student_list}"  >
       <tr>
           <td>${student.firstName}</td>
           <td>${student.lastName}</td>
           <td>${student.email}</td>
       </tr>
    </c:forEach>
</table>
</body>
</html>
