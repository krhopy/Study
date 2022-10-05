<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>05_내부객체.jsp</title>
</head>
<body>
<% 
	/*
	● [JSP페이지 실행과정]
	  - 톰캣WAS에 의해서 .java와 .class가 자동으로 생성된다.
	  - .java 파일이 .class로 번역되어 실행된다.
	  예) hello.jsp → hello_jsp.java → hello_jsp.class
									  ▶ 실제론 class파일이 실행됨.
					  ▶ .java파일을 만들어야 할 때가 있다.
					  ▶ 코드가 지저분해지고 복잡해질 때가 있다. (스파게티코드)
		
	  예) hello_jsp.java 소스 저장 경로
	  I:\java202207\workspace
					\.metadata
					\.plugins
					\org.eclipse.wst.server.core
					\tmp0
					\work
					\Catalina
					\localhost
					\basic04_web
					\org
					\apache
					\jsp
					\form
					
	 ● [JSP 내부객체]
	   - 톰캣서버에 의해 자동으로 생성된 객체
	   - 개발자는 별도의 객체를 선언하지 않고 가져다 사용만 한다.
	   
	 ★ 1) out 	  	  : 출력객체
					    JspWriter out
	 ★ 2) request 	  : 사용자가 요청한 정보를 관리하는 객체
					    HttpServletRequest request
	 ★ 3) response	  : 요청한 사용자에게 응답을 관리하는 객체
					    HttpServletResponse response
	   4) session	  : 요청한 사용자를 개별적으로 구분하기 위한 객체
		   			    HttpSession session
		   			    ex) 캐비닛, 강의장
	   5) application : 모든 사용자가 공유하는 값 또는 서버에 대한 정보를 관리하는 객체
					    ServletContext application
	   6) pageContext : JSP, JSTL, EL등 현재 페이지내에서 서로 다른 문법과의 값을 교류할 수 있다
		   			    PageContext pageContext
		
					  
	
					  
	*/
%>
</body>
</html>
