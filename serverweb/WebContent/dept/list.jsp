<%@page import="dept.DeptDTO"%>
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
	<%  
		//���� �������� ArrayList<DeptDTO>��ü ��������
		ArrayList<DeptDTO> deptlist =
			(ArrayList<DeptDTO>)request.getAttribute("deptlist");
		int size = deptlist.size();	%>
	<h1>�μ���Ϻ���~~~~^^</h1>
	<hr/>
	<table width="500px" border="1">
		<tr>
			<th>�μ��ڵ�</th><th>�μ���</th><th>��ġ</th>
			<th>��ȭ��ȣ</th><th>������</th><th>����</th>
		</tr>
		<%for(int i=0;i<size;i++){ 
			DeptDTO dept = deptlist.get(i);%>
			<tr>
				<td><%= dept.getDeptNo() %></td>
				<td><a href="/serverweb/dept/read.do?deptNo=<%=dept.getDeptNo() %>&info=�ѱ۵�����"><%= dept.getDeptName() %></a></td>
				<td><%= dept.getLoc() %></td>
				<td><%= dept.getTel() %></td>
				<td><%= dept.getMgr() %></td>
				<td>
			<a href="/serverweb/dept/delete.do?deptNo=<%=dept.getDeptNo() %>">����</a></td>
			</tr>
		<%} %>
	</table>
</body>
</html>













