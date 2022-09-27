package oop0914;


class Korea{
	String name="대한민국";
	final void view() {
		System.out.println("Korea.view()...");
	}//view end
	void disp() {
		System.out.println("Korea.disp()..."+name);
	}//disp() end
}//class Korea end


class Seoul extends Korea{}//class Seoul end


// [Method Override 함수 재정의] 사용
class Busan extends Korea{
	String name="부산광역시";
	
	@Override		//←annotation
	void disp() {
		super.disp();
		System.out.println("Busan.disp()..." + name);
	}//disp() end
//	→ 이름을 부산광역시로 편집을 해도 AA에 있는 대한민국 값은 남아있다. 경우의 수가 대한민국, 부산광역시 2개로 늘어난다.
//	→ super()로 접근하면 대한민국 값을 쓸 수 있다.
	
	/*
		view도 편집? --> 에러!!
	
		@Override	
		void view() {}//disp() end
		
		왜냐면 final void view() 때문!!
		→ final 종단클래스는 더이상 오버라이드 할 수 없다.
	*/
	
	
	
}//class Busan end




public class Test04_override {

	public static void main(String[] args) {
//		[Method Override 함수 재정의]
//		→ 상속관계에서 물려받은 메소드를 다시 수정(리폼)

		
//		1) 오버라이드 하기 전
		Seoul se=new Seoul();
		se.disp();
		se.view();
		
		System.out.println("------------------------");
		
//		2) 오버라이드 한 후
		Busan bu=new Busan();
		bu.disp();
		bu.view();		//final 메소드는 상속은 가는하지만 오버라이드는 할 수 없다.
			

		
		
	} // main() end
	
} // class end
