package oop0908;	// ← 현재 클래스의 저장위치. 한번만 선언해야한다.

//	클래스를 사용하려면 반드시 저장위치(package)를 선언하고 사용
// package 두번 사용하면 문법적 오류
import java.io.*; 		 // ja.io 클래스 안에있는 것을 전부 사용 가능하다는 뜻.
import java.sql.*;
import java.util.Arrays; // 해당 클래스를 직접 선언할 수도 있다.
// 직접 언급하는 것과, 클래스를 전부 사용하는 것 중 어떤 것을 선택할지는 각자 판단.
import java.awt.*;		 // GUI 관련 클래스(주로 그래픽, 화면을 꾸미는 용도가 들어가있다)
import javax.swing.*;	 //	GUI 관련 클래스
import oop0907.*;


/*
	Access Modifier : 접근제어, 접근수정자 (4가지) 
	- 접근을 어디까지 허용하는지 ?
	- 설정할 필요가 없다. 이미 구조화되어서 다 설정되어 있음.
	
	(1) private   : 비공개 / 클래스 내부에서만 접근 가능하다 / 은닉할 수 있다.
	(2) package	  : 생략한다 / 현재 package(oop0908)안에서만 사용하라는 의미.
	(3) protected : 상속관계(부모자식)에 있는 클래스가 다른 패키지에 있는 경우에만 접근 가능하다.
	(4) public	  : 공개 / basic01_java프로젝트 내에서 모두 접근 가능.
	
	- (1) → (4) 갈수록 접근 범위가 넓어진다.
 */



// [성적 클래스 선언] ------------------------------------------------------------------------------

class Sungjuk { //package 생략되어 있음
				//package class Sungjuk
				//oop0908 package안에서만 사용할 수 있음
				// 클래스명의 첫글자는 대문자로 한다.
	
//	[멤버변수 field] (데이터베이스에선 column) ------------------------------------------------------
	
	public String name;	// 클래스 외부에서 접근 가능하다.
	int kor, eng, mat;	// package 생략되어있다. 0908안에서만 접근 가능하다.
	private int aver;	// Sungjuk클래스 내부에서만 접근 가능하다. (가장 보기 좋은 것. 일반적인 룰)
	
	
	

//	[멤버함수 1] ------------------------------------------------------------------------------------
	
	private void view() {}//view() end
	
	
//	[멤버함수 2] - aver 계산 ------------------------------------------------------------------------
	
	void calc() {	//package 생략되어 있음
					//클래스 내부의 멤버들 간에는 Access Modifier와 상관없이 접근 가능하다
		view();
		aver=(kor+eng+mat)/3;
	}//calc end
	
	
//	[멤버함수 3] - println 출력 모음 -----------------------------------------------------------------
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
//  -------------------------------------------------------------------------------- [성적 클래스 종료].
	
	
}//class end
// 잘못된방법은 아니지만 추천하는 방식은 아님.


//////////////////////////////////////////////////////////////////////////////////////////////////////////

//↓ Access Modifier
public class Test01_class {
	// 클래스 안에 클래스를 만들 수 있다. : inner class

	public static void main(String[] args) {
		//클래스와 객체 (object)
		// → 클래스명의 첫글자는 대문자로 한다.
		// → 구성멤버 : 멤버변수 field, 멤버함수 method
							//데이터베이스..
		
//		System.out.println(Math.PI);	  //멤버변수
//		System.out.println(Math.abs(-3)); //멤버함수
		
		// new연산자
		// → 클래스를 사용하려면 메모리를 할당하고 사용한다.
		// (형식) new 클래스명() => 클래스명() 생성자 함수라고 부른다
		// → 객체(object)
		
		// 객체 지향 프로그램 (Object Oriented Program)
		
		// 기본자료형
		//int a=3; //int는 메모리 4byte 할당
		
		//참조자료형(reference) : new를 할당하고 클래스를 생성하면.
		//RAM(Random Access memory)의 heap영역에 메모리가 할당되고 주소값이 발생된다.
		//new Sungjuk(); // 메모리가 잡힌다. 객체(Object)
		
		// RAM에 주소값이 발생하는데 RAM 안에 static, heap, stack 세가지 구역이 있다.
		// 그 중 new 를 쓰면 heap 구역 안에 잡힌다. 그리고 주소값이 발생한다.
		// static은 주소범위를 넘어가면 주소값이 사라진다 / 들어가면 살고 나오면 죽는다.. 들살나죽
		// new 새로운 곳에 계속 메모리를 잡아준다.
		
		//sj 참조변수(reference) : 메모리가 할당된 곳의 주소값을 기억한다.
		 Sungjuk sj=new Sungjuk(); //예) 50번지
		// 50번지라고 int로 쓰면안됨. sungjuk 클래스 크기만큼 줘야함.
		 
		 // ＃.(점) 연산자
		 // → 참조변수를 통해 객체에 접근하는 연산자
		 // sj. --> 이렇게 점을 쓰면 여러가지 변수들이 뜬다.
		 sj.name="손흥민";
		 sj.kor=100;
		 sj.mat=95;
		 sj.mat=90;
		 //sj.aver 에러. aver는 뜨지않는다. 왜냐면 private속성은 접근 불가능하기 때문이다. 
		 
		 sj.calc();
		 sj.disp();
		 //sj.view(); 에러. private속성은 클래스 외부에서 접근 불가능.
		 
		 ////////////////////////////////////////////////////////////////////////////////////////////
		 
		 Sungjuk one= new Sungjuk();
		 one.name="박지성";
		 one.kor=20;
		 one.eng=30;
		 one.mat=35;
		 
		 one.calc();
		 one.disp();
				 
//		 -----------------------------
		 
		 Sungjuk two= new Sungjuk();
		 one.name="김연아";
		 one.kor=100;
		 one.eng=95;
		 one.mat=90;
		 
		 one.calc();
		 one.disp();
		 
		 ////////////////////////////////////////////////////////////////////////////////////////////

		 
//		 참조변수가 가지고 있는 객체의 주소값 확인하기
//		 ＃.hashCode() : 내가 가지고있는 값과 번지수에 있는 값이 동일한지 확인하는 함수
//		 컴퓨터 램에 따라 달라질 수 있다. (강사님과 결과값 다르게 출력된다.)
		 System.out.println(one.hashCode());
		 System.out.println(two.hashCode());
		 
		 int a=3;
		 int b=a;
		 
		 Sungjuk tmp=two; // 117줄에 있는 two 변수의 자료형과 동일하게 설정해줘야 한다.
		 System.out.println(tmp.hashCode()); //System.out.println(two.hashCode()); 와 동일한 주소가 나와야한다.
		 
		 tmp.disp();
		
		
	}//main() end
}//class end
