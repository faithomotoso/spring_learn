<%--
  Created by IntelliJ IDEA.
  User: Faith
  Date: 11-Sep-23
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br/>

    Last name: <form:input path="lastName"/>

    <br/>

    <form:select path="country">

        <form:options items="${student.countryOptions}" />

    </form:select>

    <br />

    Oreo <form:radiobutton path="favoriteDessert" value="Oreo" />
    Banana Bread <form:radiobutton path="favoriteDessert" value="Banana Bread" />
    Cinnamon Rolls <form:radiobutton path="favoriteDessert" value="Cinnamon Rolls" />

    <br />

    <input type="submit" value="Submit" />

</form:form>

</body>
</html>
