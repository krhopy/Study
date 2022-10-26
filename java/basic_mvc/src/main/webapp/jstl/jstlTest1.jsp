<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 
	● Directive(지시자)의 종류
	<%@ page contentType="text/html; charset=UTF-8" %>
	<%@ include file="" %> 			  : header, footer 같은 공통코드 삽입할 때
	<%@ taglib uri="uri" prefix="" %> : 커스텀 태그가 있는 도서관. Custom tag(사용자 정의 태그) 사용할 때
--%>

<%-- JSTL를 사용하려면 Directive를 지정한다.  url사이트에서 jstl문법을 제공해준다.--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- c=접두어 --%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest1.jsp</title>
</head>
<body>
	<h3>* JSTL (JSP Standard Tag Library. JSP전용태그) *</h3>
	<!-- jsp 명령어를 선언해놓은 사이트를 연결하고 사용해야한다. -->
	
	1)JSP 변수 선언 <br>
	<% int a=3; %>
	a : <%=a%>
	<hr>
	
	2) JSPL 변수 선언<br>
	<c:set var="b" value="5"></c:set> <%-- <c:set></c:set> : 변수선언 태그 --%>
	<c:set var="c" value="7"></c:set>
	b : ${b}<br>
	c : ${c}<br>
	b+c : ${b+c}<br>
	<hr>
	
	3) 출력<br>
	<c:out value="2"></c:out><br>
	<c:out value="${b}"></c:out><br>
	<c:out value="${c}"></c:out><br>
	<c:out value="${b+c}"></c:out><br>
	<hr>
	
	4) b, c 변수 제거<br>
	<c:remove var="b"/>
	<c:remove var="c"/>
	<c:out value="${b}"></c:out><br>   <!-- 빈값 -->
	<c:out value="${c}"></c:out><br>   <!-- 빈값 -->
	<c:out value="${b+c}"></c:out><br> <!-- 0 -->
	<hr>
	
	5) 자바 객체 선언도 가능하다<br>
	<c:set var="dt" value="<%=new Date() %>"></c:set>
	오늘날짜 : ${dt}<br>
	오늘날짜 : <c:out value="${dt}"></c:out><br>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>