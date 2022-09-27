package oop0914;

class Jeju extends Object {
	@Override
	public String toString() {
		return "제주도";
	}

}//class Jeju end
	

class Suwon extends Object{
	private String id="itwill";
	private String pw="1234";
	
//	◈ private 값이 내가 원하는 값이 잘 들어가있는지 수시로 확인해야한다.
	@Override
	public String toString() {	// toString() 내가 원하는 값이 잘 들어가있는지 확인하는 작업
		return "Suwon [id=" + id + ", pw=" + pw + "]";
	}
	
}//class Suwon end


class Incheon extends Object{
	private String name="인천 광역시";
	private String phone="789-8745";
	
//	[메뉴바 → Source → Generate toSting() → 클릭 후 생성]
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", phone=" + phone + "]";
	}
	
}//class Incheon end



public class Test05_Object {

	public static void main(String[] args) {
		
//		[Object 클래스]
//		→ 족보를 알 수 있다

		
//		＃ 자바의 클래스를 선언할 때 extends키워드로 다른 클래스를 상속하지 않으면
//		  암시적으로 java.lang.Object 클래스를 상속하게 된다.
//		=> 따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손클래스가 된다.

//		- 필드가 없고 메소드로 구성되어 있다. 
//		- 이 메소드들은 모든 클래스들이 Object 클래스를 상속하므로 모든 클래스에서 이용할 수 있다.

		
		/*
		  - 자바의 최고 조상 클래스 : Object 클래스
		  - 자바의 기본 팩키지(java.lang)에 선언되어 있음.
		  - 자바의 모든 클래스는 무조건 object클래스를 상속 받는다. (선택권 없음)
		  - 자바의 모든 클래스는 Object 클래스의 후손들이다. → true
		*/
		
		
		
//		객체 생성 후 출력
		
		Jeju je=new Jeju();	//객체생성
		System.out.println(je.toString());
		
		Suwon su=new Suwon();
		System.out.println(su.toString());
		
		Incheon in=new Incheon();
		System.out.println(in.toString());
		
		
		
//		[함수 이름 toString() 생략 가능]
		System.out.println(je);
		System.out.println(su);
		System.out.println(in);
		
		
	} // main() end
	
} // class end
