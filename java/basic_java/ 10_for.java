package oop0906;

public class Test04_for {

	public static void main(String[] args) {
		
		// for 반복문 
		
		//1. for 문
		for(int a=1; a<=3; a++) {
			System.out.println("JAVA");
		}//for end
		
		//for문에 선언된 변수는 for문에서만 사용가능하다.
		//System.out.println(a); 에러
		
		int b=0;
		for(b=1; b<=3; b++) {
			System.out.println("PYTHON");
		}//for end
		
		System.out.println(b);
		// for반복문 (b=1; b<=3; b++) 은 3번 출력이 되고, 그 뒤로 빠져나오면 +1인 b=4가 되어있다.
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		//2. while문
		int i=0;
		while(i<=3) {
			System.out.println("SEOUL");
			i++;
		}//while end
		// 4번 출력됨
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		//3. do~while문
		int j=0;
		do {
			System.out.println("JEJU");
			j++;
		}while(j<=3);
	    // 반복 횟수는 동일하지만 조건이 false여도 1번은 동작한다.
		// 4번출력됨
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
		//4. break 와 continue문
		for(int a=1; a<10; a++) {	// 1 2 3 4 까지만!! 출력됨
			if(a==5) {
				break;
			}//if end
			System.out.print(a + " ");
		}//for end
		
		
		System.out.println(); //줄바꿈
		
		for(int a=1; a<10; a++) {	// 1 2 3 4 6 7 8 9 : 5에서 다시 돌아가서(back) 6부터 9까지 출력
			if(a==5) {
				continue;
			}//if end
		System.out.println(a + " ");
		}//for end
		
		

	}//main() end
}//class end
