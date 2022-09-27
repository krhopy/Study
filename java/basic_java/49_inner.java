package oop0915;

import oop0915.WebProgram.Language;
import oop0915.WebProgram.Smart;

class WebProgram {	//웹페이지를 작성할 때 사용하는 언어 
					// .jsp  .python  .asp  .php
	
	String title="Java Program";
	
	
	class Language{
		String basic="JAVA, HTML, CSS, JavaScript";
		void display() {
			System.out.println("기초수업:" + basic);
		}//end
	}//inner class
	
	
	class Smart{
		String basic="Objective-C, Java OOP, C#";
		void display() {
			System.out.println("기초수업:" + basic);
		}//end
	}//inner class
	
	
	public void print() {
		Language lang=new Language();
		lang.display();
		
		Smart sm=new Smart();
		sm.display();
		
	}//print() end

	
	
}//class end


public class Test09_inner {

	public static void main(String[] args) {
//		● 내부클래스 inner class ●
//		→ 클래스 내부에서 선언된 클래스
//		→ [이유] 두 클래스가 서로 긴밀한 관계에 있기 때문
//		잘 사용하지 않는다..

		
		WebProgram web=new WebProgram();
		web.print();
		

//		에러남!!
//		Language lang=new Language();
//		Smart sm=new Smart();
		
		Language lang=new WebProgram().new Language();
		lang.display();
		
		Smart sm=new WebProgram().new Smart();
		sm.display();
//		→ 내부클래스의 접근은 . 점으로 한다.
		
		
//		------------------------------------------------
		
		/*	
		 	안드로이드 (구글사에서 만든 모바일 전용 OS)에서 볼 수 있는 내부클래스
		 	→ 직접 만드는게 아니고 시스템에서 제공하는 클래스. 반드시 보게된다. 반..드..시
		 		
		 	class R {
		 		class id{
		 			String btn="버튼";
		 		}
		 	}
		 	
		 	접근방식 R.id.btn
		*/
		
		
	} // main() end
	
} // class end
