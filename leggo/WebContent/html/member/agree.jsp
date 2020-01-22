<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<title>LEGGO : �������</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div id="header">
		<div id="logo">
			<h1 id="header_logo_h1">
				<a>LEGGO(�ΰ�)</a>
			</h1>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<div class="join_content">
				<div class="join_form">
					<form id="join_form" method="POST" >
						<p class="terms_chk_all">
							<input type="checkbox" id="chk_all" name="chk_all">
							<label for="chk_all">
								<span class="chk_all_txt">
									�̿���, �������� ���� �� �̿�, ��ġ���� �̿���(����)�� ��� �����մϴ�.
								</span>
							</label>
						</p>
						<p class="terms_chk_service">
							<input type="checkbox" id="chk_service" name="chk_service" class="terms_chk">
							<label for="chk_service">
								<span class="chk_term_txt">
									LEGGO �̿��� ����(�ʼ�)
								</span>
							</label>
						</p>
						<div class="terms_box">
							<div class="terms_txt">
								<p class="terms_txt">
									LEGGO �̿��� ���� �ۼ�<br/>
									LEGGO �̿��� ���� �ۼ�<br/>
									LEGGO �̿��� ���� �ۼ�<br/>
									LEGGO �̿��� ���� �ۼ�<br/>
									LEGGO �̿��� ���� �ۼ�<br/>
								</p>
							</div>
						</div>
						<p class="terms_chk_privacy">
							<input type="checkbox" id="chk_privacy" name="chk_privacy" class="terms_chk">
							<label for="chk_privacy">
								<span class="chk_term_txt">
									�������� ���� �� �̿� ����(�ʼ�)
								</span>
							</label>
						</p>
						<div class="terms_box">
							<div class="terms_txt">
								<p class="terms_txt">
									�������� ���� �� �̿� ���� ��� ���� �ۼ�<br/>
									�������� ���� �� �̿� ���� ��� ���� �ۼ�<br/>
									�������� ���� �� �̿� ���� ��� ���� �ۼ�<br/>
									�������� ���� �� �̿� ���� ��� ���� �ۼ�<br/>
									�������� ���� �� �̿� ���� ��� ���� �ۼ�<br/>
								</p>
							</div>
						</div>
						<p class="terms_chk_location">
							<input type="checkbox" id="chk_location" name="chk_location" class="terms_chk">
							<label for="chk_location">
								<span class="chk_term_txt">
									��ġ���� �̿��� ����(����)
								</span>
							</label>
						</p>
						<div class="terms_box">
							<div class="terms_txt">
								<p class="terms_txt">
									��ġ���� �̿��� ���� �ۼ�<br/>
									��ġ���� �̿��� ���� �ۼ�<br/>
									��ġ���� �̿��� ���� �ۼ�<br/>
									��ġ���� �̿��� ���� �ۼ�<br/>
									��ġ���� �̿��� ���� �ۼ�<br/>
								</p>
							</div>
						</div>
						<div class="btn_box">
							<span class="btn_area">
								<a href="#" id="btn_join" class="btn">Ȯ��</a>
							</span>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#chk_all").on("click", function() {
				if ($("#chk_all").is(":checked")) {
		            $("#chk_service").prop("checked",true);
		            $("#chk_privacy").prop("checked",true);
		            $("#chk_location").prop("checked",true);
		        } else {
		            $("#chk_service").prop("checked",false);
		            $("#chk_privacy").prop("checked",false);
		            $("#chk_location").prop("checked",false);
		        }
			});
			$("#btn_join").on("click", function() {
				if(checkTerms()){
					$("#join_form").submit();
				}
			})
		});
		function checkTerms() {
	        if ($("#chk_service").is(":checked") == false || $("#chk_privacy").is(":checked") == false) {
	            alert("�ʼ� ����� ��� �������ּ���.");
	            return false;
	        } else {
	        	return true;
	        }
	    }
	</script>
</body>
</html>