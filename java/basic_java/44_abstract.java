package oop0915;

//https://limkydev.tistory.com/188 한번읽어보기



abstract class Animal{	//추상클래스
	String name;
	
	void view() {}  		//일반메소드
	
	abstract void disp();	//[추상 메소드] - 메소드의 body {} 가 없는 함수. *미완성*
}//class end



// 추상클래스는 부모역할만 주로 한다.
// 추상클래스를 상속받은 자식클래스는 반드시 추상메소드를 완성해야 한다 (override)
class Elephant extends Animal {
	@Override
	void disp() { //abstract void disp();
		System.out.println("점보");
	}
}//class end


//		[클래스 생성 오류!]
	/*	
	    추상클래스 미완성(Tuna에 빨간줄 그어짐) -> 오버라이드 해야한다.

		class Tuna extends Animal {
		}//class end
	*/ 




// --> [해결방법] 
//     ctrl + space 로 disp() 선택해주면 추상메소드가 생성되어 오류가 나지 않는다. 
class Tuna extends Animal {
	@Override
	void disp() {	//abstract void disp();
		System.out.println("니모");
	}
}//class end







public class Test04_abstract {

	public static void main(String[] args) {
//		● 추상클래스 Abstract class ●
//		추상클래스보다 인터페이스 위주로 사용한다.
		
		/*
			[추상 클래스]
			- 미완성 클래스
			- 뭔가 제대로 생성시키지 않은 것.
			- 객체를 생성할 수 없다
			- new 연산자를 직접 사용할 수 없다.
			- 추상메소드가 1개라도 있으면 추상클래스
			- 일반메소드와 추상메소드가 같이 선언 가능하다
		
		
			[추상 메소드]
			- 미완성 메소드
			- 형식) 리턴형 함수명();
			- 메소드의 body {} 가 없는 함수
			- 메소드를 선언만 해 놓음
			
			- 김밥천국 주문 주방말고 메뉴판보고 주문한다. 메뉴목록이 실체는 아니지만 실체라 생각하고 주문함.
			  실제론 주방에서 메뉴를 만듦.
			  
			  
			[인터페이스]
			- 추상 메소드만 선언 가능하다.
			- 메뉴판
		
		*/

		
		
//〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓

		
		
//		- 추상클래스는 new 연산자로 직접 객체 생성 할 수 없다.
//		Animal ani=new Animal();	//[추상 클래스]- new 연산자를 직접 사용할 수 없다.
		

		Elephant jumbo=new Elephant();
		jumbo.disp();
		
		Tuna nemo=new Tuna();
		nemo.disp();
		
		
//		[다형성]
		Animal animal=new Elephant();	//부모클래스(animal)에 자식클래스(elephant) 넣기
		animal.disp();					//Elephant = 점보
		
		animal=new Tuna();				//부모클래스(animal)에 자식클래스(Tuna) 넣기
		animal.disp();					//Tuna = 니모
		

		
	} // main() end
	
} // class end
