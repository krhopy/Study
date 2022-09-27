package oop0907;

public class Test03_overload {
//	자바에서는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없습니다.
//  하지만 ＃매개변수＃의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있습니다.
//	
//	
	
	public static void hap(int a) {
		System.out.println(a);
	}//hap() end
	
	public static void hap(int a, int b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(double a) {
		System.out.println(a);
	}//hap() end
	
	public static void hap(double a, double b) { //리턴값 없음
		System.out.println(a+b);
	}//hap() end
	
	/*	
	 * 	에러. 함수의 리턴형은 메소드 오버로딩의 조건이 아니다.
	 	public static int hap(double a, double b) {	//리턴값 있음
	*/
//  	매서드 오버로딩은 매개변수에 따라 오버로딩이 되는 것이지,
//  	리턴값의 유무는 오버로딩에 영향을 주지 않아 에러가 난다.
	
	
	
	

	public static void main(String[] args) {
		// Method Overload 함수명 중복 정의
		// → 함수명을 중복해서 사용할 수 있다.
		
		// ＃메소드 오버로딩의 전제조건
		// → 매개변수의 개수가 달라야 한다.
		// →매개변수의 자료형이 달라야 한다.
		
		
		hap(3);
		hap(2, 4);
		hap(5.6);
		hap(9.8, 7.6);
		System.out.println();
		
		
		
		// 절대값 구하기
		System.out.println(Math.abs(-3));	//int형 (기본)
		System.out.println(Math.abs(4L));	//long형
		System.out.println(Math.abs(5.6f));	//float형
		System.out.println(Math.abs(7.8d));	//double형
		/*
		.함수 밑에 검색어들이 뜰 때 아이콘에 보이는 s,f의 뜻
		빨간색 s static
		파란색 f final
		*/
		
		
	// 함수는 그냥.. 외우기.. !!
	}//main() end
}//class end
