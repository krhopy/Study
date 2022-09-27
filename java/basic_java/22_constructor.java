package oop0908;

import java.util.GregorianCalendar;


// [School 클래스 선언] ------------------------------------------------------------------------------

class School {
	
//	[멤버변수 field] ---------------------------------------------------------------------------------
	
	private String name;
	private int kor, eng, mat;
	private int aver;

	
//	[생성자 함수 constructor] = iv 초기화 메서드(대입문, 어떤 결과를 반환할 것이 없다)
//	 → 이름이 클래스 이름과 같아야 한다.
//	 → 리턴값이 없다.(void 안붙임) - public void School(){} 주의! 에러가 나지않지만 잘못된 문법이다.
//	 → 모든 클래스는 반드시 생성자를 가져야 한다. (- 기본생성자)
	

	public School() { // [기본 생성자 함수 default constructor]
					  // → 매개변수가 없는 생성자
					  // → 생성자가 하나도 없을 때만, 컴파일러가 자동으로 추가한다.
					  // → 컴파일러가 자동으로 추가해준다해도 기본적으로 직접 추가해주는 것을 원칙으로 한다.
		System.out.println("School() 호출됨");
	}//end
	
//	# 생성자 함수도 오버로딩(함수명 중복정의)이 가능하다.
//	# 매개변수의 수만 다르면 중복정의도 가능하다.
	
	public School(String n) {
		name=n;
	}//end
	
	
	public School(int k, int e, int m) {
		kor=k;
		eng=e;
		mat=m;
	}//end
	
	
	public School(String n, int k, int e, int m) {
		name=n;
		kor=k;
		eng=e;
		mat=m;
	}//end
	
	
	
	
//	[멤버함수 method] ------------------------------------------------------------------------------------
	
	void calc() {
		aver=(kor+eng+mat)/3;
	}//calc end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
}//class end


////////////////////////////////////////////////////////////////////////
public class Test02_constructor {

	public static void main(String[] args) {
//		 생성자 함수(Constructor)
//		 → 클래스명과 동일한 함수
//		 → 언제쓰는가 ? new 연산자 함께 메모리 할당 할 때.
//		 → 오버로딩이 가능하다
		
//		소멸자 함수(Destructor) → 자바에는 소멸자라는 개념이 없음!!		
//		가비지 콜렉팅(Garbage Collecting)
//		→ JVM이 자동으로 메모리를 회수함.
		
		
		GregorianCalendar today=new GregorianCalendar(); // 자바의 .. 정석..
		// 이걸 생성하면 위에 import가 자동으로 된다.
		// 변수의 자료형은 동일하게 만들어줘야한다.
		// object = intance = bean 객체라는 같은 말
		
		if(today.isLeapYear(2022)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		
		//문) 서기1년~서기2022년까지의 윤년의 개수를 구하시오.
		//1) GregorianCalendar클래스 활용(추천)
		
//		int count1=0;
//		for(int y=1; y<=2022; y++) {
//			if(today.isLeapYear(y)) {
//				count1++;
//			}//if end
//		}//for end
//		
//		System.out.println(count1);//502
//		
//		//2) 윤년 구하는 공식
//		int count2 = 0;
//		for (int y=1; y<=2022; y++) {
//			if(y%4==0 && y%100!=0 || y%300==0) {
//				count2++;
//			}//if end
//		}//for end
//		
//		System.out.println(count2);//490
		
		//////////////////////////////////////////////////////////////
		
//		new School();	//객체 Object, 인스턴스 Instance, 
//		new School();	
	
		/*
		School one=new School(); //#100번지 참조변수 변수에 담는다. 그래야 컨트롤하기 쉽다.
		System.out.println(one.hashCode());
		one.calc();
		one.disp();
		
		//null 비어 있는 값. 아무것도 없는 상태
		String a=new String("");	//빈문자열
		String b=null;				//클래스에는 null값도 넣을 수 있다. 메모리 할당 하지 않고 b라는 참조변수만 선언해 놓는 것.
		System.out.println(a.length()); //메모리 할당을 받았다는 의미. 글자개수 0
//		System.out.println(b.length()); //Exception 에러메세지 NullPointerException : 어딘가에 null값이 들어가있다는 의미.
		
		System.out.println("null");	//문자열 상수
		System.out.println(true);	//boolean형
		System.out.println("true");	//문자열 상수
		*/
		//////////////////////////////////////////////////////////////
		
		
		//생성자 함수의 전달값은 객체선언과 동시에 초기값을 전달해 주는 역할을 한다.

		
//		public School(String n) {
//			name=n;
//		}//end
		
		School two=new School("개나리");
		two.calc();
		two.disp();
		
		
//		----------------------------------------------------------
		
		
//		public School(int k, int e, int m) {
//			kor=k;
//			eng=e;
//			mat=m;
//		}//end
		
		School three=new School(10, 20, 35);
		//int a=3; 그냥 이런 변수선언과 비슷하게 생각하면 된다..
		three.calc();
		three.disp();
		
		
//		----------------------------------------------------------		
		
		
//		public School(String n, int k, int e, int m) {
//			name=n;
//			kor=k;
//			eng=e;
//			mat=m;
//		}//end
		
		School four=new School("진달래", 40, 50, 55);	
		four.calc();
		four.disp();
		//생성자 함수가 많은 클래스가 좋음. 여러 상황에 대처할 수 있다.
		
		
////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		String str1="손흥민";
		String str2=new String("박지성");
		System.out.println(str1);
		System.out.println(str2);
		
		// 둘다 사용 가능하다.
		
		
		
		
			
		
	}//main() end
}//class end
