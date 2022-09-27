package oop0914;

public class Test06_jumin {

	public static void main(String[] args) {
		
//		[문제] 주민번호 유효성 검사
		
//		1. jumin 클래스 생성

		
		Jumin id=new Jumin("8912301234567"); // 아무 임시 주민번호 넣기
		
		if(id.validate()) {
			System.out.println("주민번호 맞다");
			id.disp();
		}else {
			System.out.println("주민번호 틀리다");
		}//if end
		
		/* 
        	띠 계산
        	var animal=["원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"];
        	document.write("띠:" + animal[cYear%12]);
        	12로 나눴을때 나머지가 0인것부터 원숭이
		*/
		
		
	} // main() end
	
} // class end
