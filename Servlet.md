# Servlet

- 클라이언트 페이지에서 발생하는 클라이언트의 요청을 처리하기 위한 기술
- 클라이언트로부터 요청이 전달되면 서버에서 실행되며 DB연동이나 서버의 자원을 엑세스하여 만들어진 결과를 클라이언트로 응답해준다.
- 클라이언트의 요청을 인식하고 실행하기 위해서는 서블릿은 정해진 규칙대로 작성되어야 하고, 서버가 서블릿을 찾아서 실행할 수 있도록 **`정해진 위치`**에 작성되어야 한다.
- **`정해진 위치`** = 표준화 된 폴더 구조안에 있는 classes폴더(서블릿 디렉토리)



## 1. 서블릿 작성 규칙

   가. 표준화된 폴더 구조 안에서 서블릿 디렉토리에 저장돼야 한다.

   	- classes 폴더
            	- (\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\serverweb\WEB-INF\classes)
                        	- ex) ../WEB-INF/classes/serverweb 

   나. public 클래스로 작성해야 된다.

   ​	=> 서버가 찾아서 실행해야 하므로

   다. 서블릿 클래스를 상속해야 된다.

   ​	=> 서버가 우리가 작성한 서블릿 클래스를 찾아서 생성하고 호출하기 위해서는 서버가 인식할 수 있는

   ​         (서버가 사용할 수 있는) 타입이어야 하므로 서버에 등록된 타입으로 서블릿 클래스를 작성한다.

   라. 서버가 호출하는 메소드를 오버라이딩 해야된다.

​	   => 서블릿 클래스는 일반 클래스를 사용하는 방법처럼 객체 생성해서 사용하는 클래스가 아니다.

​			서블릿이 호출되면 서버가 서블릿 객체를 생성하고 적절한 시점에 따라 메소드를 자동으로 호출한다.

​			즉, 서블릿의 Lifecycle을 서버가 관리한다.

​            서버가 적절한 시점에 따라 자동으로 메소드를 호출할 때 원하는 작업을 처리하기 위해서는

​            서버가 호출하는 메소드를 오버라이딩해서 내가 원하는 내용을 기술해야 한다. 

​			[오버라이딩할 메소드]

  - init : 서블릿이 초기화될 때 호출

  - service : 클라이언트가 요청을 하면 호출되는 메소드

    ​				클라이언트의 요청을 처리할 수 있는 내용을 기술(로그인, 게시판 목록 보기, 회원가입....)

    ​				요청방식의 구분없이 모두 호출

- doGet : service와 동일하게 동작하며 클라이언트가 get방식으로 요청하는 경우에만 호출

- doPost : service와 동일하게 동작하며 클라이언트가 post방식으로 요청하는 경우에만 호출

- destroy : 서블릿 객체가 소멸될 때 (메모리에서 해제될 때) 호출

   마. 서블릿을 등록

  - 서버가 서블릿을 찾아서 실행할 수 있도록 서블릿을 web.xml에 등록

    - 서블릿 등록 : 사용할 서블릿이 어떤 클래스인지 정의
    
      ```xml
      <servlet>
        	<servlet-name>서블릿의 이름(alias)</servlet-name>
        	<servlet-class>실제 사용할 서블릿 클래스(패키지포함)</servlet-class>
      </servlet>
      ```
    
    - 서블릿 맵핑 : 서브릿을 어떤 url로 요청할지 등록
    
      ```xml
      <servlet-mapping>
        	<servlet-name>미리 등록한 서블릿의 이름</servlet-name>
        	<url-pattern>요청url(반드시 /나 .으로 시작)</url-pattern>
      </servlet-mapping>
      ex) /first.multi
      ```
    
      

## 2. 서블릿 요청 방법

