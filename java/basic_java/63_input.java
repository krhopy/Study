package oop0920;

import java.io.FileInputStream;

public class Test01_input {

	public static void main(String[] args) {
		// ● 파일 입출력 ● (.txt)
		// 콘솔 입출력, 종이에 입출력을 할 수 있는 것처럼 파일에 입출력을 하는 것을 말한다.
		// File : .txt .pdf .xls .csv .ppt .jpg ~~
		// (우리는 메모장.txt에 출력할 것이다.)
		
		
		/*
		 
		 자바에서는 '스트림'이라는 일종의 징검다리를 이용하여 파일과 자바 프로그램을 연결할 수 있다.
		 
		 [ 파일 --- (스트림 연결) --- 자바 프로그램 ]
		 
		 - 파일의 내용을 읽어올 수 있다.
		 - 파일에 데이터를 내보낼 수 있다.
		 - 자바만의 I/O 모델을 기반으로 어떤 형태의 데이터든지 같은 형태로 입출력이 가능하다. 
		 
		 ▷ ​InputStream 클래스
		 ▷ FileInputStream 클래스
		 	- 주요 메소드
		 	  int read()   : 
		 	  void close() : 스트림 소멸
		 ▷ OutputStream 클래스
		 ▷ FileOutputStream 클래스
			- 주요 메소드
		 
		*/
		
		
//		〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓
		
		
		
		// byte형 : 1바이트 할당 (한글 안됨)
		// char형 : 2바이트 할당 (메모리가 조금 무거워짐)
		
		//1) byte기반 → 한글깨짐
		
		// ""에 파일 경로를 작성해야한다. data.txt파일이 oop0920 같은 경로 안에 있기 때문에 하지않아도 되지만 공부를 위해 경로 작성.
//		String filename="data.txt";
		String filename="/Users/kangseonlee/Desktop/itwill/java202207/workspace/basic01_java/src/oop0920/data.txt";
		
		// 만약 경로를 잘못작성하거나 파일이 없으면 에러가 난다.
		// 그 에러는 <예외처리>로 어떤 에러가 났는지 보여지도록 해야한다.
		
		
		// 메모장은 .java 가 아니다. data.txt은 String인데 자바는 파일을 열어봐야 인식을 할 수 있다.
		// java와 txt파일은 별개의 파일이다.
		// 파일을 열어서 다 읽고 난 후엔 닫아줘야 한다. 요새는 자동으로 닫히도록 설계되어있지만, 안되는 프로그램도 있기 때문에 그냥 무조건 작성해주는 것을 추천한다.
		

		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(filename);
			
			while(true) {
				int data=fis.read(); //1바이트 읽기
				if(data==-1) { //파일의 끝(End Of File)인지?
					break;
				}//if end
//				System.out.println(data);
				System.out.printf("%c", data);
			}//while end
		}catch (Exception e) {
			System.out.println("파일 읽기 실패 : " + e);
		}finally {
			//자원반납
			//정상적으로 나와도 close, 비정상적으로 나와도 close 시켜줘야한다.
			try {
				if(fis!=null) {fis.close();}
			} catch (Exception e2) {}
		}//end
		
		

		
		
	} // main() end
	
} // class end
