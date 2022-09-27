package oop0920;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test04_output {

	public static void main(String[] args) {
		// 메모장 파일에 출력하기
		
		// 출력파일 (sungjuk.txt)
		// →없으면 파일은 생성된다(create)
		// →있으면 덮어쓰기(overwrite) 또는 추가(append)
		
		String filename="/Users/kangseonlee/Desktop/itwill/java202207/sungjuk.txt";
		// 현재 내 컴퓨터에 I:/java202207/sungjuk.txt 파일이 없는데,
		// 이것을 사용하면 I:/java202207/sungjuk.txt 이 경로로 파일이 자동으로 생성된다.

		
		FileWriter fw=null;
		//FileWriter (String fileName, boolean append)
		PrintWriter out=null;
		//PrintWriter (Writer out, boolean autiFlush)
		// text형태의 데이터 출력할때 사용된다.
		// false 주면 큰일남.
		
		
		
		try {
			
			//true  : append모드	   - 문자열이 계속 추가됨.
			//false : overwrite모드 - 기존의 정보 다 지워지고 기본정보만 남음.
			fw=new FileWriter(filename, true);
			
			//autoFlush : true 버퍼클리어
			//
			out=new PrintWriter(fw, true);	//false주면 안됨(공식임)
			
			//oop0906.Test01_format.java참조
//			out.printf()
//			printf = format의 약자 (출력할 때 왼쪽정렬, 오른쪽 정렬, 숫자형써라~ 등등 명령할 수 있다.)
			
			
			out.println("무궁화,95,90,100");
            out.println("홍길동,100,100,100");
            out.println("라일락,90,95,35");
            out.println("개나리,85,70,75");
            out.println("진달래,35,40,60");
            
            System.out.println("sungjuk.txt 데이터 파일 완성!!");
			
			
			
		} catch (Exception e) {
			System.out.println("파일 쓰기 실패: " + e);
		}finally {
			//자원 반납
			try {
				if(out!=null) { out.close(); }
			} catch (Exception e) {}
			try {
					if(fw!=null) { fw.close(); }
			} catch (Exception e) {}
	}
	


	} // main() end
	
} // class end
