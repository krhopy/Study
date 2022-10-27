package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	참조 https://docs.oracle.com/javaee/7/api/
	
	● HttpServlet 클래스
	- http 프로토콜 기반의 요청과 응답을 처리해주는 클래스
	
	● 결과확인
	- http://localhost:9090/basic05_mvc/wel.do
	→ wel.do를 어딘가에 저장해두고 사용해야 한다.
	
	● Welcome 서블릿 클래스
	- web.xml (배치관리자)에 등록해야한다.
*/

public class Welcome extends HttpServlet {

	//나의 클래스의 부모가 class 	   : extends 	상속(확장)
	//나의 클래스의 부모가 interface : implements 상속(구현)
	// interface의 키워드 "미완성"을 생각한다. 본체가 없는 것. method reform하는 override를 사용해줘야한다.
	
	//족보 보러가기 HttpServlet의 부모 보러가기
	@Override //← 부모가 가진 것을 재정의(리폼)
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req 사용자가 요청한 정보, resp 사용자가 요청한 정보에 응답
		
		//전송방식 method=get방식으로 요청이 들어오면, doGet() 함수가 자동으로 호출 된다.
		//req  : 모델1(myweb)방식의 내부객체 request와 동일한 변수이다. 
		//resp : 모델1(myweb)방식의 내부객체 response와 동일한 변수이다. 
		
		try {
			
			//1. HTML 문서 구조로 응답
			//resp를 선언하면 요청한 상황애 응답해줄 수 있다.
			resp.setContentType("text/html; charset=UTF-8"); //2바이트이상의 문자열일 경우 이걸로 응답해준다.
			
			//2. 단순 문자열 응답(AJAX)
			//resp.setContentType("text/plain; charset=UTF-8");
			
			//요청한 사용자에게 응답하기 위한 출력 객체
			PrintWriter out=resp.getWriter();
			//getWriter()의 return형 printwriter
			out.print(" <!DOCTYPE html> ");
			out.print(" <html> ");
			out.print(" <head> ");
			out.print(" 	<meta charset='UTF-8'> ");
			out.print(" 	<title>환영합니다</title> ");
			out.print(" </head> ");
			out.print(" <body> ");
			out.print(" 	<strong>대한민국</strong> ");
			out.print(" 	<hr> ");
			out.print(" 	<span style='color:red'>오필승코리아</span> ");
			out.print(" 	<hr> ");
			out.print(" 	<table border='1'> ");
			out.print(" 	<tr> ");
			out.print(" 		<th>이름</th> ");
			out.print(" 		<th>무궁화</th> ");
			out.print(" 	</tr> ");
			out.print(" 	</table> ");
			out.print(" </body> ");
			out.print(" </html> ");
			
		} catch (Exception e) {
			System.out.println("요청실패:" + e);
		}//end
		
	}//doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//전송방식 method=post방식으로 요청이 들어오면, doPost() 함수가 자동으로 호출 된다.
	}//doPost() end
	
	
	
}//class end

















