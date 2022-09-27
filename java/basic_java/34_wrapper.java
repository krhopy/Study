package oop0914;

import java.lang.*; // 자바의 기본 팩키지. 생략가능.

public class Test01_wrapper {

	public static void main(String[] args) {
		
//		● wrapper class (포장클래스) ●
		
//		→ 기본자료형을 참조형화 해놓은 클래스들
//		→ 대부분 java.lang 팩키지에 선언되어 있음.
		
	/*
		 기본 타입은 char, int, float, double, boolean 등이 있고 
		 참조 타입은 class, interface 등이 있는데 프로그래밍을 하다 보면 
		 기본 타입의 데이터를 객체로 표현해야 하는 경우가 종종 있습니다. 
		 이럴 때에 기본 자료타입(primitive type)을 객체로 다루기 위해서 사용하는 클래스들을 
		 래퍼 클래스(wrapper class)라고 합니다. 
	*/
		
 
	/*
	 	 *기본형 			*참조형(클래스) - Wrapper Class 라고 부른다.
	 	 boolean		Boolean
	 	 byte			Byte
	 	 short			Short
	 	 int			Integer
	 	 long			Long
	 	 float			Float
	 	 double			Double
	 	 char			Character
	 	 				- 첫글자 대문자로 쓰는 것을 추천
	*/
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		
		boolean boo1=true;
		Boolean boo2=new Boolean("false");	
		Boolean boo3=true;
		
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		System.out.println(boo3.toString());	//콘솔창에서 인식할 수 없지만 toString이기때문에 "true" 문자형으로 출력된다.
		System.out.println("---------");
		
		
//		-----------------------------------------------------------------------------------	
		
		
		int in1=3;
		Integer in2=new Integer(5);	//이것도 되고
		Integer in3=7;				//이것도 가능
		
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		System.out.println(in2.toString());		//"5"	//클래스의 좋은점은 .(점)을 사용할 수 있다는 점~
		System.out.println(in3.doubleValue());	//7.0
		
		System.out.println(Integer.toBinaryString(15));	//2진수	"1111"
		System.out.println(Integer.toOctalString(15));	//8진수	"17"
		System.out.println(Integer.toHexString(15));	//16진수	"f"		//빨리쓸 수 있다. continue 된다
		
		System.out.println(Integer.sum(2,4));	//6
		System.out.println(Integer.max(2,4));	//4
		System.out.println(Integer.min(2,4));	//2
		
//		★ 많이사용하는 함수 parseInt() ★
		System.out.println(Integer.parseInt("123"));  //"123" -> 123 (숫자 문자형 -> 숫자형) 형변환 해준다. 숫자 문자열만 바꿔준다!
		
		//NumberFormatException 에러발생
//		System.out.println(Integer.parseInt("KOREA"));//For input string: "KOREA"
		
		System.out.println("---------");		
		
		
//		-----------------------------------------------------------------------------------	
		
		
		long lo1=3L;
		Long lo2=new Long(5);
		Long lo3=7L;
		
		double dou1=2.4;
		Double dou2=new Double("3.5");
		Double dou3=6.7;
		
//		문제) 실수형값들 중에서 정수의 합을 구하시오 (2+3+6)
		int hap=(int)dou1+dou2.intValue()+dou3.intValue();
		System.out.println(hap);
		
		System.out.println("---------");
		
//		-----------------------------------------------------------------------------------	

		char ch1='r';
		Character ch2='m';
		Character ch3=new Character('a');
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(Character.isWhitespace(' '));	//true 유니코드 문자가 공백인지 여부를 나타냅니다.
		System.out.println(Character.toLowerCase('R'));		//r	   대문자 → 소문자
		System.out.println(Character.toUpperCase('a'));		//A	   소문자 → 대문자
		
		
		

		
		
	} // main() end
} // class end