- get방식으로 요청

  - 주소표시줄에 입력하고 요청

    => 테스트용으로 사용 http://70.12.115.56:8088/serverweb/first.multi

    - ex) GuGuServlet작성하기 (콘솔에 7단 출력)
      - 서블릿명 : gugu
      - 요청url : /gugu.html
      - FirstServlet과 동일한 방법으로 요청, .java와 실행화면 캡쳐 제출

  - 하이퍼링크를 클릭

    `<a href="http://서버ip:port/contextpath/서블릿요청url">하이퍼링크</a>`

  - `<form>` 태그에서 method속성을 "get"으로 설정하고 submit버튼 선택

    - action속성에 설정한다.

    - form태그를 정의하면서 method속성을 생략하면 get방식으로 요청

    - `<form method="get" action="/contextpath/서블릿요청url">`

      ​	`<input type="submit" value="전송"/>`

      `</form>`

    - submit버튼을 누러서 요청하면 `<form>`태그의 action속성에 정의한 서블릿이 요청되며

       `<form></form>` 내부에 정의한 모든 양식 태그들의 name과 value가 서블릿으로 전달된다.

- post방식으로 요청

  - `<form>` 태그에서 method속성을 "post"로 설정하고 submit버튼 선택

    - action속성에 설정한다.

    - form태그를 정의하면서 method속성을 생략하면 post방식으로 요청

    - `<form method="post" action="/contextpath/서블릿요청url">`

      ​	`<input type="submit" value="전송"/>`

      `</form>`

    - submit버튼을 누러서 요청하면 `<form>`태그의 action속성에 정의한 서블릿이 요청되며

       `<form></form>` 내부에 정의한 모든 양식 태그들의 name과 value가 서블릿으로 전달된다.

- 요청방식

  - get : 요청할 때 입력하는 내용이 url뒤에 추가되어 전송되는 방식(요청메세지 헤더에 추가)

    ​		클라이언트가 입력하는 내용이 그대로 노출된다.

    ​		전송할 수 있는 데이터의 크기에 제한이 있다.

    ​		서버의 데이터를 가져오기

    ​		ex) 게시판 목록 확인하기, 상품정보 가져오기, 검색하기....

  - post : 요청 메세지 body에 추가되어 전송되므로 클라이언트에 노출되지 않지만 툴을 이용하면

    ​		확인할 수 있으므로 암호화해서 전송해야된다.

    ​		보낼 수 있는 데이터 크기에 제한이 없다.

    ​		서버의 값을 클라이언트가 원하는 값으로 update(변경)하는 경우

    ​		ex) 회원등록(insert), 회원정보 수정하기(update), 파일업로드...

## 3. 클라이언트가 전달하는 요청 메세지에서 클라이언트의 입력정보를 추출하기

- 클라이언트가 요청 메세지를 서버로 전달하면 여러가지 클라이언트 정보(클라이언트가 입력한 데이터, 쿠키, 세션정보, 클라이언트의 ip, port..)가 서버로 전달된다. 서버는 이 데이터를 가지고 요청객체를 생성한다.

  - http프로토콜에 특화된 내용은 => HttpServletRequest에서 찾는다.
  - 일반적인 내용은 ServletRequest에서 찾는다.

- 요청 정보 추출

  - getParameter

    - ServletRequestgetParameter

      ServletRequest의 메소드로 메소드를 호출하며 전달한 name에 대한 value를 리턴
      
      리턴값 : String으로 `파라미터값`
      
      ​			`파라미터값` : 주소표시줄에 직접넘긴 value로 =의 오른쪽 문자열
      
      ​								form태그를 이용해서 사용자가 직접 입력한 값
      
      매개변수 : String으로 `파라미터 이름`
      
      ​				`파라미터 이름` : 주소 표시줄에 직접 넘긴 name으로 =의 왼쪽에 있는 문자열
      
      ​											양식태그를 정의할 때 name속성에 정의한 값
      
      ​											<input type="text" name="id">
    
  - getParameterValues
  
    ServletRequest의 메소드로 파라미터명이 같은 모든 value를 모아서 String[]로 리턴
  
    => CheckBox, List에서 복수 개 선택, 임의로 동일한 이름을
  
    리턴타입 :  String[]

## 4. DB연동

qweqwe