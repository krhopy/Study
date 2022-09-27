package oop0913;

import java.util.Calendar;

// 	1) final 클래스 (종단클래스)

/*
	final class Animal{}
	class Elephant extends Animal{} 에러. final 클래스는 상속받을 수 없다.
*/

// 상속받는 방법 : extends Animal 
// → animal안에 있는 것을 elephant에서 사용할 수 있다.
// 상속은 (부모,자식) 관계가 성립이 된다.
// but, final class Animal{} --> final을 붙이면, elephant 클래스에서 에러가난다.


//	---------------------------------------------------------


//	2) final 메소드

class Fruit{
	void view() {}
	final void disp() {}
}//class end

class Apple extends Fruit { // 자식클래스 extends 부모클래스
//	void view() {}	
//	void disp() {}	상속 때문에 Fruit안에 있는 코드가 똑같이 여기 안에 숨어있다.
	
	@Override	// ← annotation 명령어, @ 재정의(리폼)
	void view() {}
	// 물려받은 메서드를 고쳐쓰는 것 => override
	
	/*
		@Override	
		void disp() {} 
		→ 에러남. disp()는 final메소드이기 때문에 더이상 리폼할 수 없다.
	*/
	
}//class end



public class Test03_final {

	public static void main(String[] args) {
		
//		[final 마지막]
//		- 변수	: const 상수화 (변할수 없는 값)
//		- 함수	: 더 이상 리폼(override 재정의)할 수 없다.
//				  내 것에 맞춰서 고쳐쓰는 것 (reform)
//		- 클래스  : 종단클래스. 마침표 찍으라는 말. 후손클래스 생성할 수 없다.

		int a=3;
		a=5;	 //변수는 다른 값으로 대입 가능
		
		
		final int b=2;		//자바스크립트에선 const int b=2;
//		--> 변수를 상수화 시킨 것
//		b=4; --> 에러. b는 final변수로 상수화 시켰으므로 다른 값을 대입시키지 못한다.
		
		
//		[Calender클래스에서 제공되는 값]
		System.out.println(Calendar.YEAR);	//1
		System.out.println(Calendar.MONTH);	//2
		System.out.println(Calendar.DATE);	//5
		
		System.out.println(Calendar.HOUR);	//10
		System.out.println(Calendar.MINUTE);//12
		System.out.println(Calendar.SECOND);//13
		
		/*
		  class Calendar {
		  		static final int YEAR=1;
		  		static final int MONTH=2;
		  		static final int DATE=5;
		  	}
		*/
		
//		==> Calendar.Year=2022; final변수값은 변경할 수 없다.
		
		
		
		
		
	}//main() end
	
}//class end
