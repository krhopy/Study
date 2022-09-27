package oop0908;

import java.util.StringTokenizer;

public class Test04_quiz {

	public static void main(String[] args) {
		// String 관련 연습 문제
		
		//문1) 
		String email=new String("webmaster@itwill.co.kr");
		//문1) 이메일 주소에 @문자 있으면
        //    @글자 기준으로 문자열을 분리해서 출력하고
        //    @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오        
        /*    
              출력결과
              webmaster
              itwill.co.kr
        */
		
		if(email.indexOf("@")==-1) {	//-1이 나오면 @가 없다는 의미.
			System.out.println("이메일 주소 틀림!!");
		}else {
			System.out.println("이메일 주소 맞음^^");
			
			int pos=email.indexOf("@");
			System.out.println(pos); //9
			
			String id	 =email.substring(0, pos);  //9자리
			String server=email.substring(pos+1);	//10자리
			
			System.out.println(id);
			System.out.println(server);
		}// if end
		
		
		
		
		
		
		
//		---------------------------------------------------------------
		
//		[내가 작성한 코드]
			
//		int index=email.indexOf("@");
//		System.out.println(index);
//		
//		// 골뱅이 앞 아이디
//		String email_ID = email.substring(0, index);
//		System.out.println(email_ID);
//		
//		// 골뱅이 뒤 주소
//		String email_domain = email.substring(index+1);
//		System.out.println(email_domain);
//		
//		
//		
//		
//		if (index==0) {
//			System.out.println("이메일 주소 틀림");
//		}
//		
//		System.out.println();

			

		
/////////////////////////////////////////////////////////////////////////////////		
		
			
			
		//문2)
		// 특정파일만 업로드 시켜줄 수 있는 게시판 (ex.사진게시판)
		// 파일 제한
		// 문자열 .png 빼야함
		
		
		//문2) 이미지 파일만 첨부 (.png .jpg .gif)
        /*     
               출력결과 
               파일명 : sky2022.09.08
               확장명 : png
        */
		
		String path=new String("i:/frontend/images/sky2022.09.08.png");
		
		//마지막 "/" 기호의 순서값
		// ＃lastindexOf() : ()값의 마지막 인덱스 
		int lastSlash=path.lastIndexOf("/");
		System.out.println(lastSlash); //18 18번째 인덱스에 /가 있다.
	
		//전체 파일명
		String file=path.substring(lastSlash+1);
		System.out.println("전체 파일명 : " + file);
		
		
		//file에서 마지막 "." 기호의 순서값
		int lastDot=file.lastIndexOf(".");
		System.out.println(lastDot); //13
		
		
		//파일명
		String filename = file.substring(0, lastDot);
		System.out.println("파일명 : " + filename);
		
		
		//확장명
		String ext = file.substring(lastDot+1);
		System.out.println("확장명 : " + ext);
		
		
		//확장명을 전부 소문자로 치환
		ext=ext.toLowerCase();
		if(ext.equals("png") || ext.equals("jpg") || ext.equals("gif")){
			System.out.println("파일이 전송되었습니다~");
		}else {
			System.out.println("이미지 파일만 가능합니다!!");
		}//if end
		// 이 코드를 alert로 바꾸면 경고창이 뜬다.
		
		
//		---------------------------------------------------------------
		
//		[내가 작성한 코드]
							
//		String result = path.substring(path.lastIndexOf("/")+1);
//		//System.out.println(result);
//		
//		
//		int sky=(result.lastIndexOf("."));
//		//System.out.println(sky);
//		
//		//파일명
//		String name = result.substring(0, sky);
//		System.out.println(name);
//		
//		//확장명
//		String file = result.substring(sky+1);
//		System.out.println(file);
		
		


		
		
	}//main() end
}//class end
