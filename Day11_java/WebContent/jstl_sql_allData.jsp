<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <sql:setDataSource var = "Products" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost:3306/Product?useLegacyDatetimeCode=false&serverTimezone=UTC"
         user = "root"  password = "rootroot"/>
      <sql:query dataSource = "${Products}" sql = "SELECT * from products" var = "result" />
<table>
	<tr>
	<th>Product Id</th>
	<th>Product Name</th>
	<th>Product Price</th>
	<th>Product Seller</th>
	</tr>
	<c:forEach var="row" items="${result.rows}">
	<tr>
	<td><c:out value="${row.id}"></c:out></td>
	<td><c:out value="${row.name}"></c:out></td>
	<td><c:out value="${row.price}"></c:out></td>
	<td><c:out value="${row.seller}"></c:out></td>
	</tr>
	
	</c:forEach>

</table>

</body>
</html>