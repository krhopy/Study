package oop0905;

public class Test04_operator {

	public static void main(String[] args) {
		// 연산자
		// 산술, 비교(관계), 논리연산자
		// 삼항, 대입, 1증감연산자
		// 비트연산자 ?
		
		
		// 정수형으로 나누기, 나머지값 구하기
		System.out.println(5/3);	//1
		System.out.println(5%3);	//2
		
		System.out.println(3/5);	//0
		System.out.println(3%5);	//3
		// int로 계산하면 소수점 절 대 안나온다
		// 마지막은 나머지안나오면 앞에 숫자가 나온다.
		
		
		// 소수점 값을 구하고 싶다면 실수값을 하나라도 넣어줘야 한다.
		System.out.println(3.0/5.0); //0.6
		System.out.println(3/5.0);	 //0.6
		System.out.println(3.0/5);	 //0.3
		System.out.println(3/5.);	 //0.6
		// 5. <- 실수값 5라는 뜻
		
		
///////////////////////////////////////////////////////////////////////////////////
		
		
		// bit 연산자 (잘 사용하지 않는다)
		
		// 1) 비트곱, 비트합 연산자 
		System.out.println(5&3);	//1 곱하기연산자
		System.out.println(5|3);	//7 더하기연산자
		/*
		 	 2진수 : 0 1 (컴퓨터)
		 	 8진수 : 0 1 2 3 4 5 6 7 
		 	10진수 : 0 1 2 3 4 5 6 7 8 9 (사람이 쓰는 수)
		 	16진수 : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
		 								>여기서부터 문자로 표현 (색깔표현)
		 	16진수 : 0 1 2 3 4 5 6 7 8 9  a  b  c  d  e  f
		 	
		 	
		 	                  128 64 32 8 4 2 1       2의 3승 = 8, 2의 4승 16, 2의 5승=32
		 	10진수 5를 2진수 변환 →		      1 0 1
		 	10진수 3을 2진수 변환 → 				1 1
		 	10진수 9를 2진수 변환 →  		1 0 0 1
		 	(→ 8이랑 1더하면 9, 그럼 8자리와 1자리에 숫자 1을 주고 필요없는 부분은 0으로 채우기)
		 	10진수 35을 2진수 변환→        1	0 0 1 1
		 	
		 	5 →      00000101        00000101 (최소 8자리가 있어야하므로 앞은 0으로 채운다)
		 	3 →    & 00000011      | 00000101
		 		   ----------     -----------
		 		      0000001        00000111
		 		     	    1			    7
		 	총 비트가 8비트 = 1byte
		 */
		 
		//2) 비트 부정 연산자 (~)
		System.out.println(~5); //-6
		
		
		//3) shift 연산자
		
		// 16<<3 에서 3은 이동 bit 수
		System.out.println(16<<3);	//left shift 	16*2의3승(8)  128
		System.out.println(16>>3);	//right shift   16/2의3승(8)  2

		// 비트보다 논리연산자로 주로 사용할 것임.
		/*
		 	16을 2진수로 변환		 00010000	     00010000
		 					<<3	 10000000	>>3  00000010
		 							  128			    2
		 */
		
		
		
	}//main() end

}//class end
