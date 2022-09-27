package oop0915;

class School extends Object {
	String name="학교";
	public School() {
		System.out.println("School()...");
	}
}//School class end


class MiddleSchool extends School {
	public MiddleSchool() {
		
//		super() : 상속관계에서 부모 생성자 함수 호출 명령어
		super(); // 이 코드가 생략되어 있는 것. 생략가능함.
		System.out.println("MiddleSchool()...");
	}
	
	public void disp() {
		System.out.println(name);
//		HighSchool 클래스에는 name이라는 변수가 없지만 Schcool class를 부모로 물려받고 있기 때문에 보이지 않아도 가지고 있다.
	}//disp() end
	
}//MiddleSchool class end


class HighSchool extends School {
	String name="고등학교";
	
	public HighSchool() {
		super();
		System.out.println("HighSchool()...");
	}//HighSchool class end
	
	public void disp() {
		String name="강남고등학교";
		
		System.out.println(name);	   //String name="강남고등학교";					지역변수
//		HighSchool 클래스에는 name이라는 변수가 없지만 Schcool class를 부모로 물려받고 있기 때문에 보이지 않아도 가지고 있다.
		System.out.println(this.name); // String name="고등학교"; 접근하고 싶다면?			나의 멤버변수 "this=나"
		System.out.println(super.name);// 부모에 있는 String name="학교"; 접근하고 싶다면?	부모의 멤버변수
	}//disp() end
	
}//class end



public class Test01_super {

	public static void main(String[] args) {
		
//		[super 부모,조상]
//		- superclasses 부모클래스들 
//		- subclasses   자식클래스들
		
//		super	: 자식클래스에서 부모클래스의 멤버에 접근할 때
//		super() : 자식클래스의 생성자 함수가 부모클래스의 생성자 함수를 호출할 때
		
//		this	: 멤버변수(field)와 일반 지역변수를 구분하기 위해
//		this()	: 자신의 생성자함수가 자신의 생성ㅓ자함수를 호출할 때
		
		
// 	〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		
//		[class 사용하기]
		
		
		MiddleSchool ms=new MiddleSchool();
//		School()... -> MiddleSchool()...
//		상속관계에 있을 때 생성자 함수는 부모생성자부터 먼저 출력된다.
		ms.disp();
		
		System.out.println("-----------------");


		HighSchool hs=new HighSchool();
//		School()... → HighSchool()...
		hs.disp();
		

		
	} // main() end
	
} // class end
