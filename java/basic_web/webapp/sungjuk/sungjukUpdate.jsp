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
	<title>sungjukUpdate.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<h3>* 성적 수정 *</h3>
	<p>
		<a href="sungjukForm.jsp" class="btn btn-info" role="button">성적쓰기</a>
		<a href="sungjukList.jsp" class="btn btn-default" role="button">성적목록</a>
	</p>
<% 
	//1)수정하고자 하는 글 번호 sungjukUpdate.jsp?sno=3
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
			//2)단계. 1)의 내용을 폼에 출력 sungjukForm.jsp참조
%>				
			<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukUpdateProc.jsp" class="form-horizontal" action="/action_page.php">
				<input type="hidden" name="sno" value="<%=sno%>"> 
				<table>
				<tr>
				  <th>이름</th>
				  <td><input type="text" name="uname" value="<%= rs.getString("uname") %>" ="20" required autofocus></td>
				  <!-- autofocus 미리 커서가 가있는 것 -->
				</tr> 
				<tr>
				  <th>국어</th>
				  <td><input type="number" name="kor" value="<%= rs.getInt("kor") %>" size="5" min="0" max="100" placeholder="숫자입력"></td>
				</tr>
				<tr>
				  <th>영어</th>
				  <td><input type="number" name="eng" value="<%= rs.getInt("eng") %>" size="5" min="0" max="100" placeholder="숫자입력"></td>
				</tr> 
				<tr>
				  <th>수학</th>
				  <td><input type="number" name="mat" value="<%= rs.getInt("mat") %>" size="5" min="0" max="100" placeholder="숫자입력"></td>
				</tr>
				<tr>
				  <th>주소</th>
				  <td>
				  	 <% String addr=rs.getString("addr");%> 
				      <select name="addr">
			              <option value="Seoul" <% if(addr.equals("Seoul")) {out.print("selected");} %>>서울</option>
			              <option value="Jeju"  <% if(addr.equals("Jeju"))  {out.print("selected");} %>>제주</option>
			              <option value="Suwon" <% if(addr.equals("Suwon")) {out.print("selected");} %>>수원</option>
			              <option value="Busan" <% if(addr.equals("Busan")) {out.print("selected");} %>>부산</option>
				      </select> 
				  </td>
				</tr>
				<tr>
				  <td colspan="2" align="center">
				     <input type="submit" value="수정">
				     <input type="reset"  value="취소">
				  </td>
				</tr>
				</table>
			</form>	


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