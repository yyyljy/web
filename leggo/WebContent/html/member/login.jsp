<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv='content-type' content='text/html; charset=UTF-8' />

<title>Login : LEGGO</title>

<link rel="stylesheet" href="/leggo/css/member/login.css" />
<link rel="stylesheet" href="/leggo/css/member/login1.css" />

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
							<h1>로그인</h1>
							<div class="field">
								<input class="form-control" type="text" id="user_id" name="user_id" value="" placeholder='아이디' />
							</div>
							<div class="field">
								<input class="form-control" type="password" id="pass" name="pass" placeholder="비밀번호" />
							</div>
							<button type="submit" class="submit blue-btn full-width"
								onclick="ga('send', 'event', { eventCategory: 'account', eventAction: 'signed up', eventLabel: 'sign up button'});">로그인</button>
							<div class="text-center mt15">
								<a href="/en/security/password_recovery/email/check" class="recover"> 비밀번호 찾기 </a>
							</div>
							<div class="text-center mt15">
								계정이 없으신가요?
								<a class="recover" href="/leggo/html/member/sign_up.jsp">회원가입</a>
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
