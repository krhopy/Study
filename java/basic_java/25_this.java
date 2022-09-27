package oop0913;

class Score{ // 스코어 설계도
	
//	[멤버변수 field]
	private String name="손흥민";
	private int kor, eng, mat;
	private int aver;
	
	
//	[생성자함수 constructor] - 오버로딩 가능
//	＃ 생성자함수를 오버로딩하면 기본생성자 함수는 자동으로 생성되지 않는다.
//	--> 그래서, 기본생성자 함수는 수동으로 직접 작성해놓는 것을 추천!!
	public Score() {}
	
//	↓ 이게 없으면 기본생성자 자동생성되지만, 있으면 생성되지 않는다.
	public Score(String name, int kor, int eng, int mat) {
//		→ 멤버변수와 생성자함수의 지역변수의 칼럼명이 같다.
//		→ (String name, int k, int e, int m)  이렇게 써도되지만 이름을 똑같이 사용하는 것을 추천
//		→ (String name, int kor, int eng, int mat) 이 지역변수는 여기 안에서 밖에 사용하지 못한다.
//		→ 멤버변수는 class안에서 모두 사용가능하다.
		
		//name 이렇게 작성하면 멤버변수를 가리키는 것인지, 생성자함수의 name 을 가리키는 것인지 헷갈린다.
		this.name=name; //글자색도 구분된다. 
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.aver=(kor+eng+mat)/3;
		//this.name = 멤버변수의 name , =name; 지역변수인 생성자함수안의 변수의 name
	}//end
	
	
	
//	[멤버함수 method]
	public void disp() {
		//지역변수의 우선순위가 가장 높다.
		String name="박지성"; 	 // 이거 작성하면 밑에있는 syso name 색상 바뀜
		System.out.println(name);// 손흥민이 아니고 박지성 나옴 → 가까이 있는 변수(지역변수)의 값이 나온다.
		
		//손흥민 쓰고싶으면? this.으로 멤버변수 불러온다!
		System.out.println(this.name); //this.를 사용하면 멤버변수를 쓸 수 있다.
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
		
	}//disp() end
	
}//class end






// ＃ .java 소스 안에 하나의 클래스만 만드는 것이 일반적이다.
// ＃ public은 하나만 사용하기.

public class Test01_this {

	public static void main(String[] args) {
		
//		● this ●
//		→ 클래스가 자신을 가리키는 대명사
//		→ 일반지역변수와 멤버변수를 구분하기 위함
		
//		● this() ● 와는 다르다.
//		→ 자신의 생성자 함수를 호출
		
		
//		＃참조변수에 같은 변수를 할당 해야한다.(score) / 주소값 생성.
		Score one=new Score("김연아", 50, 60, 75);	//object 객체 = instance 인스턴스 같은 말
		one.disp();

		Score two=new Score(); //에러남. The constructor Score() is undefined: 생성자 정의되지 않았다.
		two.disp();			   // --> 기본 생성자함수가 없다는 의미. public Score() {}
		
		Score three=new Score("무궁화", 10, 20, 25);
		three.disp();
		
//		 객체 지향 프로그램 특징 : 은폐, 캡슐화
//		--> ("무궁화", 10, 20, 25) : 한 사람에 대한 모든 정보를 한 공간 안에 모아둘 수 있다는 의미
		
		
//		● 객체의 주소나 메모리 할당이 제대로 되었는지 확인하는 작업 ●
		
//		[객체가 참조하고 있는 주소]
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(three.hashCode());
		
		
//		[객체 생성(메모리 할당)의 여부 확인]
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		

		one=null;
		System.out.println(one);
		
		
//		-------------------------------------------------------------------
		
		Score kim  =new Score("봉선화", 10, 20, 30); //#100
		Score lee  =new Score("라일락", 40, 50, 60); //#200
		Score park =new Score("진달래", 70, 80, 90); //#300
		
//		new => 주소가 새롭게 할당이 된다.
		
		
//		위에 있는 객체를 배열로 만들 수 있다.
		Score[] score= {
						  new Score("오필승", 11, 22, 33)
						 ,new Score("코리아", 44, 55, 66)
						 ,new Score("대한민국", 77, 88, 99)
				  	   };
		
			
		/*	객체 배열 시각화
            +---------+---------+--------+
            |  #100   |  #200   |  #300  |
            +---------+---------+--------+
             score[0]   score[1]  score[2]
        */
		
		score[0].disp();
		score[1].disp();
		score[2].disp();
		
		
//		score 배열 반복변수로 바꾸기
		int size=score.length;
		
		for(int i=0; i<size; i++) {
			score[i].disp();
		}//for end
		
//		<에러> i<=size 로 작성해서 에러남.
//		Index 3 out of bounds for length 3
//		인덱스 길이 3의 기준을 넘어감
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
