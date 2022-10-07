<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>07_calc.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h3> * 계산기 연습 * </h3>
		<form name="calcfrm" id="calcfrm" method="get" action="07_ok.jsp">
		 <div class="form-group row">
			<div class="col-xs-2">
				<label for="pwd">첫번째 수 :</label>
				<input type="number" name="num1" class="form-control" min="0" max="100" required> 
			</div>
			<div class="col-xs-2">
				<label for="pwd">연산자 :</label>
				<input type="text" name="op" class="form-control" size="3" required>
		  	</div>
		  	<div class="col-xs-2">
				<label for="pwd">두번째 수 :</label>
				<input type="number" name="num2" class="form-control" min="0" max="100" required>
			</div>
		   </div>
			
			<input type="submit" class="btn btn-default" value="계산">                      
	  		<input type="reset"  class="btn" value="취소"> 
		</form>
	</div>
</body>
</html>