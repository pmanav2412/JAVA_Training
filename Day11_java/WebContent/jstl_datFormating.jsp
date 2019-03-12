<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="now" value="<%= new java.util.Date()%>"/>

<p>
<fmt:formatDate value="${now}" type="both" timeStyle="short" dateStyle="short"/><br>
<fmt:formatDate value="${now}" type="both" timeStyle="long" dateStyle="long"/><br>
<fmt:formatDate value="${now}" type="both" timeStyle="short" dateStyle="long"/><br>
<fmt:formatDate value="${now}" type="both" timeStyle="long" dateStyle="short"/>
</p>

</body>
</html>