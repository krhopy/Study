package oop0905;

public class Test02_print {

	public static void main(String[] args) {
		//콘솔창 출력
		
		// * prin() 일렬로 출력됨
		System.out.print(123);
		System.out.print(456);
		System.out.print(789);
		
		// * println() 줄바꿔서 출력됨
		System.out.println(); //콘솔창에서 줄바꿈
		
		System.out.println(123); //콘솔창에서 줄바꿈
		System.out.println(456); //콘솔창에서 줄바꿈
		System.out.println(789); //콘솔창에서 줄바꿈
		
		// 문자열 데이터 구분 기호 "
		System.out.println("JAVA");
		System.out.println("Python");
		System.out.println(123);	  //숫자형
		System.out.println("456");	  //문자열형
		
		// " ' \ 등을 단순 기호로 인식하고자 할 때
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");
		
		// + 연산자
		System.out.println(123+456);	//579
		System.out.println("123"+"456");//"123456"
		System.out.println(123+"456");	//"123456"
		System.out.println("123"+456);	//"123456"
		System.out.println("123+456");	//"123+456"
		
		
		// ' 작은 따옴표
		// " 큰 따옴표
		// ' " 구분 확실히 해야한다.
		
		
		
	}//main() end

}//class end
