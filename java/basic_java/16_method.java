package oop0907;

public class Test02_method {

	// main 함수 위에 칸에 코딩
	
	
	// test1()
	public static int test1(int a, int b) {
		int c=a+b;
		//return; 리턴값이 없다 (void)
		return c;	//리턴값의 자료형을 void 자리에 작성해준다.
					//리턴값은 1개만 리턴할 수 있다.
	}//test1() end	
	
	
	
	
	// test2() - 짝수,홀수 출력하기 함수
	public static String test2(int a) {
		if(a%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}//if end
	}//test2() end
	
	
	
	// test2() - 윤년확인하기
	public static boolean test3(int y) {
		if(y%4==0 && y%100!=0 || y%400==0) {
			return true;
		}else {
			return false;
		}
	}//test3() end
	
	
	
	
	// 1) test3() - 팩토리얼 구하기
	public static long test4(int n) {
		long gop=1;
		for(int a=n; a>=1; a--) {
			gop=gop*a;
		}//for end
		return gop;
	}//test4() end
	
	
	
	
	
	// 3. 재귀적 함수 호출 - 팩토리얼 구하기
	public static long fact(int n) {
		if(n==0) {	//5가 0이면 1값 반환.
			return 1;
		}else {
			return n*fact(n-1);		//재귀적 함수 호출
			// 5*5-1 = 5*4 = 20
		}//if end
	}//fact() end
	
	
	/*
		1. System.out.println(fact(5));
		
		2. n=5(fact(5)) > Return 5 * fact(4) => 120 
		3. n=4(fact(4)) > Return 4 * fact(3) => 24
		4. n=3(fact(3)) > Return 3 * fact(2) => 6
		5. n=2(fact(2)) > Return 2 * fact(1) => 2
		6. n=1(fact(1)) > Return 1 * fact(0) => 1
		7. n=0(fact(0)) > Return 1 
		
			5*4*3*2*1 = 120
		
		==> 5 * fact(4) * (4*fact(3)) * (3*fact(2)) * (2*fact(1)) * (1*fact(0)) 
	 */
	
	
 ///////////////////////////// 여기까지 함수 /////////////////////////////////// 
	
	
	public static void main(String[] args) {
		// 2. 리턴값이 있는 경우
		
//		System.out.println(Math.abs(-3));
//		System.out.println(Math.max(5, 7));
		
		// 1) test1() -  result 변수를 생성해준 방법
		int result=test1(2, 4);
		System.out.println(result);
		
		// 2) test1() -  바로 결과값 출력한 방
		//값 : 상수값, 변수값, 리턴값
		System.out.println(test1(5,6));
		
		
		
		
		
		//test2() - 짝수, 홀수 출력하기	
		String str=test2(7);			// String str : 짝수, 홀수 라는 문자열 값을 출력하기위한 변수 설정.
		System.out.println(str);		// 짝수, 홀수 값 여기서 출력시켜준다.
		
		
		
		
		// test3() - 윤년확인하기
		if(test3(2022)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		// 자료형을 true/false boolean값을 줘야함.
		
		
		
		
		
		// test4() - 팩토리얼 구하기
		long f=test4(5);
		System.out.println(f);
		
		
		
		//3. 재귀적 함수 호출
		//팩토리얼값 구하기
		System.out.println(fact(5));
		
		
		
		
		

	}//main() end
}//class end
