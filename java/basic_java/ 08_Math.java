package oop0906;

public class Test02_Math {

	public static void main(String[] args) {
		// Math 수학 관련 클래스
		
		System.out.println(Math.E);		//2.718281828459045
		System.out.println(Math.PI);	//3.141592653589793
		
		//절대값
		System.out.println(Math.abs(3));	//3
		System.out.println(Math.abs(-3));	//3
		System.out.println(Math.abs(2.4));	//2.4
		System.out.println(Math.abs(-2.4));	//2.4
		System.out.println("----------------------");
		
		
		System.out.println(Math.ceil(1.3));			//2.0 (올림)
		System.out.println(Math.floor(2.7));		//2.0 (내림)
		System.out.println(Math.round(3.8));		//4	(반올림)
		System.out.println("----------------------");
		
		
		System.out.println(Math.max(3, 5));		//큰값	 5
		System.out.println(Math.max(1.2, 3.4));		  // 3.4
		System.out.println(Math.min(6, 7));		//작은값 6
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		// 랜덤함수
		// 난수 : random값, 무작위로 발생한 값.	
		// 난수 발생 범위 : 0.0 <= r < 1.0
		
		// 문1) 주사위 수의 범위 : 1~6발생 시키기
		System.out.println((int)(Math.random()*6)+1);	
		
	
		// 문2) 로또번호 범위 : 1~45
		System.out.println((int)(Math.random()*45)+1);	
		
		
		

	}//main() end

}//class end
