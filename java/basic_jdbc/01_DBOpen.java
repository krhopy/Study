package jdbc0921;

import java.sql.*;

public class Test01_DBOpen {

	public static void main(String[] args) {
		// Oracle DB 18c XE 연결
		// 데이터베이스 연결은 항상 똑같기 때문에 기계적으로 작업할 수 있다. 따로 라이브러리가 있다.
		
		try {
//			서버 연결할 때마다 항상 똑같이 반복되는 작업
			
			//1) 오라클DB 서버 연결 관련 정보
			String url	   ="jdbc:oracle:thin:@localhost:1521:xe"; // 내 컴퓨터 주소 (=127.0.0.1) 
														 // 제 컴퓨터 pc에(localhost에) 1521번 문을 열고 들어오세요.(1521은 포트번호) 
												 		 // → 1521번 번호를 가진 사용자만 들어올 수 있도록 설정하는 것.
														 // 그 중에서도 xe 버전이에요.
			String user	   ="sys as sysdba";	//사용자이름
			String password="1234"; 	//사용자비밀번호
			String driver  ="oracle.jdbc.driver.OracleDriver";//ojdc8.jar 이게 있어야 오라클 디비 연결할 수 있음. 
															  //ojdc8.jar  파일 안에있는 driver 경로를 작성
			
			//2) 드라이버 로딩
			Class.forName(driver); // 길을 깔아주는 작업.
			
			
			//3) 오라클 DB 서버 연결
			DriverManager.getConnection(url, user, password); //정보를 넘겨주는 작업.
			
			System.out.println("오라클 DB 서버 연결 성공!!");
			
			
			
		} catch (Exception e) {
			System.out.println("오라클 DB 연결 실패 : " + e);
		}//end 
		
		

		
	}//main() end

}//class end
