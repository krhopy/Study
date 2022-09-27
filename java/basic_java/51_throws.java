package oop0916;

//throws 개념 참고하기
//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=highkrs&logNo=220239297118


class Test{
	
//	1) 각각의 try~catch을 직접 이용한 예외처리 (이런 방법도 있고~)
	
	/*
	public void view() {
		try {
			int a=3/0;
		} catch (Exception e) {
			System.out.println(e);
		}//end
	}//view() end
	
	
	public void disp() {
		try {
			int a=Integer.parseInt("KOREA");
		} catch (Exception e) {
			System.out.println(e);
		}//end
	}//disp() end
	*/
	
	
	
//	2) throws를 이용한 예외처리 (이런 방법도 있다~)
	
	// ★ view에서 예외가 나오면 throws Exception으로 던지라는 의미.★
	public void view() throws Exception {
		int a=3/0;
	}//view() end
	
	
	public void disp() throws NullPointerException, NumberFormatException {
		int a=Integer.parseInt("KOREA");
	}//disp() end
	
	
	//synchronized ? OS가 개입을해서 문제가 발생하지 않도록 조정하는 기법
	public synchronized void login() {}//login() end
	
}//class end



// <갑자기 깨달은 점...>
// 코드를 짤때 그냥 하나의 단어로만 보지말고 강사님처럼 이야기를 쓰면서 해보는게 어떨지? 
// public void view() throws Exception 이부분도
// 공식적으로 입력값을 받는 view() 메소드에서 예외가 나오묜 Exception 부모메소드로 던져라~
// 이렇게 말을 하면서 코드를 써보장고!




public class Test02_throws {

	public static void main(String[] args) {
		// throw문
		// → 메소드 호출시 예외처리를 한꺼번에 모아서 처리
		
		/*
		"예외를 던지다." 라는 말은 메소드 단위로 생각해야 한다.
		
		메소드 내부 소스코드에서 에러가 발생했을시 예외처리를 
		"try~catch"로 자기자신이 예외처리하는 것이 아니라,
		이 메소드를 사용하는 곳으로 책임을 전가하는 행위이다.
		*/
		
		
		try {
			Test test=new Test();
			test.view();
			test.disp();
		} catch (Exception e) {
			System.out.println(e);
		}//end
		
		
		
		
		
	} // main() end
	
} // class end
