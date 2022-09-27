package oop0915;

interface IMessage {
	public void msgPrint();	//추상메소드
}//interface end


class Message implements IMessage {
	@Override
	public void msgPrint() {
		System.out.println("Message 클래스");
	}
}//class end






public class Test08_anonymous {

	public static void main(String[] args) {
//		● 익명 내부 객체 Anonymous class ●
//		- 이름이 없는 클래스
		
		
	/*
		- 클래스 정의와 동시에 객체를 생성할 수 있다./		
		- Interface와 Class 모두 익명 함수로 객체를 만들 수 있다.
		- [익명함수 사용하는 이유] 
		프로그램 내에서 한번만 객체로 만드는데 사용되는 클래스의 경우 클래스를 정의하고 생성하는 것이 비효율적이기 때문입니다. 
		익명 함수로 클래스 정의와 구현을 동시에 하여 코드 길이를 줄일 수 있습니다. 
		이런 이유로, Runnable이나 Event Listener 객체를 생성하는데 주로 사용됩니다.
	*/
		
		
		
		
//		!! 인터페이스는 직접 객체 생성할 수 없다.
//		IMessage msg=new IMessage();
		
		
		
//		1) 구현 클래스
		Message msg=new Message();
		msg.msgPrint();
		
		
//		2) 다형성
		IMessage imess=new Message();
		imess.msgPrint();
		
		
//		------ 여기까지 앞에서 배웠던 부분 --------
		
		
//		● 익명 내부 객체 Anonymous class ●
		
//		3) 익명 객체 (이름이 없는데 객체로 사용할 수 있는 것)
//		→ 필요한 곳에 일시적으로 생성
//		→ 이벤트가 발생할 때만 실행 (javascript event와 비슷한 개념)
//		→ 모바일 응용 앱, JavaScript, jQuery등에서 많이 사용
//		→ 예) $("button").click(){}
		IMessage mess=new IMessage() {
			@Override
			public void msgPrint() {
				System.out.println("익명 내부 객체");
			}
		};
		
		mess.msgPrint();
		
		System.out.println(mess);
		
		
		
		
		
		

	} // main() end
	
} // class end
