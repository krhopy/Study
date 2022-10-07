<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukUpdate.jsp</title>
</head>
<body>
	<h3>* 성적 수정 *</h3>
	<p>
		<a href="sungjukForm.jsp" class="btn btn-info" role="button">성적쓰기</a>
		<a href="sungjukList.jsp" class="btn btn-default" role="button">성적목록</a>
	</p>
<% 
	int sno=Integer.parseInt(request.getParameter("sno"));
	int cnt=dao.update(sno);




%>
</body>
</html>