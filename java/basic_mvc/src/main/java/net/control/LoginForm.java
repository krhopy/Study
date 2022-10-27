package net.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet{
	
	//결과확인 http://localhost:9090/basic05_mvc/login.do
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전송방식 method=get 요청
		
		//페이지 이동 (myweb/scope폴더에 공부내용 있음)
		
		//1)http://localhost:9090/basic05_mvc/control/loginForm.jsp
		//resp.sendRedirect("control/loginForm.jsp"); //서블릿을 이용해 jsp페이지 불러오는 것.
		
		//2)http://localhost:9090/basic05_mvc/login.do
		String view="control/loginForm.jsp";
		RequestDispatcher rd=req.getRequestDispatcher(view);
		rd.forward(req, resp);
		//페이지 이동 명령어. view경로에 rd.foward변수를 사용하도록 해준다.
		
	}//doGet() end
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전송방식 method=post 요청
		super.doPost(req, resp);
	}//doPost() end
	
	
	
	

}//class end
