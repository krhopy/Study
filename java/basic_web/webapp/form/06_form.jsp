<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_form.jsp</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h3> * 성적 입력 * </h3>
		<form name="sungjukfrm" id="sungjukfrm" method="post" action="06_ok.jsp">
			<div class="form-group">
				<label for="usr">이름:</label>
				<input type="text" class="form-control" name="uname" id="uname" size="10" maxlength="20" placeholder="이름" required> 
			</div>
			<div class="form-group">
				<label for="usr">국어:</label>
				<input type="number" class="form-control" name="kor" id="kor" size="5" min="0" max="100">
			</div>
			<div class="form-group">
				<label for="usr">영어:</label>
				<input type="number" class="form-control" name="eng" id="eng" size="5" min="0" max="100">
			</div>
			<div class="form-group">
				<label for="usr">수학:</label>
				<input type="number" class="form-control" name="mat" id="mat" size="5" min="0" max="100">
		  	</div>
		  	
		  	<input type="submit" class="btn btn-info" value="전송">
		  	<input type="reset" class="btn btn-default"  value="취소">
		</form>
	</div>
	<!--  
		● [<form>과 관련된 다양한 속성들]
		  - 사용자가 입력한 정보를 서버로 전송하기 위한 양식	  
		  - 하나의 from에 <input type="submit" value="전송"> 이 버튼을 누르면 <form> 전체가 전송된다.
		  
		  name	  : 폼이름. 	 서버에서 식별하기 위한 이름 (보통 id로 접근하는 것을 추천. 하지만  서버에 도착해서는 name으로 접근해야한다.)
		  id	  : 폼아이디.   Frontend단에서 식별자로 주로 사용
		  method  : 폼 전송방식. get | post방식, 가끔 생략할 때가 있는데 그때 기본은 get방식으로 사용한다.
		  action  : 사용자가 요청한 정보를 서버가 받아서 처리할 결과 페이지
		  enctype : 폼에서 파일을 첨부해서 서버로 전송하고자 할 때 추가해야하는 속성. "multipart/form-data" 추가
		
		
		● [폼 전송방식] method
		  1) method=get방식 (기본)
		  	 - 생략 시 기본값
		  	 - 사용자가 입력 요청한 정보가 URL 그대로 노출 
		  	 - 한글 안깨짐
		  	 - ok.jsp?서버로전송되는값들 (공백주면안된다)
		  	   형식)요청페이지(또는 명령어)?변수=값&변수=값&변수=값 ~~
		  	   예)06_ok.jsp?uname=대한민국&kor=40&eng=50&mat=60
		  	   예) 검색어
		  	   
		  2) method=post방식
		     - 사용자가 요청한 정보가 URL에 노출되지 않고 팩키지화 되어서 서버로 전송
		     - 한글 깨짐
		     - 예) 비번, 주민번호, 카드번호 등 
		  
	
	-->
	
</body>
</html>