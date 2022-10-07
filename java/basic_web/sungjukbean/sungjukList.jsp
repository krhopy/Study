<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="net.sungjuk.*" %>

<jsp:useBean id="dao" class="net.sungjuk.SungjukDAO" scope="page"></jsp:useBean>
<jsp:useBean id="dto" class="net.sungjuk.SungjukDTO" scope="page"></jsp:useBean> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukList.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h3 class="my-5 h2">* 성적 목록 *</h3>
	<p><a href="sungjukForm.jsp" class="btn btn-info" role="button">성적쓰기</a></p>

	<table class="table table-hover table-fixed">
	<thead>
  	<tr>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>등록일</th>
	</tr>
	</thead>
<% 
	ArrayList<SungjukDTO> list=dao.list();
	
	if(list==null){
		out.println("<tr>");
		out.println("	<td colspan='5'>글없음!!</td>");
		out.println("</tr>");
	}else{
		for(int i=0; i<list.size(); i++){
			dto=list.get(i);
%>
		<tr>
			<td scope="row"><a href="sungjukRead.jsp?sno=<%=dto.getSno()%>"><%= dto.getUname() %></a></td>
			<td scope="row"><%= dto.getKor() %></td>
			<td scope="row"><%= dto.getEng() %></td>
			<td scope="row"><%= dto.getMat() %></td>
			<td scope="row"><%= dto.getWdate().substring(0, 10) %></td>
		</tr>
<% 
		}
	}//if end
	
%>
	</table>





</body>
</html>