package oop0914;

//final 종단클래스는 상속받을 수 없다.
//final class AA {}


class AA{
	private void zero() {} //private은 상속되지 않는다.
	public void one() {
		System.out.println("AA.one()...");
	}
	public void two() {
		System.out.println("AA.two()...");
	}
	
}//class AA end


class BB extends AA { //자식클래스 BB, 부모클래스 AA
	public void three() {
		System.out.println("BB.three()...");
		// 안에 AA의 멤버 AA.one, AA.two가 들어가있다. 총 3개의 멤버가 들어가있다.
	}
}//class BB end


class CC extends BB { //자식클래스 CC, 부모클래스 BB
	public void four () {
		System.out.println("CC.four()...");
		// 안에 BB의 멤버 three와 AA의 멤버 one, two 가 들어가있다. 총 4개의 멤버
	}
}//class CC end


/*	에러!	
 
	class DD {}
	class EE extends AA, DD{} 
	
	- 멀티상속 에러! 클래스간의 상속은 단일상속만 가능하다.
	- class말고 interface가 오면 가능함.
*/



public class Test03_sangsok {

	public static void main(String[] args) {
		
//		[Inheritance 상속]
		
//		→ 조상-자손, 부모-자식 (물려받는 것)
//		→ 복사 붙여넣기
		
		/*
		 	- 재활용 (이미 잘 개발된 클래스를 재사용하여 중복되는 코드를 줄여준다.)
		 	- 부모와 자식, 조상과 후손(파생), super class와 sub class
		 	- extends 확장, implements 구현 (용어만 차이, 같은 개념)
		 	
		 	[형식]
		 	자식 extends 부모 {}
		*/
		
		AA aa=new AA();
		aa.one();
		aa.two();
//		aa.zero(); 에러. private속성은 클래스 내부에서만 접근 가능하다.
		
		System.out.println("-----------");
		
		
		
		BB bb=new BB();
		bb.three();
		bb.one();
		bb.two();
//		bb.zero(); 에러. private속성은 상속되지 않는다.
		
		System.out.println("-----------");
		
		
		
		CC cc=new CC();
		cc.four();
		cc.three();
		cc.one();
		cc.two();
		
		System.out.println("-----------");
		

		
	} // main() end
	
} // class end
