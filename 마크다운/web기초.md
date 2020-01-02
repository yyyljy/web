### 설정

`이클립스` - Tomcat admin port = 8005

서버 삭제(3가지 모두 수행해야됨) - 인터페이스 하단 Servers 탭에서 딜리트

​															 인터페이스 좌측 Servers 딜리트, on disk 체크박스 체크

​															 Window - Preferences - Server - Rumtime environment 삭제 



`태그`= `엘리먼트`

" <>안에 단어로 정의해놓은 것 "

`webapps` - `Tomcat`에서 `context`를 모아놓은 곳



### 웹 요청 방식

http://127.0.0.1:8088/context명/요청할webapplication

http://				 - 프로토콜

127.0.0.1			- 웹서버 ip

8088					- 포트(web의 기본 포트 80 생략가능)

context명			- 기본 context는 생략(root)



### `context` 추가하는 방법

```html
<Context docBase="c:\mypro" path="/mypro" reloadble="true" debug="0"/>
```

- docBase - context로 추가할 실제 경로
- path - 해당 context의 url 주소



### context 구성요소 - *web 시험 문제*

- jsp, html, javascript, css, image 파일

- WEB-INF - web.xml(context 설정파일)

  ​					lib(라이브러리 폴더)

  ​					classes(자바파일 폴더(servlet, DAO, DTO, 로직))



## .metadata\\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps

- 이클립스에서 작업 내용이 실제 서버에 보이는 부분

