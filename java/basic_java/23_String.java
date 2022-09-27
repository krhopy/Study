package oop0908;

import java.util.StringTokenizer;

public class Test03_String {

	public static void main(String[] args) {
		// 문자열 클래스
		
		
		// ＃equals() 함수
		String str="HAPPY";
		String name=new String("HAPPY");
		
		if(str==name) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//if end
		
		
		// str과 name의 값은 같은데 결과값은 "다르다"라고 출력된다.  
		// 문자열의 내용을 비교하는 경우 == 연산자 사용하지말고 equals()함수를 이용할 것
		
		if(str.equals(name)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//if end
		
		
		
		//＃.isEmpty() 함수
		//문자열의 개수가 0인지?
		if(str.isEmpty()) {
			System.out.println("빈문자열 이다");
		}else {
			System.out.println("빈문자열 아니다");
		}//if end
		///////////////////////////////////////////////////////////
		
		
//		● 문자열 자르기1 ●
		//＃.split()
		//특정 문자를 기준으로 문자열 분리하기
		// str.split(" "); 공백을 주면 깔끔하게 자를 수 있다.
		str=new String("Gone With The Wind");
		String[] word = str.split(" ");
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}//for end
		
//		------------------------------------------------------------
		
		
//		● 문자열 자르기2 ●
		//＃StringTokenizer : 문자열 자르기(위의 결과값과 똑같이 나온다.)
		StringTokenizer st=new StringTokenizer(str, " ");
		//＃.hasMoreTokens()
		//＃.nextToken() - 가져오는 것

		////st문자열에서 왼쪽에서 오른쪽까지 훑어서 공백이 없을 떄 까지 공백을 기준으로 나눠준다. 
		while(st.hasMoreTokens()) { //토큰할 문자가 있는지?
				System.out.println(st.nextToken());	//토큰한 문자열 가져오기
		}//while
		
		
//		------------------------------------------------------------

//		● 문자열 연산하기 ●
		
//		문자열 연산 속도
//		[String < StringBuffer < StringBuilder]
		
		String s1="";
		System.out.println(s1.length());	//0
		
		s1=s1+"ONE"; // ONE 값을 s1에 넣어주기.
		System.out.println(s1.length()+s1);	//3ONE
		
		s1=s1+"TWO"; 
		System.out.println(s1.length()+s1);	//6ONETWO3ONE

		s1=s1+"THREE"; 
		System.out.println(s1.length()+s1);	//11ONETWOTHREE
		// 계속 누적되어 값이 저장된다.
	
		//모든 문자열 지우기 (빈 문자열 대입)
		s1="";
		System.out.println(s1.length()+s1);
		

//		------------------------------------------------------------

//		＃StringBuilder
		StringBuilder s2=new StringBuilder();
		
		s2.append("SEOUL");
		System.out.println(s2.length()+s2.toString());
		
		s2.append("JEJU");
		System.out.println(s2.length()+s2.toString());
		
		s2.append("BUSAN");
		System.out.println(s2.length()+s2.toString());
		
		
//		＃delete, remove : 모든 문자열 지우기 
		s2.delete(0, s2.length()); //0번째 글자부터 마지막 글자까지 지우기
		System.out.println(s2.length());
		

		
//		＃StringBuffer : builder와 차이점이 없음.
		StringBuffer s3=null;
//		System.out.println(s3.length()); : Exception에러남
		
		
//		------------------------------------------------------------
		
//		[문자열 연산할 때 속도]
//		- String : 568.298 
//		- StringBuffer : 0.0082
//		- StringBuilder : 0.0098
//		
//		String보다 StringBuffer,StringBuilder 가 훨씬 연산 속도가 빠르다.
//		String 보단 StringBuffer,StringBuilder 사용하기
		
//		------------------------------------------------------------

		
		
		
		
		
	}//main() end
}//class end
