package oop0915;

//https://limkydev.tistory.com/197
//이 블로그 참조

interface Creature {
	//void disp() {} → 에러 ! 일반메소드는 사용할 수 없다.
	abstract void kind();	// 추상 메소드만 가능하다
	void breath();			// abstract 생략가능
							// abstract가 오지않아도 interface 안에 있기 때문에 추상메소드로 인식한다.
}//interface end
// 내가 현재 만들어야하는 목록을 인터페이스에 다 만들어놓고 구조화해서 통제시킨다.


// ↑ 위에 있는 interface Creature 클래스를 부모로 상속받고 싶다면 : implements 사용

// 클래스 입장에서 부모가 클래스		: extends 확장
// 클래스 입장에서 부모가 인터페이스  : implements 구현
class Tiger implements Creature {

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breath() {
		System.out.println("허파");
	}
}//class end


// ※주의!! [오버라이드] kind(), breath() 둘 다 해야 오류가 나지 않는다!



class Salmon implements Creature {
	
	@Override
	public void kind() {
		System.out.println("어류");
	}
	
	@Override
	public void breath() {
		System.out.println("아가미");
	}
	
}//class end




public class Test06_interface {

	public static void main(String[] args) {
//		● 인터페이스 interface ●
		
	/*
		- 추상메소드로만 구성되어있다.
		- 추상클래스보다 더 추상화 되어있다.
		- 상속 : extends 확장, implements 구현
	*/
		
	
	//Creature creature=new Creature();
	//에러. 인터페이스는 직접 객체 생성 불가능 - 설계도 없이 집 지을 수 없음
		
	
	//인터페이스에서의 다형성
	Creature creature=null;
	
	creature=new Tiger();
	creature.kind();
	creature.breath();
	
	creature=new Salmon();
	creature.kind();
	creature.breath();
	
		
		
	} // main() end
	
} // class end
