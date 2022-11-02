package kr.co.itwill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//URL에서 요청한 명령어를 읽어서 처리해주는 클래스로 지정해준다.
//HelloController 클래스는 컨트롤러 기능이다.
//스프링컨테이너(웹서버)가 자동으로 객체를 생성해서 주입을 시켜주는 것이다.
@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("-------HelloController()객체 생성됨");
	}//end
	
	//결과확인 http://localhost:9095/spring02_mvc
	//결과확인 http://localhost:9095/↑이 파일명 사용하지 않는다.
	//자동으로 Spring02MvcApplication.java가 알아서 경로를 만들어준다.
	
	//< 결과확인 http://localhost:9095/hello.do >
	//결과확인은 이 경로로 한다.
	//요청명령어 등록하고 실행의 주체는 메소드(함수단위로 코딩을 하면 된다.)
	
	//명령어 등록하고 함수 만드는 작업을 반복
	
	//public으로 열어놔야 요청을 받을 수 있다
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		
		ModelAndView mav = new ModelAndView();
		
		//application.properties 환경 설정 파일의 prefix와 suffix값을 조합해서 뷰페이지를 완성
		// /WEB-INF/views/hello.jsp
		mav.setViewName("hello");
		
		//서로 다른 페이지들 간에 값을 공유하기 위해서
		// → request, session, application 활용
		
		// request 접근시켜줄 수 있는 명령어가 있다
		// request.setArrtibute()함수와 동일
		mav.addObject("message", "Welcome to MyHome!!");
		
		
		return mav;
		//void 
		
	}//hello() end

}//class end











