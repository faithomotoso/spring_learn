<%--
  Created by IntelliJ IDEA.
  User: Faith
  Date: 11-Sep-23
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Student Confirmation - ${student.firstName}</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br/>

Country: ${student.country}

<br />

Favorite Dessert: ${student.favoriteDessert}

<br />
Favorite Genres:
<ul>
     <c:forEach var="genre" items="${student.genres}">
         <li>${genre}</li>
     </c:forEach>
</ul>

</body>
</html>
