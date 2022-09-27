package oop0919;


class MyThread3 implements Runnable {	//미완성, 추상메서드가 없어서 (본체가 없음)
	
	private int num;
	private String name;
	
	public MyThread3() {}
	
	public MyThread3(int num, String name) {
		this.num = num;
		this.name = name;
	}//end
	
	@Override	// 이걸 해줘야 에러가 나지 않는다. (미완성 -> 완성)
		public void run() {
			for(int a=0; a<num; a++) {
				System.out.println(name+":"+a);
			}//for end
		}//run() end
}//class end




public class Test04_thread {

	public static void main(String[] args) {
		// 3) Runnable인터페이스를 이용해서 쓰레드를 구현한 경우
		
		/*
			interface Runnable {}
			class Thread implements Runnable {}
		*/
		
		Thread t1=new Thread(new MyThread3(1000, "★"));
		Thread t2=new Thread(new MyThread3(1000, "★★"));
		Thread t3=new Thread(new MyThread3(1000, "★★★"));
		
		
		t2.start();
		t2.start();
		t3.start();
		
		
		// 사용자가 첨부한 파일용량과 파일명이 뭔지 체크해야함
		// 파일이라고하는 클래스가 있다.
		
		
		
		
		
		
		

	} // main() end
	
} // class end
