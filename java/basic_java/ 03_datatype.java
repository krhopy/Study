package oop0905;

public class Test03_datatype {

	public static void main(String[] args) {
		// 자료형 Datatype
		// 자바는 자료형을 먼저 지정해야한다.
		// -> 기본 자료형
		// -> 참조 자료형(클래스)
		
		
////////////////////////////////////////////////////////////////////////////////////

		

		//1. 정수형(숫자) - 연산가능
		// → 소수점이 없는 값
		
		byte a=1;	// 1바이트 할당
		short b=3;  // 2바이트 할당
		int c=5;	//4바이트 할당 (아무것도 쓰지않으면 가장 기본으로 쓰임)
		long d=7;	//8바이트 할당
		
		// 메모리에 알맞는 값을 설정해주는 것이 프로그램을 무겁지않게 쓸 수 있다.
		// 자료형을 한번은 반드시 지정해줘야한다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//int c=9;  에러남.위에 c 변수에 int 자료형 지정해줬기 때문에 중복으로 선언할 수 없다.
		
		
		
////////////////////////////////////////////////////////////////////////////////////
		
		
		
		//2. 실수형(숫자) - 연산가능
		// → 소수점이 있는 값
		
		float e=1.2f; //4바이트 할당. 접미사 f 반드시 추가
		double f=3.4d;//8바이트 할당. 접미사 d 생략가능 (기본)
		// f,d 소수점을 얼마나 붙일 것인지
		
		
		System.out.println(e);
		System.out.println(f);

		System.out.println(3);	//정수형 int
		System.out.println(3.0);//실수형 double
		
		
		
////////////////////////////////////////////////////////////////////////////////////

		
		
		//3. 문자형
		// → 홀따옴표 ' 로 감싸고, 문자 1개만 저장할 수 있다.
		
		char ch='R'; //2바이트 할당(하지만 알파벳은 1바이트만 있어도됨) → byte 형을 쓰면 메모리를 덜 쓸 수 있다. 둘다 틀린 건 아님
		System.out.println(ch);
		
		ch='가';		// 한글은 최소 2바이트 있어야함
		System.out.println(ch);
		
		// ch='SKY'; 에러 글자 하나만 와야됨
		// ch=''; 	 빈문자열 에러

		
		
////////////////////////////////////////////////////////////////////////////////////

		
		
		//4. 문자열형
		// → 큰따옴표 ""로 감싼다
		
		String str="KOREA";
		System.out.println(str);
		// 원래는 참조형 class 인데 문자열 기본형으로도 쓸 수 있다
		
		str="A";	
		System.out.println(str);
		
		str="";		//글자개수 0개
		System.out.println(str);
		
		str=" ";	//글자개수 1개
		System.out.println(str);
		
		
		
////////////////////////////////////////////////////////////////////////////////////

		
	
		//5. 논리형
		// → 맞다(true), 틀리다(false)
		
		boolean flag=true;
		System.out.println(flag);
		
		flag=false;
		System.out.println(flag);
		
		System.out.println(true);	//boolean형
		System.out.println("true"); //String형
		
		
////////////////////////////////////////////////////////////////////////////////////

		
		// 연습) 성적 프로그램
		String name ="무궁화";
		int kor=80, eng=95, mat=100;
		
		// 평균구하기
		double aver=(kor+eng+mat)/3;
		
		//출력하기
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("평균:"+aver);
		
		// 평균값이 원래 91.6666666이 나오는데 자바는 소수점을 잘라준다. 그냥 자바의 특징
		// 실수값 = 부동소수점 (떠다닐 부) 
		// 실수값을 도출하고 싶으면 따로 만들어야한다.
		// 정수를 정수로 계산하면 죽었다 깨어나도 소수점으로 값이 나오지 않는다.
		
	}//main() end

}//class end
