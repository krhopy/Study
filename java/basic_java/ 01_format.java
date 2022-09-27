package oop0906;

public class Test01_format {

	public static void main(String[] args) {
		
		
		// 출력서식
		// 출력을 예쁘게해주는 서식
		/*
			\n 줄바꿈(많이씀)
			\t 탭 (많이씀)
			\r 엔터
			\d 벨소리?	
			
			%d	10진 정수 출력
			%f	실수형
			%c	문자형
			%s	문자열형	
			System.out.prinf("출력서식", 값);	-> 이 문장과 같이 사용해야 함.	
		*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.print("사과\n참외\n수박\n\n\n");
		System.out.print("바\t\t나\t나");
		System.out.print("\n\n딸기");
	
		System.out.printf("%d %d %d\n", 3, 5, 7);
		System.out.printf("나이: %d\n", 25);
		System.out.printf("a:%d b:%d c:%d\n", 2, 4, 6);
		
		
		// 숫자 출력할 때 앞뒤에 공백 혹은 0으로 채울 수 있음.	
		System.out.printf("#%5d#\n",  123);	//#  123#
		System.out.printf("#%-5d#\n", 123); //#123  #
		System.out.printf("#%05d#\n", 123); //#00123#
		
		
		//%소수점 설정
		System.out.printf("x:%f y:%f z:%f\n", 1.2, 3.4, 5.6); //x:1.200000 y:3.400000 z:5.600000
		System.out.printf("#%6.2f#\n", 7.8);  				  //#  7.80# 	: 6칸을 잡고 소수은 두자리로
		System.out.printf("#%-6.2f#\n", 7.8); 				  //#7.80  #    : 6칸을 잡고 소수점은 두자리에 왼쪽
		System.out.printf("#%.2f#\n", 7.8);   				  //#7.80#

		
		
		//%c 문자
		System.out.printf("%c %c %c\n",  'S', 'K', 'Y');	//S K Y
		System.out.printf("#%5c#\n", 'R'); 					//#    R#
		System.out.printf("#%-5c#\n", 'r'); 				//#r    #
		
		
		
		//%s 문자열
		System.out.printf("%s %s %s\n",  "Year", "Month", "Date");	//Year Month Date
		System.out.printf("#%8s#\n", "HAPPY"); 						//#   HAPPY#
		System.out.printf("#%-8s#\n", "HAPPY"); 					//#HAPPY   #
		
		
		// 소수점 4개를 출력 / 10을 3.0으로 나누기	
		System.out.println(String.format("%.4f", 10/3.0));	//3.3333
		
		
		
		
		
	}//main() end

}//class end
