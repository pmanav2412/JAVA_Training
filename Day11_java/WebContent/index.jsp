<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id= "Services" class="com.marlabs.jsp.ProductServices" scope="session"/>
<jsp:useBean id= "Product" class="com.marlabs.jsp.Product" />
<jsp:setProperty property="*" name="Product"/>
<%
boolean b =Services.indertData(Product);
%>
<%= 
b
%>
<% 
response.sendRedirect("index.html");
%>

</body>
</html>