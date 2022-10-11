<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukUpdate.jsp</title>
	<meta charset="UTF-8">
	<title>sungjukForm.jsp</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	<style type="text/css">
  	  	
  		#button {
		  background-color: #555555;
		  border: none;
		  color: white;
		  padding: 7px 12px;
		  text-align: center;
		  text-decoration: none;
		  display: inline-block;
		  font-size: 14px;
		  margin: 4px 2px;
		  cursor: pointer;
		  border: 1.8px solid #555555;
		}
		
		
		#button:hover {
		  background-color: white; 
		  color: #555555;
		}
		
		th {
			--border-top: 1px solid #EAEDED;
			font-size: 15px;
			font-weight: bold;
		}
		
		#title {
		  padding: 10px;
		  text-align: left;
		  border-bottom: 1px solid #EAEDED;
		}
		
		#click {
			align: right;
		}
  	
  	</style>
	
</head>
<body>
<div class="container">
	<h3 align="left" style="margin-top: 60px;">성적 수정</h3><br><br>
	<p>
		<a href="sungjukForm.jsp" id="button" role="button">성적쓰기</a>
		<a href="sungjukList.jsp" id="button" role="button">성적목록</a>
	</p>
<% 
	//수정하고자 하는 글 번호 sungjukUpdate.jsp?sno=62
	int sno=Integer.parseInt(request.getParameter("sno"));

	// read에서 가져온 것은 단 한 줄! 따라서 dto
	// 주의사항 : select한 결과에 한해서만 rs에 담고~ 해당 내용을 dto에 담는다.
	dto=dao.read(sno);
	if(dto==null){
		out.println("해당 글없음!!");
	}else{
%>
	<!-- sungjuk 폴더에서 작업해놓은게 있으니 가져다쓰기 -->
	<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukUpdateProc.jsp">
		<!-- 수정하고자 하는 글 번호 -->
		<input type="hidden" name="sno" value="<%=sno%>">
		<br>
		<table>
		<tr>
		  <th id="title" class="control-label col-sm-2">이름 :</th>
		  <td id="title">
		  <!-- 위에서 dto에 담아놨으니(setter) 가져와야한다(getter) -->
		  <input type="text"  class="form-control" name="uname" value="<%=dto.getUname()%>" maxlength="20" required autofocus>
		  </td>
		</tr> 
		<tr>
		  <th id="title" class="control-label col-sm-2">국어 :</th>
		  <td id="title">
		  <input type="number" class="form-control" name="kor" value="<%=dto.getKor()%>" size="5" min="0" max="100" placeholder="숫자입력">
		  </td>
		</tr>
		
		<tr>
		  <th id="title" class="control-label col-sm-2">영어 :</th>
		  <td id="title">
		  <input type="number" class="form-control" name="eng" value="<%=dto.getEng()%>" size="5" min="0" max="100" placeholder="숫자입력">
		  </td>
		</tr> 
		<tr>
		  <th id="title" class="control-label col-sm-2">수학 :</th>
		  <td id="title">
		  <input type="number" class="form-control" name="mat" value="<%=dto.getMat()%>" size="5" min="0" max="100" placeholder="숫자입력">
		  </td>
		</tr>
		<tr>
		  <th id="title" class="control-label col-sm-2">주소 :</th>
		  <td id="title">
		  	<% String addr=dto.getAddr();%> 
		      <select name="addr" class="form-control">
	              <option value="Seoul" <% if(addr.equals("Seoul")) {out.print("selected");} %>>서울</option>
	              <option value="Jeju" <% if(addr.equals("Seoul")) {out.print("selected");} %>>제주</option>
	              <option value="Suwon" <% if(addr.equals("Seoul")) {out.print("selected");} %>>수원</option>
	              <option value="Busan" <% if(addr.equals("Seoul")) {out.print("selected");} %>>부산</option>
		      </select> 
		  </td>
		</tr>
		<tr>
		  <td colspan="2" align="right" style="padding: 10px">
		     <input type="submit" class="btn btn-info" value="전송">
		     <input type="reset" class="btn btn-default" value="취소">
		  </td>
		</tr>
		</table>
	</form>

<% 

	}//if end


%>
</div>
</body>
</html>