package oop0916;

public class Test01_exception {

	public static void main(String[] args) {
		
		//● 예외처리 Exception 개념 ● 

		/*
			- 에러처리
			- 자바 클래스 실행 (Run)시 발생하는 에러를 예외처리라고 한다.  
			- 에러가 발생해도 에러가 아닌 것처럼 포장할 필요가 있다.
		  	- 에러가 발생해도 프로그램을 정상적으로 종료하기.
		  	
		  	but, 에러가 나면 최대한 해결해야한다.
		  	
		  	▷ try~catch
		  	▷ finally
		  	▷ throws
		 
		 */
		
//		예외처리는 문제해결이 아니고 그냥 예외가 나왔다고 화면상으로 보여주는 것.
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		
//		1) 예외 처리하지 않은 경우
//		System.out.println(1);
//		//Exception이 발생되면 프로그램은 정삭적으로 종료되지 않음
//		System.out.println(3/0); //ArithmeticException 발생
//		System.out.println(5);
//		System.out.println("END");	//프로그램이 정상적으로 종료되었다는 표시를 해주는 것
		
		
//		↓
//		↓	에러 메세지 발생한 것 예외처리 하기
//		↓
		
		
//		2) 예외처리 한 경우
//		→ Exception이 발생하더라도 정상적으로 프로그램은 종료시킬 수 있다
//		try {
//			//예외 발생이 예상되는 코드 작성
//			System.out.println(1);
//			System.out.println(3/0);
//			System.out.println(5);
//			//여기서 문제가 발생하면 catch 문으로 이동
//		}catch(ArithmeticException e) { // Run하고 나온 에러메세지를 ()에 적어준다
//			//예외가 발생되었을 때 처리할 코드 작성
//			System.out.println(e);
//		}//end
//		
//		System.out.println("END");	//위의 코드가 정상적으로 처리되면 종료되었다는 표시.
		
		
		
		
//		-------------------------------------------------------------------
		
		
		
//		3) 자주나오는 Exception
		
//		3-1. [ArrayIndexOutOfBoundsException] : 배열범위기준초과 에러
//		- 정해진 배열의 크기보다 더 많은 양의 데이터를 넣고자 할 때 주로 발생
//		출처: https://seeminglyjs.tistory.com/216 [Seemingly Online:티스토리]
		
		/*
		try {
			System.out.println(1);
			int[] num=new int[3];	// 0,1,2
			num[5]=2;				// 엥 에러가 아님. num[5]는 존재하지 않는데 에러가 안뜬다.
			System.out.println(7);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
		
//		Index 5 out of bounds for length 3 
//		인덱스5는 길이3의 범위를 넘었다고 출력된다.
//		num[5]
		
		
		
//		3-2. [NumberFormatException] 자료형 에러
		
		/*
		try {
			System.out.println(1);
			int num=Integer.parseInt("KOREA");	
			System.out.println(3);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
		
//		For input string: "KOREA" : 
//		→ 입력받은 값이 문자형이라고 출력된다.
//		int num=Integer.parseInt("KOREA");
//		→ 변수 자료형은 int = 입력값은 문자형 String 으로 일치하지 않음.
		
		
//		3-3. [NullPointerException] : 어딘가에 Null값이 들어있다
		
		/*
		try {
			System.out.println(1);
			Integer inte=null;	
			System.out.println(5/inte);
		}catch (NullPointerException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
		
//		Cannot invoke "java.lang.Integer.intValue()" because "inte" is null
//		→ "inte"가 null이기 때문에 "java.lang.Integer.intValue()"을 호출할 수 없습니다.
		
		
		
//		-------------------------------------------------------------------
		
		
		
//		4) 다중 catch문
		
		/*
		try {
			int a=2/0;
			int b=Integer.parseInt("KOREA");//자료형 불일치
			int[] num=new int[3];
			num[5]=7;						// 배열범위 초과
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (NullPointerException e) {
			System.out.println(e);
		}//end
		
		System.out.println("END");
		*/
		
//		→ try문에 여러 에러사항이 들어가 있을 때 catch문에 에러사항을 나열해서 입력한 경우.
//		→ 가장 위에있는 ArithmeticException 만 출력된다. (그 밑에있는 나머지 catch문은 출력되지않음)
		
//		=> but, catch문을 나열하면 어떤 예외들이 들어가있는지 알 수 없고 나열하면 한도끝도 없다.
		
		
//		↓ ↓ ↓ 개선하기 ↓ ↓ ↓
		
		
//		★ 5) 4번의 다중 catch문 개선
		
		
		try {
			int a=2/0;
			int b=Integer.parseInt("KOREA");//자료형 불일치
			int[] num=new int[3];
			num[5]=7;						// 배열범위 초과
		}catch (Exception e) {	//다형성때문에 예외의 정확인 이름을 적어주지 않아도 처리가 된다.
			//Exception 클래스 : 모든 예외발생의 조상 클래스
			System.out.println(e);
		}//end
		
		System.out.println("END");
		
		
//		 try~catch는 오류를 해결하는 것이 아니다.
//		 오류메세지 보고 고치는 것이 먼저당..
		
		
//		-------------------------------------------------------------------

		
//		★ 6) finally문
//		→ 예외가 발생하거나, 발생하지 않더라도 무조건 실행
		
		try {
			System.out.println("OPEN");		//열기
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("CLOSE");	//닫기
		}//end
		
		System.out.println("END");			//종료
		

		
	} // main() end
	
} // class end
