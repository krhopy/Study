<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest3.jsp</title>
</head>
<body>
	<h3>* JSTL 함수 *</h3>
	
	<c:set var="txt" value="  White    Space    "></c:set>
	

	글자개수 : ${fn:length(txt)}
	<hr>
	
	공백제거 : @<c:out value="${fn:trim(txt)}"></c:out>@
	<hr>
	
	
	
	<c:set var="str" value="Hi My Name is waldo"></c:set>
	
	문자열자르기 : ${fn:substring(str, 3, 9)} <!-- My nam -->
	<br> 
	${fn:toLowerCase(str)} <br> <!-- 소문자로 바꿔주는 함수 -->
	${fn:toUpperCase(str)}		<!-- 대문자로 바꿔주는 함수 -->
	<hr> 
	
<% 
	//엔터를 <br>로 바꾸기
	
	//1)JSP
	String content="";
	content=content.replace("\n", "<br>");
	
	//2)EL+JSTL
	pageContext.setAttribute("cn", "\n");
%>	
	<c:set var="content" value="Hi
								My name is
								Waldo"></c:set>
	
	${content}
	<hr>
	${fn:replace(content, cn, "<br>")}
	<hr>
	
	
	<!-- 3) <  > & ' " 특수문자 바꿔주는 함수 -->
	<c:set var="text" value="Hi
							 My <name> is
							 'W      a     l    d    o'"></c:set>
	
	${fn:escapeXml(text)}
	<hr>
	
	<!-- 특수문자 바꿔주는 함수 + 엔터를 <br>로 바꿔주는 함수 같이 -->
	${fn:replace(fn:escapeXml(text), cn, "<br>")}
	<!-- 특수문자 바꿔주는 함수 + 엔터를 <br>로 바꿔주는 함수 + 공백문자도 공백으로 바꾸기 -->
	${fn:replace(fn:replace(fn:escapeXml(text), cn, "<br>"), ' ' , '&nbsp;')}
	
	
</body>
</html>