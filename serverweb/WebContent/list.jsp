<%@page import="dept.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Apple</h1>
	<%
		ArrayList<DeptDTO> deptArr = (ArrayList<DeptDTO>)request.getAttribute("deptArr");
	%>
	<table border="1">
		<th>�μ���ȣ</th>
		<th>�μ���</th>
		<th>�μ���ġ</th>
		<th>�μ���ȭ��ȣ</th>
		<th>������</th>
		<%
			int size = deptArr.size();
			for(int i=0;i<size;i++){
		%>
				<tr>
					<td><%=deptArr.get(i).getDeptNo() %></td>
					<td><a href="/serverweb/dept/read.do?deptNo=<%=deptArr.get(i).getDeptNo()%>"><%=deptArr.get(i).getDeptName() %></a></td>
					<td><%=deptArr.get(i).getLoc() %></td>
					<td><%=deptArr.get(i).getTel() %></td>
					<td><%=deptArr.get(i).getMgr() %></td>
				</tr>
		<%
			}
		%>
	</table>
</body>
</html>