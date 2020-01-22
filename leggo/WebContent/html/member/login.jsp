<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv='content-type' content='text/html; charset=UTF-8' />

<title>Login : LEGGO</title>

<link rel="stylesheet" href="/leggo/css/main.css" />

</head>
<body id="login" class="main_frame">
	<div class="container-flex">
		<div id="page-wrap">
			<a href="#" class="logo-center"><img src="/leggo/images/LeggoLogo.png" alt=""></a>
			<div id="page-content">
				<div class="text-center">
					<div class="auth-form-wrap" style="top: 45%">
						<br>
						<form action="/member/login" method="post" class="auth-form">
							<h1>�α���</h1>
							<div class="field">
								<input class="form-control" type="text" id="user_id" name="user_id" value="" placeholder='���̵�' />
							</div>
							<div class="field">
								<input class="form-control" type="password" id="pass" name="pass" placeholder="��й�ȣ" />
							</div>
							<button type="submit" class="submit blue-btn full-width"
								onclick="ga('send', 'event', { eventCategory: 'account', eventAction: 'signed up', eventLabel: 'sign up button'});">�α���</button>
							<div class="text-center mt15">
								<a href="/en/security/password_recovery/email/check" class="recover"> ��й�ȣ ã�� </a>
							</div>
							<div class="text-center mt15">
								������ �����Ű���?
								<a class="recover" href="/leggo/html/member/sign_up.jsp">ȸ������</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/build/vendors~1b74f6a7.js"></script>
	<script src="/build/vendors~f47f0fb3.js"></script>
	<script src="/build/common.js"></script>
	<script src="/build/login.js"></script>
</body>
</html>
