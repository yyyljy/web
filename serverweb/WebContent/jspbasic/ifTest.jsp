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
		String str = "jav";
		int size = str.length();
		if(size>=4){%>
			<h1>���ƿ�:<%= size %></h1>
		<%}else{ %>
			<h1>�Ⱦ��:<%= size %></h1>
	<%	}
	%>
</body>
</html>