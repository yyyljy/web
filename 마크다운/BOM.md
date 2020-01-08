# BOM

- 브라우저에 출력되는 모든 구성요소를 객체로 정의하고 접근
- window
- location
- document
- form(양식태그)
- image



1. 접근방법

   1. 모든 객체는 계층 구조를 갖고 있다.

   2. form태그와 form태그 하위 태그를 객체로 접근하기 위해서 name 속성을 정의

      ```html
      <form name="myform">
          아이디:<input type="text" name="id">
          패스워드:<input type="password" name="pass">
      </form>
      ```

      window.document.폼객체.텍스트객체

      window.document.myform.id.속성(메소드)

      주로 window.document는 생략

   3. id를 정의하는 경우

      ```html
      <div id="mydiv">
      </div>
      ```

      객체 = document.getElementById("mydiv")

   4. 브라우저간 데이터 넘기기

      ```html
      <script type="text/javascript">
      		function printData(code,addr){
      			opener.document.myform.zipcode.value = code;
      			opener.document.myform.address.value = addr;
      			window.close();
      		}
      </script>
      ```

      

