<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>elTest3.jsp</title>
</head>
<body>
	<h3>* EL 내장객체 (Collection) *</h3>
<% 
	//1) JSP 내장객체
	// → pageContext(현재페이지), request(부모/자식만), session(나만), application(페이지전체)
	// ▷ 이 순서대로 외우기
	
	//내부변수 선언
	//※ 참조 : myweb 프로젝트의 /webapp/scope 폴더
	pageContext.setAttribute("kor", 100); //현재 페이지에서만 쓸 수 있는 변수
	request.setAttribute("eng", 200);	  //전역변수(부모랑 자식페이지에서만 유효)
	session.setAttribute("mat", 300);	  //전역변수(모든페이지에서 유효 + 개인사용자 + 시간)
	application.setAttribute("aver", 400);//전역변수(모든페이지에서 유효 + 모든사용자)
%>

	1) JSP<br>
	kor  : <%=pageContext.getAttribute("kor")%><br>
	eng  : <%=request.getAttribute("eng")%><br>
	mat  : <%=session.getAttribute("mat")%><br>
	aver : <%=application.getAttribute("aver")%><br>
	<hr>
	
	
<!--  
	2) EL의 내장객체(Collection)
	→ param, pageScope, requestScope, sessionScope, applicationScope
-->
	2) EL<br>
	kor : ${pageScope.kor}<br>
	eng : ${requestScope.eng}<br>
	mat : ${sessionScope.mat}<br>
	aver: ${applicationScope.aver}<br><br>

	<!-- EL에서는 내장객체명을 생략할 수 있다.(pageScope, requestScope, sessionScope, applicationScope) -->
	2) EL - 객체이름 생략도 가능<br>
	kor : ${kor}<br>
	eng : ${eng}<br>
	mat : ${mat}<br>
	aver: ${aver}<br><br>
	<!-- 이렇게 생략해서 쓰면 scope의 범위가 어떤 건지 어떻게 알 수 있는지? -->
	<!-- ▷ EL에서는 page → request → session → allication 순서로 알아서 자동으로 검색을 해준다.-->
	<!-- 변수명으로 구분을 시켜준다. -->
	
	
	<!-- 각 Scope에 내장변수명이 동일한 경우 -->
<% 
	pageContext.setAttribute("num", 500); 
	request.setAttribute("num", 600);	  
	session.setAttribute("num", 700);	 
	application.setAttribute("num", 800);
%>
	<!-- 내장객체명이 생략되면 자동으로 작은 영역순으로 찾게된다. -->
	num : ${num} <!-- 500 -->
	<hr>
	
	<!-- 각 Scope의 내장변수가 없는 경우 -->
	JSP : <%=request.getAttribute("uname")%><br> <!-- null -->
	<br>
	EL : @${requestScope.uname}@ <!-- 글자개수 0개인 빈 문자열이 출력된다. -->

	
</body>
</html> 