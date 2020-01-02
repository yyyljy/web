## 양식(form)

```html
<form action="" method="get">

</form>
```
### 1. 텍스트 관련 태그

```html
<form action="/clientweb/member/login.jsp" method="get">
		<h2>1. 텍스트 관련 태그</h2>
		아이디:<input type="text" name="id" size="100" maxlength="0"><br/>
		패스워드:<input type="password" name="pass"><br/>
		닉네임:<input type="text" name="nickname" value ="별칭을 입력하세요"
        															disabled=disabled">
		비고:<br/>
		<textarea rows="30" cols="30" name="info">자기소개</textarea>
</form>
```


### 2. 버튼관련 태그

```html
		<h2>2. 버튼 관련 태그</h2>
		<input type="submit" value="서버로 전송하기">
		<input type="reset" value="입력취소하기">
		<input type="button" value="자바스크립트 연결하는 버튼"
				onclick="alert('환영합니다.')"/>
```



### 3. 선택관련 태그

```html
		<h2>3. 선택관련 태그</h2>
		<h3>체크 박스</h3>
		<input type="checkbox" name="subject1" value="자바">자바
		<input type="checkbox" name="subject1" value="서블릿" checked="checked">서블릿
		<br/><br/>

		<h3>라디오버튼</h3>
		<input type="radio" name="subject2" value="자바">자바
		<input type="radio" name="subject2" value="JDBC" checked="checked">JDBC
		
		<h3>선택리스트</h3>
		<select name="subject4">
			<option value="hadoop">hadoop</option>
			<option value="sqoop">sqoop</option>
		</select>
		
		<h3>선택리스트(사이즈, 멀티플 옵션)</h3>
		<select name="subject5" size="10" multiple="multiple">
			<option value="hadoop">hadoop</option>
			<option value="hive">hive</option>
		</select>
```



### 4. 기타 태그

```html
		<h3>4. 기타 태그</h3>
		<input type="file" name="photo" value="파일선택">
		<input type="date" name="regdate">	

		<h2>fieldset이용하기</h2>
		<fieldset>
			<legend>좋아하는 과목</legend>
			<input type="checkbox" name="subject1" value="자바">자바
			<input type="checkbox" name="subject1" value="서블릿" checked="checked">서블릿
		</fieldset>
		<br/><br/>
```

