package oop0919;


class MyThread1 {
	private int num;
	private String name;
	
	public MyThread1() {}
	
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}//end
	
	
	//함수생성
	public void start() {
		run();
	}//start() end
	
	public void run() {
		//start를 통해서 부른다.
		//기능구현은 run에서.
		for(int a=0; a<num; a++) {
			System.out.println(name+":"+a);
		}//for end
	}//run() end
	
}//class end





public class Test02_thread {

	public static void main(String[] args) {
		// Thread 클래스
		// → 하나의 프로그램이나 하나의 메소드가 cpu자원을 전부 점유하는 것을 막을 수 있다.
		
		/*
			 스레드 없이 채팅프로그램을 제작할 수 없음. 엔터를 치기 전까지 다른 사람들의 채팅글이 올라옴. 
			 먼저 작성하고 있는 사람이 끝나야 내가 작성할 수 있음. 앞에 끝날때까지 무한대기. 은행업무같은..일..
			 => 잠깐씩 cpu가 다른작업을 실행시키는 것.
			 이클립스를 열고있어도 다른 유튜브, 메모장, 다른 사이트를 사용할 수 있다. 동시에 2가지를 사용할 수 없도록 
			 기능이 구성되어있다. 멀티프로세싱. 
		*/
		
		
		//1) 쓰레드를 사용하지 않은 경우
		// 1-1. MyThread1 클래스 생성했음.
		// 1-2. 메인에서 객체 생성
		MyThread1 t1=new MyThread1(1000, "★");
		MyThread1 t2=new MyThread1(1000, "★★");
		MyThread1 t3=new MyThread1(1000, "★★★");
		
		t1.start();	//★:0 - ★:999
					//System.out.println(name+":"+a);
		t2.start();
		t3.start();
		//t1이 다 나온 후 t2가 나오고 t2가 다 완료되어야 t3가 나온다.
		
		
	} // main() end
	
} // class end
