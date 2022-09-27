package oop0913;

public class Test02_static {

	public static void main(String[] args) {
		
//		● static ●
//		→ 정적, 고요하다
//		→ static이라는 공간에 저장한다는 의미
//		→ 변수(정적변수, 클래스변수), 함수
//		→ 메모리 생성 1번, 소멸도 1번 / 2번 안만들어짐
//		→ new 연산자를 이용해서 별도의 객체를 생성하지않고 사용 가능하다.
//		→ new연산자 없이 빨리 쓸 수 있다.
		
//		static은 클래스명으로 직접 접근 가능하다.
//		→ 클래스명.변수
//		→ 클래스명.함수()
		
		
		/*
		System.out.println(Math.PI);	  //클래스명.변수
		System.out.println(Math.abs(-3)); //클래스명.함수
		System.out.println(String.format("%.2f", 12.3456));
		*/
		
		
//		static에서는 three.disp(); 이런식으로 쓸 필요가 없다.
		
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

		
//		Sawon클래스를 생성하고 실습
		
//		static변수와 static함수는 클래스명으로 직접 접근 가능하다.
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.SUDANG);
		System.out.println(Sawon.TAX);
		Sawon.line();
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

		
//		1) static의 특징을 적용하지 않은 경우(비추천)
		Sawon one=new Sawon("1001", "개나리", 100);
		//나의 세금
		double myTax=one.pay*one.TAX; //3
		//나의 총 지급액 = 급여-세금+수당
		int total=(int)(one.pay-myTax+one.SUDANG); //100-3+10
		
		System.out.println("회사" + one.COMPANY);
		System.out.println("사번" + one.sabun);
		System.out.println("이름" + one.name);
		System.out.println("급여" + one.pay);
		System.out.println("수당" + one.SUDANG);
		System.out.println("세금" + myTax);
		System.out.println("총지급액" + total);
		one.line();
		
		
//		---------------------------------------------------------
		
//		2) static의 특징을 적용한 경우(추천)
//		→ static변수와 static함수는 이미 static메모리에 값이 올라와 있기 때문에
//		  별도의 객체 생성을 하지 않고도 바로 접근할 수 있다.
		
		Sawon two=new Sawon("1002", "진달래", 200);
		
		myTax=two.pay*Sawon.TAX;
		total=(int)(two.pay-myTax+Sawon.SUDANG);
		
		System.out.println("회사" + Sawon.COMPANY);
		System.out.println("사번" + two.sabun);
		System.out.println("이름" + two.name);
		System.out.println("급여" + two.pay);
		System.out.println("수당" + Sawon.SUDANG);
		System.out.println("세금" + myTax);
		System.out.println("총지급액" + total);
		one.line();

		
//		---------------------------------------------------------
		
		
//		3) static변수의 연산
		
//		→ static메모리의 특징은 생성도 1번, 소멸도 1번
//		→ 주소를 공유한다		
		
		Sawon kim=new Sawon("1003", "무궁화", 300);
		Sawon lee=new Sawon("1004", "봉선화", 300);
		
		System.out.println(kim.SUDANG);	//10
		System.out.println(lee.SUDANG);	//10
		
		/* Sawon class
		static String COMPANY="(주)아이티윌";
		static int SUDANG=10;			   @
		static double TAX=0.03;
		*/
		
		kim.SUDANG = kim.SUDANG+1;		//10+1	(비추천. 공부하려고 작성)
		System.out.println(kim.SUDANG);	//11
		
		lee.SUDANG=lee.SUDANG+1;		//11+1
		System.out.println(lee.SUDANG); //12
		
		// static은 new 처럼 새로운 메모리값이 생기는 것이 아닌, 메모리 한 곳에 축적된다.
		
		Sawon.SUDANG = Sawon.SUDANG+1; //12+1
		
		System.out.println(Sawon.SUDANG); //추천
		System.out.println(kim.SUDANG);
		System.out.println(lee.SUDANG);
		
		
		
		
	/*
		static - continue : 빨리 쓸 수 있다, 연산은 continue된다.
		heap - new
		stack - reset
	*/
		
		
// 어디서 접근하든지 간에 공통으로 공유할 수 있는 값을 static에 넣는다.
		
		

	}//main() end
	
}//class end
