<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Sign in : LEGGO</title>

<link rel="stylesheet" href="/leggo/css/member/login.css" />
<link rel="stylesheet" href="/leggo/css/member/login1.css" />
</head>

<body id="signup" class="">
	<div class="container-flex">
		<div id="page-wrap">
			<a href="#" class="logo-center"><img src="/leggo/images/LeggoLogo.png" alt=""></a>
			<div id="page-content">
				<div class="text-center">
					<div class="auth-form-wrap" style="top: 50%">
						<form name="sign_up" method="post" class="auth-form">
							<h1>Sign up</h1>
							<div class="field">
								<input type="text" id="sign_up_id"
									name="sign_up[id]" required="required"
									placeholder="���̵�" class="form-control" />
							</div>
							<div class="field">
								<input type="password" id="sign_up_password_first"
									name="sign_up[password][first]" required="required"
									placeholder="��й�ȣ" class="form-control" />
							</div>
							<div class="field">
								<input type="password" id="sign_up_password_second"
									name="sign_up[password][second]" required="required"
									placeholder="��й�ȣ Ȯ��" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_pass_hint"
									name="sign_up[pass_hint]" required="required"
									placeholder="��й�ȣ ��Ʈ" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_pass_answer"
									name="sign_up[pass_answer]" required="required"
									placeholder="��й�ȣ �亯" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_name"
									name="sign_up[name]" required="required"
									placeholder="�̸�" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_birth"
									name="sign_up[birth]" required="required"
									placeholder="�������" class="form-control" />
							</div>
							<div class="field">
	                            <select id="sign_up_gender" name="sign_up[gender]" class="form-control" aria-label="����">
	                                <option value="" selected>����</option>
	                                        <option value="M">����</option>
	                                        <option value="F">����</option>
	                            </select>
                       		</div>
							<div class="field">
								<input type="text" id="sign_up_tel"
									name="sign_up[tel]" required="required"
									placeholder="�Ϲ���ȭ ��ȣ" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_mobile"
									name="sign_up[tel]" required="required"
									placeholder="�޴���ȭ ��ȣ" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_postcode"
									name="sign_up[postcode]" required="required"
									placeholder="������ȣ" class="form-control1" />
								<input type="button" id="sign_up_getaddr" 
									name="sign_up[getaddr]" onclick="execDaumPostcode()"
									value="������ȣ ã��" class="form-control1">
							</div>
							
							<div class="field">
								<input type="text" id="sign_up_address"
									name="sign_up[address]" required="required"
									placeholder="�ּ�" class="form-control" />
							</div>
							<div class="field">
								<input type="text" id="sign_up_email"
									name="sign_up[email]" required="required"
									placeholder="���� Ȯ�� �̸���" class="form-control" />
							</div>
							<div class="field">
								<label>
								<input type="checkbox" id="trader_sign_up_agree" name="trader_sign_up[agree]" required="required" value="1" />
								������ �а� �����մϴ� <br/>
									<a	href="/leggo/html/member/agree.jsp" target="_blank"> �������� ���</a>,
									<a	href="/leggo/html/member/agree.jsp" target="_blank"> ��ġ���� ����</a> �� <a	href="/leggo/html/member/agree.jsp" target="_blank"> �������� ��ȣ ��å </a>
								</label>
							</div>
							<button type="submit" class="blue-btn full-width mb15">�����ϱ�</button>
							<div class="text-center mt15">
								�̹� ������ �����Ű���? <a class="recover"
									href="/leggo/html/member/login.jsp">�α��� �ϱ�</a>
							</div>
							<input type="hidden" id="trader_sign_up__token"
								name="trader_sign_up[_token]"
								value="k8iU24x1kcfLMVlcA5bM7Qo2oYjQ_29i4CMdUoNEhcM" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="/build/vendors~1b74f6a7.js"></script>
	<script src="/build/vendors~f47f0fb3.js"></script>
	<script src="/build/common.js"></script>
	<script src="/build/signup.js"></script>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //�� ���������� ���θ� �ּ� ǥ�� ��Ŀ� ���� ���ɿ� ����, �������� �����͸� �����Ͽ� �ùٸ� �ּҸ� �����ϴ� ����� �����մϴ�.
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.

                // ���θ� �ּ��� ���� ��Ģ�� ���� �ּҸ� ǥ���Ѵ�.
                // �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
                var roadAddr = data.roadAddress; // ���θ� �ּ� ����
                var extraRoadAddr = ''; // ���� �׸� ����

                // ���������� ���� ��� �߰��Ѵ�. (�������� ����)
                // �������� ��� ������ ���ڰ� "��/��/��"�� ������.
                if(data.bname !== '' && /[��|��|��]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // �ǹ����� �ְ�, ���������� ��� �߰��Ѵ�.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // ǥ���� �����׸��� ���� ���, ��ȣ���� �߰��� ���� ���ڿ��� �����.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // ������ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
                document.getElementById('sign_up_postcode').value = data.zonecode;
                document.getElementById("sign_up_address").value = roadAddr;
            }
        }).open();
    }
</script>
</body>
</html>