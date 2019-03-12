<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="./WEB-INF/Date.tld" prefix="Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Today's Date is = <Date:DateFormate inputDateFormate="mm-dd-yyyyy" /><br>
Today's Date is = <Date:DateFormate inputDateFormate="dd/mm/yyyyy" />

</body>
</html>