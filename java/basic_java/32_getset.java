package oop0913;	
	
	
class BbsDTO { //Data Transfer Object
	// 내가 가지고있는 것을 옆으로 전송할 때
	
	//멤버변수
	private int bbsno; 		  //글번호
	private String writer;	  //글작성자
	private String subject;  //글제목

	
//	이클립스가 자동으로 만들어준 생성자 함수
	public BbsDTO() {}
	
	
//	**private int bbsno; 에 접근하고싶은데 private이면 -> 함수를 사용 (간접접근)
	public int getBbsno() {
		return this.bbsno;
	}//end
	
	
	public void setBbsno(int bbsno) {
		this.bbsno=bbsno;
	}//end
	
	public String getWriter() {
		return this.writer;
	}
	
	public void setWriter(String writer) {
		this.writer=writer;
	}
	
	
	public String getSubject() {
		return this.subject;
	}
	
	public void setSbuject(String subject) {
		this.subject=subject;
	}
	
}//class end



public class Test06_getset {
//	우선 해당 메서드를 사용하는 이유는 필드 값에 부적절한 값이 대입되는 것을 막기 위해서이다. 
//	(물론 각 객체들의 캡슐이 깨지지 않게 하기 위함도 있다.)
//	 private로 직접적인 접근을 할 수 없도록 막고, getter/setter메서드를 통해서만 접근할 수 있도록 제한할 수 있다. 아래 코드를 보자.
//	 참조 - https://seeminglyjs.tistory.com/178
	


	public static void main(String[] args) {
//		[getter와 setter 함수]
//		get - 무언가를 가져오는 것
//		set - 무언가를 주는 것
		
		/*
		  ● 함수명 작성 규칙
		  - is함수명()	대부분 맞는지 틀린지 물어보는 것. boolean으로 반환
		  - to함수명()	to 뒤에 있는 값으로 반환하라는 것.
		  - get함수명()	무언가를 얻어올 때. return값 존재 ex) css() 비어있으므로 무언가 얻어오겠다는 개념
		  - set함수명()	원하는 값으로 세팅할 때.		   ex) css("size", 15) - 사이즈를 15로 세팅하겠다는 개념: setter
		*/
		
		
//		[getter]함수명을 작성하는 규칙 (이클립스 프로그램에 source라는 곳에 이미 들어가있음.)
//		→ get멤버변수의첫글자대문자로바꾼후함수명()
		
//		[setter]함수명을 작성하는 규칙
//		→ set멤버변수의첫글자대문자바꾼후함수명()
		
		
		BbsDTO dto=new BbsDTO();
		
		dto.setBbsno(1);
		dto.setWriter("오필승");
		dto.setSbuject("무궁화 꽃이 피었습니다");
		
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWriter());
		System.out.println(dto.getSubject());
		
	
	
	}//main() end
	
}//class end
