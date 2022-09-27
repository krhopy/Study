package jdbc0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02_insert {

	public static void main(String[] args) {
		// sunguk 테이블 행 추가 연습
		
		try {
			
			String url	   ="jdbc:oracle:thin:@localhost:1521:xe"; 
			String user	   ="sys as sysdba";
			String password="1234"; 
			String driver  ="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con =DriverManager.getConnection(url, user, password);//최종결과값 con 변수에 담기
			System.out.println("오라클 DB 서버 연결 성공!!");
			
			
			//4) SQL 작성
			// → 주의사항) SQL 종결문자 ;를 쓰면 오류남
			StringBuilder sql=new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)");
//			sql.append("values (sungjuk_seq.nextval, '손흥민', 99, 98, 97, 'Seoul', sysdate)"); 위에있는 문장과 띄어쓰기가 안돼서 나온다. 
			sql.append(" VALUES (sungjuk_seq.nextval, '손흥민', 99, 98, 97, 'Seoul', sysdate)");
//			System.out.println(sql.toString());
			
			
			//5) SQL형식으로 변환 (명령어)
			PreparedStatement pstmt =con.prepareStatement(sql.toString());
			
			
			//6) SQL문 실행
			int cnt =pstmt.executeUpdate();	// INSERT, UPDATE, DELETE. 반환형은 int
			//행의 개수가 반환된다. INSERT, UPDATE or DELETE = 한개 수정했다, 1개 삭제했다.는 의미를 반환함
			// 0개는 반환되지 않는다. 
			// 반환결과를 꾸며낼 수 있다.
			
			System.out.println("실행결과 : " + cnt);
			
			

		} catch (Exception e) {
			System.out.println("실패" + e);
		}//end
		
		System.out.println("END");
		

	}//main() end

}//class end
