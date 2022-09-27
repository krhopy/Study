package jdbc0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test05_insert {

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
			
			
			String name="박지성";
			int kor=99, eng=98, mat=100;
			String addr="Seoul";
			
			
			StringBuilder sql=new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)");
			sql.append(" VALUES (sungjuk_seq.nextval, ?, ?, ?, ?, ?, sysdate) "); // 그냥 ? 넣으면 다양한 넣을 수 있다. -> ? 특정 값으로 대입할 수 있는 표식
												//'?' => 이건 ?문자가 출력된다. 주의하기.
						   						// ?에는 값이 순서대로 들어간다. 그래서 ?의 개수와 순서, 자료형을 일치시켜야한다.
			
			PreparedStatement pstmt=con.prepareStatement(sql.toString());
			// → ? 의 개수, 순서, 자료형이 일치해야 한다.
			
			pstmt.setString(1, name); 	// 1 → 첫번째 물음표, uname칼럼. 
			pstmt.setInt(2, kor); 		// 2 → 두번째 물음표, kor칼럼.
			pstmt.setInt(3, eng); 		// 3 → 세번째 물음표, eng칼럼.
			pstmt.setInt(4, mat); 		// 4 → 네번째 물음표, mat칼럼.
			pstmt.setString(5, addr); 	// 5 → 다섯번째 물음표, addr칼럼.
			
			int cnt=pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("행 추가 실패!!");
			}else {
				System.out.println("행 추가 성공~~");
			}//if end
			
			
		} catch (Exception e) {
			System.out.println("실패" + e);
		}//end
		
		System.out.println("END");
		

	}//main() end

}//class end
