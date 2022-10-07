<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>07_ok.jsp</title>
</head>
<body>
	<h3>* 계산 결과 *</h3>
<% 
	//한글 인코딩
	request.setCharacterEncoding("UTF-8");

	//사용자가 입력 요청한 정보 가져오기
	//예) <input type="number" name="num1">  → 100% 리턴형은 String 으로 가져와진다. 형변환 시켜야한다.
	int num1=Integer.parseInt(request.getParameter("num1").trim()); 
	int num2=Integer.parseInt(request.getParameter("num2").trim());
	//num1, num2의 리턴형이 string이기때문에 int로 형변환 시키고 trim() 공백 제거해준다.
	String op=request.getParameter("op").trim(); 
	
	int res1=0;			//정수형 계산 결과
	double res2=0.0;	//실수형 계산 결과
	
	if(op.equals("+")){
		res1=num1+num2;
	}else if(op.equals("-")){
		res1=num1-num2;
	}else if(op.equals("*")){
		res1=num1*num2;
	}else if(op.equals("/")){
		res2=num1/num2;
	}else if(op.equals("%")){
		res1=num1%num2;
	}//if end
%>
<!-- 출력 -->
	<div>
		<table>
		<tr>
			<td><%=num1%></td>
			<td><%=op%></td>
			<td><%=num2%></td>
			<td>=</td>
			<td>
<% 
				if(op.equals("/")){
					out.print(String.format("%.1f", res2));
				}else{
					out.print(res1);
				}//if end
%>
		     </td>
		</tr>
		</table>
	</div> 


	
	
<%-- <%
	int num1=Integer.parseInt(request.getParameter("num1").trim());
	String op=request.getParameter("op");
	int num2=Integer.parseInt(request.getParameter("num2").trim());

	
	double cal=0;
	switch(op) {
		case "+" : cal += num1+num2; break;
		case "-" : cal += num1-num2; break;
		case "*" : cal += num1*num2; break;
		case "/" : cal += num1/num2; break;
		case "%" : cal += num1%num2; break;
	}//switch end
%>

<div>
	<%= num1 %>	<%= op %> <%= num2 %> = <%= cal %>
</div> --%>

	
</body>
</html>