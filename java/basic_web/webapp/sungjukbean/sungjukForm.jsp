<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukForm.jsp</title>
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h3>*성적 입력 폼*</h3>
	<p><a href="sungjukList.jsp" class="btn btn-default" role="button">성적목록</a></p>
	
	<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukIns.jsp" class="form-horizontal" action="/action_page.php">
	<!-- 현재는 jsp만 사용해 코딩하지만 보통 jsp로만 코딩하지않고 .java와 함께 코딩한다. -->
		<table class="table">
		<tr>
		  <th class="control-label">이름 : </th>
		  <td>
		  <input type="text"  class="form-control" name="uname" maxlength="20" required autofocus>
		  </td>
		  <!-- autofocus 미리 커서가 가있는 것 -->
		</tr> 
		<tr>
		  <th class="control-label col-sm-2">국어 : </th>
		  <td><input type="number" class="form-control" name="kor" size="5" min="0" max="100" placeholder="숫자입력"></td>
		</tr>
		
		<tr>
		  <th class="control-label col-sm-2">영어 : </th>
		  <td><input type="number" class="form-control" name="eng" size="5" min="0" max="100" placeholder="숫자입력"></td>
		</tr> 
		<tr>
		  <th class="control-label col-sm-2">수학 : </th>
		  <td><input type="number" class="form-control" name="mat" size="5" min="0" max="100" placeholder="숫자입력"></td>
		</tr>
		<tr>
		  <th class="control-label col-sm-2" >주소 : </th>
		  <td>
		      <select name="addr" class="form-control">
	              <option value="Seoul">서울</option>
	              <option value="Jeju">제주</option>
	              <option value="Suwon">수원</option>
	              <option value="Busan">부산</option>
		      </select> 
		  </td>
		</tr>
		<tr>
		  <td colspan="2" align="center">
		     <input type="submit" class="btn btn-info" value="전송">
		     <input type="reset" class="btn btn-default" value="취소">
		  </td>
		</tr>
		</table>
	</form>
</div>
	
</body>
</html>