<%@page import="member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		MemberDTO member = (MemberDTO)request.getAttribute("member");
		System.out.print("member_read:"+member);
	%>
	<div class="container-fluid">
		<form role="form" class="form-horizontal"
			action="/serverweb/action?id=<%="001"%>&state=UPDATE"
			method="get">
			<fieldset>
				<div id="legend">
					<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
				</div>
				<div class="form-group">
					<!-- �μ��ڵ� -->
					<label class="control-label col-sm-2" for="orgcode">�μ��ڵ�</label>
					<div class="col-sm-3">
						<!-- �μ��ڵ带 �̰��� ����ϼ��� -->
						<%=member.getDeptNo() %>
					</div>
				</div>

				<div class="form-group">
					<!-- �μ���-->
					<label class="control-label col-sm-2" for="orgname">ID</label>
					<div class="col-sm-3">
						<!-- �μ����� �̰��� ����ϼ��� -->
						<%=member.getId() %>
					</div>
				</div>

				<div class="form-group">
					<!-- �μ���ġ-->
					<label class="control-label col-sm-2" for="orgloc">�ּ�</label>
					<div class="col-sm-3">
						<!-- �μ���ġ�� �̰��� ����ϼ��� -->
						<%=member.getId() %>
					</div>
				</div>
				<div class="form-group">
					<!-- ��ȭ��ȣ-->
					<label class="control-label col-sm-2" for="orgtel">���</label>
					<div class="col-sm-3">
						<!-- �μ���ȭ��ȣ�� �̰��� ����ϼ��� -->
						<%=member.getGrade() %>
					</div>
				</div>

				<div class="form-group">
					<!-- �Ŵ���-->
					<label class="control-label col-sm-2" for="orgtel">����Ʈ</label>
					<div class="col-sm-3">
						<!-- �����ڸ� �̰��� ����ϼ��� -->
						<%=member.getPoint() %>
					</div>
				</div>
				<div class="form-group">
					<!-- Button -->
					<div class="col-sm-3 col-sm-offset-2">
						<input type="submit" value="����" class="btn btn-success" />
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>