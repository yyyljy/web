<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		int result = (Integer)request.getAttribute("result");
	%>
	<h1><%=result %>�� �� ���Լ���~!!!~@</h1>
</body>
</html>