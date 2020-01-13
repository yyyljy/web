# jquery

www.jquery.com

## `버전 체크`



- 자바스크립트 라이브러리

1. DOM
   - 선택자($)
2. Ajax
3. effect
4. jQuery UI - www.jquery.com

- 선택자 & slideToggle() _ 화면에서 이미지 나타났다 사라지게

  ```javascript
  <script type="text/javascript">
  	//페이지가 로딩되고 dom객체가 형성이 되면 익명의 함수를 실행하겠습니다.	
  		$(document).ready(function() {
  			//alert("jQuery 시작.....")
  			//clickMe로 id가 정의된 객체가 클릭되면 익명의 함수를 사용
  			$("#clickMe").click(function() {
  				//id = "picframe" 객체가 화면에 보이도록
  				//다시 클릭하면 화면에서 사라지도록
  				$("#picframe").slideToggle();
  			})
  		});
  </script>
  ```

- 선택자

  ```javascript
  <script type="text/javascript">
  		$(document).ready(function(){
  			$("#ultag").on("click", function() {
  				$("ul li:first").css("color","red");
  			});
  			$("#ulAll").on("click", function() {
  				$("ul:first-child").css("color","blue");
  			});
  			$("#href").on("click", function() {
  				$("[href]").css("color","skyblue");
  			});
  			$("#attrVal").on("click", function() {
  				/* $("[target='_blank']").css("color","yellow"); */
  				$("a[target!='_blank']").css("color","pink");
  				/* a태그이면서 _blank속성이 아닌것 */
  			});
  		});
  </script>
  ```

- append, prepend, after, before, remove, empty

  ```javascript
  <script type="text/javascript">
  	data = $("<p>dom엑세스하는 방법</p>");
  	$(document).ready(function() {
  		$("#append").on("click", function() {
  			$("#btns").append(data);	
  		});
  		$("#prepend").on("click", function() {
  			$("#btns").prepend(data);	
  		});
  		$("#after").on("click", function() {
  			$("#btns").after(data);	
  		});
  		$("#before").on("click", function() {
  			$("#btns").before(data);	
  		});
  		$("#remove").on("click", function() {
  			$("#btns").remove();
  			//특정객체를 지우려면 선택자를 remove안에 정의
  			//선택된 노드와 하위노드를 모두 제거
  		});
  		$("#empty").on("click", function() {
  			$("#btns").empty(data);	
  			//선택된 노드의 하위노드만 제거
  		});
  	});
  </script>
  ```

- 특정 노드 접근, 제어, json형식으로 css 속성 정의

  ```javascript
  <script type="text/javascript">
  	//DOM노드 액세스
  	$(document).ready(function(){
  		$("#nodetest").on("click",function(){
              //특정노드의 하위 노드를 가져와서 작업하기
              /* 
              children() : 특정 노드의 하위노드를 모두 반환(엘리먼트 노드)
              last() : 특정 노드의 lastChild
              first() : 특정 노드의 firstChild
              */
              list = $("#main").children();
              alert(list.length);
              /* 
              메소드 체이닝이 가능 - 메소드의 반환결과로 바로 다른 메소드를 연결해서 호출할 수 있다.
              */
              $("#main").children().css("color", "blue");
              $("#main").children().last().css("color", "pink");
              //$("#main").children().first().css("color", "orange");
              //json의 형식으로 css속성을 정의
              $("#main").children().first().css(
  				{
  					"color":"blue",
  					"border":"solid 1px red"
  				}
  			);
      	});
  	});
  </script>
  ```

- 웹페이지에 값을 출력, html태그 사용

  ```javascript
  <script type="text/javascript">
  	//DOM노드 액세스
  	$(document).ready(function(){
  		$("p").hide();
  		//웹페이지에 값을 출력하기 - setter, html태그가 실행되지 않는다.
  		$("#result").text("<h1>div태그 내부에 텍스트를 추가하기</h1>");
  		//웹페이지에 값을 출력하기 - setter, html태그가 실행됨.
  		$("#result2").html("<h1>div태그 내부에 텍스트를 추가하기</h1>");
  	});
  </script>
  ```





