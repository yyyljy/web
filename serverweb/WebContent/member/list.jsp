<%@page import="member.MemberDTO"%>
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
	<h1>Member</h1>
	<%
		ArrayList<MemberDTO> memArr = (ArrayList<MemberDTO>)request.getAttribute("memArr");
	%>
	<table border="1">
		<th>�μ���ȣ</th>
		<th>ID</th>
		<th>�̸�</th>
		<th>�ּ�</th>
		<th>���</th>
		<th>����Ʈ</th>
		<%
			int size = memArr.size();
			for(int i=0;i<size;i++){
		%>
				<tr>
					<td><%=memArr.get(i).getDeptNo() %></td>
					<td><a href="/serverweb/member/read.do?id=<%=memArr.get(i).getId()%>"><%=memArr.get(i).getId() %></a></td>
					<td><%=memArr.get(i).getName() %></td>
					<td><%=memArr.get(i).getAddr() %></td>
					<td><%=memArr.get(i).getGrade() %></td>
					<td><%=memArr.get(i).getPoint() %></td>
					<td><a href="/serverweb/member/delete.do?id=<%=memArr.get(i).getId() %>">����</a></td>
				</tr>
		<%
			}
		%>
	</table>
</body>
</html>