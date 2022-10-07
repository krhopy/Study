<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="ssi.jsp" %> <!-- jsp코드가 많으면 이 include 사용해야한다. -->
<!-- <jsp:include page="ssi.jsp"></jsp:include>  ssi.jsp안에 jsp코드가 많이 들어가있다면 이 코드는 사용하면 안된다. 위에코드 사용해야한다. -->

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukRead.jsp</title>
</head>
<body>
		<h3>* 성적 상세보기 *</h3>
	<p>
		<a href="sungjukForm.jsp" class="btn btn-info" role="button">성적쓰기</a>
		<a href="sungjukList.jsp" class="btn btn-default" role="button">성적목록</a>
	</p>
<% 
	int sno=Integer.parseInt(request.getParameter("sno"));
	dto=dao.read(sno); 
	if(dto==null){
		out.println("해당 글없음!!");
	}else{
%>
	<table>
	<tr>
		<th>이름</th>
		<td><%= dto.getUname() %><td>
	</tr>
	<tr>
		<th>국어</th>
		<td><%= dto.getKor() %><td>
	</tr>
	<tr>
		<th>영어</th>
		<td><%= dto.getEng() %><td>
	</tr>
	<tr>
		<th>수학</th>
		<td><%= dto.getMat() %><td>
	</tr>
	<tr>
		<th>평균</th>
		<td><%= dto.getAver() %><td>
	</tr>
	<tr>
		<th>주소</th>
		<td><%= dto.getAddr() %><td>
	</tr>
	<tr>
		<th>작성일</th>
		<td><%= dto.getWdate() %><td>
	</tr>
	</table>
	<br><br>
	<a href="sungjukUpdate.jsp?sno=<%=sno%>">수정</a>
	&nbsp;&nbsp;
	<a href="sungjukDel.jsp?sno=<%=sno%>">삭제</a>


<%		
	}//if end

%>



</body>
</html>