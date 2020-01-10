# *BOM & DOM*

# `BOM`

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

      주로 window.document는 생략(내 문서 내에서 제어 할 때)

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

2. window

   1. 대화상자

      - alert
      - prompt
      - confirm

   2. popup

      - open
      - close

   3. 자동실행

      - setTimeout
      - setInterval
      - clearInterval

   4. 데이터처리

      - parseInt : 숫자모양을 한 문자열을 숫자로 변환

      - inNaN : 입력받은 값이 숫자인지 문자인지 화인

        ​				(타입을 비교하지 않고 실제 값을 비교 - 문자가 입력되면 true)

      - eval : 매개변수로 전달된 데이터(식,연산)를 실제로 실행(보안취약)

      - trim : 공백을 제거
   
3. event

   - onclick
   - onkeyup
   - onmouseover, onmouseout
   - onchange
   - onload



# `DOM`

자식노드를 받아올 때 공백 노드도 생기니까 꼭 처리 해주기

parentNode.lastchild - 공백 포함

parentNode.lastElementChild - 공백 포함 x