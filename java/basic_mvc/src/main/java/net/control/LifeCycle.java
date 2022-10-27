package net.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	● HttpServlet 클래스의 계층도
	  class GenericServlet {}
	  class HttpServlet extends GenericServlet {}
	  class LifeCycle extends HttpServlet{}
	  
	● HttpServlet 생명주기---------------------------------
		init() 서블릿이 호출되면 1번만 호출
			→ service()
			→ service()
			→ service() 사용자가 요청할 때마다 계속 호출 (doGet()과 doPost()를 구분해주는 역할)
			→ service() (계속호출됨)
			→ service()
		destroy() 서버가 중지되면 1번만 호출
	-----------------------------------------------------

	● LifeCycle 서블릿을 /WEB-INF/web.xml에 등록해야함
	  (spring을 쓰면 이런거 안해도됨 ㅡㅡ)
	● 결과확인 http://localhost:9090/basic05_mvc/life.do
	  -> front단 만들지않고 생명주기만 보고 넘어갈 것이다.
	
*/
public class LifeCycle extends HttpServlet{
	//public class LifeCycle {
	//→ public class LifeCycle extends HttpServlet{ => LifeCycle 클래스를 서블릿으로 만들기
	
	
	//[생명주기에서 핵심적인 역할을 수행하는 클래스 5가지]
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=get방식으로 요청하면 service()함수가 doGet()을 호출한다.
		super.doGet(req, resp);
		System.out.println("doGet() 호출...");
	}//doGet() end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=post방식으로 요청하면 service()함수가 doPost()을 호출한다.
		super.doPost(req, resp);
		System.out.println("doPost() 호출...");
	}//doPost() end

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		//인터넷 페이지에서 어떤 페이지 요청할 때 -> 서비스를 요청한다라고 표현.
		//누군가로부터 계속 요청이 들어오는 것을 service가 항상 받는다.
		//URL을 통해서 요청이 들어오면 (새로고침) 전송방식이 method=get 또는 method=post 방식으로 서비스를 요청했는지 판단해서
		//doGet()과 doPost()함수를 구분해서 호출해주는 함수
		super.service(arg0, arg1);
		System.out.println("service() 호출...");
	}//service() end

	@Override
	public void destroy() {
		//서버가 중지되면 자동으로 1번만 호출
		super.destroy();
		System.out.println("destroy() 호출...");
	}//destroy() end

	@Override
	public void init() throws ServletException {
		//서블릿이 최초로 호출될 때 1번만 호출
		//초기 환경 설정할 때 사용
		super.init();
		System.out.println("init() 호출...");
	}//init() end
	
	
}//class end
