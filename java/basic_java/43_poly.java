package oop0915;

class Father{
	//[멤버변수 field]
	public String name="아버지";
	public String addr="주소";
	
	
	//[생성자함수 constructor]
	public Father() {}
	
	public Father(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}//end
	
	
	//[멤버함수 method]
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}//disp() end
	
}//Father class end


class Son extends Father {
	public Son() {}
	
	public Son(String n, String a) { 
		  //Son(String name, String addr) 이렇게 변수명은 똑같이 사용하는 것을 추천. 지금은 공부하는 중이라 구분하기 위해 일부러 변경
		super.name=n;
		super.addr=a;
	}//end
	
}//Son class end



class Daughter extends Father{
	String friend="절친";
	
	public Daughter() {}
	
	public Daughter(String n, String a) {
		super(n, a); // 부모생성자 함수 호출
	}//end
}//Daughter class end





public class Test03_poly {

	public static void main(String[] args) {
//		[다형성 Polymorphism]
//		- 형태가 여러가지라는 의미.
//		- 족보가 같으면 형변환을 할 수 있는 것.
//		- 부모의 첫째자식, 둘째자식, 셋째자식... 
	
	/*
		상속관계에서의 다형성
		- 부모클래스의 관점에서 형태가 여러가지
		- 클래스들간의 형변환이 용이하다. (=타입변환)
		- 다형성의 예) Calendar cal = new GregorianCalendar();
				    Number num=new Integer(5);
				    → 부모 = 자식
				    → = 를 기준으로 좌우 이름이 다르게 사용할 수 있는게 다형성!
				    
				    ＃ 원래는 = 를 기준으로 양쪽 변수명이 같아야한다.
				    GregorianCalendar now=new GregorianCalendar();
	*/	
		
		
		
		
//		GregorianCalendar now=new GregorianCalendar();
//							  //instance, object
//		원래는 = 를 기준으로 양쪽 변수명이 같아야한다.
//		= 를 기준으로 왼쪽 부모, 오른쪽 자식
//		
//		Calendar cal = new GregorianCalendar();
//		--> 이거 계속 Calendar 이부분 빨간줄 오류났는데 ctrl+shift+o 눌러서 자동임포트 시키면 됨
//		Number num=new Integer(5);
		
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		
//		1) 일반적인 방식으로 객체 생성
//		→ new 연산자
//		→ POJO(Plain Old Java Object) 방식
		
		/*
		Father fa=new Father();
		fa.disp();
		
		Son son=new Son("손흥민", "영국");
		son.disp();
		
		Daughter dau=new Daughter("김연아", "한국");
		dau.disp();
		*/

		
//		-------------------------------------------------------------------	
		
		
		
//		2) 다형성을 이용한 객체 생성
//		→ 자식클래스가 부모클래스에 대입 가능하다.
		
		Father fa = new Son("개나리", "역삼동");
		fa.disp();
		
	/*
		class Father{
		//[멤버변수 field]
		public String name="아버지";
		public String addr="주소";
	
		→ name 과 addr에 아버지, 주소값이 사라지고 개나리, 역삼동으로 바뀐다.
		→ 부모클래스가.. 희생하여.. 자기 모습을 버리고 자식 이름으로 대신 형태를 바꾼다..
	*/	
		
		System.out.println("-----------------");
		
		
		fa=new Daughter("진달래", "서초동");
		fa.disp();
		
		System.out.println(fa.name);
		System.out.println(fa.addr);

//		System.out.println(fa.friend); 
//		→ 에러남
//		- 자식클래스에서 추가된 멤버는 다형성의 대상이 아니다.
//		- 다형성이라고 무조건 되는 것이 아니라 물려준 것에 한해서만 가능하다.
//		String friend="절친";은 자식(나)랑 친한 것이지, 부모님이랑 친한게 아니다.
		
		System.out.println("-----------------");

		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

		
//		부모클래스도 자식클래스에 대입이 가능하다. 자식 = 부모
//		→하지만 제약조건이 있다. 자식 = 부모 하려면 자식클래스의 모양으로 형변환해야한다. 자식 = (자식)부모
		
		Father father=new Father();
		Son son=new Son();
		
		father=son;			// 부모클래스에 자식클래스 대입
//		son=(Son)father;	// 자식클래스에 부모클래스 대입하기
							// Exception이 발생할 수도 있다.
		
		
//		숫자 강제 형변환과 똑같이 생각하면 된다!
		double a=3.4;
		int b=(int)a; //3
		
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
//		예) 
//		뿌리클래스 object 
		Object obj=new Integer(5); //오류안남. object가 뿌리이기 때문.
//		→ 다형성. 자식클래스가 부모클래스에 대입
		System.out.println(obj.toString());
		
		Integer inte=(Integer)obj;
//		→ 다형성. 부모클래스도 자식클래스에 대입가능하지만
//		  자식클래스의 모습으로 변환시켜야한다. (Integer)obj;
		
		obj=new Father();
		System.out.println(obj.toString());
	
		
	} // main() end
	
} // class end
