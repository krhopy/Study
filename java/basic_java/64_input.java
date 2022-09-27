package oop0920;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test02_input {

	public static void main(String[] args) {
		// 2) char기반 → 한글 안 깨짐

		String filename="/Users/kangseonlee/Desktop/itwill/java202207/workspace/basic01_java/src/oop0920/data.txt";
		
		FileReader fr=null;
		
		try {
			
			fr=new FileReader(filename);
			
			while(true) {
				int data=fr.read();	//2바이트 읽기
				if(data==-1) {
					break;
				}//if end
				System.out.printf("%c", data);
			}//while end
			
		} catch (Exception e) {
			System.out.println("파일 읽기 실패 : " + e);
		} finally {
			//자원반납
			//정상적으로 나와도 close, 비정상적으로 나와도 close 시켜줘야한다.
			try {
				if(fr!=null) {fr.close();}
			} catch (Exception e2) {}
		}//end 
		
		
		
		
		
	} // main() end
	
} // class end
