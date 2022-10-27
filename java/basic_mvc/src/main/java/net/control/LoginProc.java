package net.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProc extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method=post 방식이면 service()함수가 doPost()함수를 호출함
		try {
			
			req.setCharacterEncoding("UTF-8");
			String uid=req.getParameter("uid").trim();
			String upw=req.getParameter("upw").trim();
			
			if(uid.equals("itwill") && upw.equals("1234")) {
				//테스트로 조건을 준 것 (원래는 dao로 사용자에게 요청값 받아와야함)
				//로그인 성공했을 때
				req.setAttribute("r_uid", uid);
				req.setAttribute("r_upw", upw);
			}else {
				//로그인 실패했을 때
				req.setAttribute("r_uid", "guest");
				req.setAttribute("r_upw", "guest");
			}//if end
			
			
			//뷰페이지 이동
			String view="control/loginResult.jsp";
			//부모페이지 class LoginProc / 자식페이지 control/loginResult.jsp
			RequestDispatcher rd=req.getRequestDispatcher(view);
			rd.forward(req, resp);
			
			
			
			
		} catch (Exception e) {
			System.out.println("요청실패:" + e);
		}//end
	}//doPost() end
	
}//class end
