<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukRead.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<h3>* 성적 상세보기 *</h3>
	<p>
		<a href="sungjukForm.jsp" class="btn btn-info" role="button">성적쓰기</a>
		<a href="sungjukList.jsp" class="btn btn-default" role="button">성적목록</a>
	</p>
<% 
	//예) sungjukRead.jsp?sno=3
	int sno=Integer.parseInt(request.getParameter("sno"));
	// sno로 넘어온 페이지값을 Int로 형변환 해서 변수에 담아준다.

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	try {
		
		String url	   ="jdbc:oracle:thin:@localhost:1521:xe"; 
		String user	   ="system";
		String password="1234"; 
		String driver  ="oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		con =DriverManager.getConnection(url, user, password);
		//out.println("오라클 DB 서버 연결 성공!!");
		
		StringBuilder sql=new StringBuilder();
		sql.append(" SELECT sno, uname, kor, eng, mat, tot, aver, addr, wdate ");
		sql.append(" FROM sungjuk ");
		sql.append(" WHERE sno=? ");
		
		pstmt=con.prepareStatement(sql.toString());	// con(결과값) sql문을 실행시켜주는 명령어.
		pstmt.setInt(1, sno);
		
		rs=pstmt.executeQuery(); 
		if(rs.next()) { 
%>
			<table class="table table-bordered" >
			<tr>
				<th>이름</th>
				<td><%= rs.getString("uname") %></td>
			</tr>		
			<tr>
				<th>국어</th>
				<td><%= rs.getInt("kor") %></td>
			</tr>
			<tr>
				<th>영어</th>
				<td><%= rs.getInt("eng") %></td>
			</tr>
			<tr>
				<th>수학</th>
				<td><%= rs.getInt("mat") %></td>
			</tr>
			<tr>
				<th>평균</th>
				<td><%= rs.getInt("aver") %></td>
			</tr>
			<tr>
				<th>주소</th>
				<td>
					<%= rs.getString("addr") %>
<% 
					//주소를 한글로 출력
					String addr=rs.getString("addr");
					if(addr.equals("Seoul")){
						out.print("서울");
					}else if(addr.equals("Jeju")){
						out.print("제주");
					}else if(addr.equals("Suwon")){
						out.print("수원");
					}else if(addr.equals("Busan")){
						out.print("부산");
					}//if end
%>				
				</td>
			</tr>	
			<tr>
				<th>작성일</th>
				<td><%= rs.getString("wdate") %></td>
			</tr>	
			</table>
			<br><br>
			<a href="sungjukUpdate.jsp?sno=<%= sno %>">[수정]</a>
			&nbsp;&nbsp;
			<a href="sungjukDel.jsp?sno=<%= sno %>">[삭제]</a>

<%
		}else {
			out.println("해당 글 없음!!");
		}//if end
		
		
	}catch (Exception e) {
		out.println("오라클DB연결실패:" + e);
	}finally {//자원반납 (순서주의)
		try {
			if(rs!=null) {pstmt.close();}
		}catch (Exception e){}
		try {
			if(pstmt!=null) {pstmt.close();}
		}catch (Exception e){}
		try {
			if(con!=null) {con.close();}
		}catch (Exception e){}
	}//end
%>
</div>
</body>
</html>