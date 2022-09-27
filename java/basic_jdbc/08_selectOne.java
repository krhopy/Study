package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test02_selectOne {

	public static void main(String[] args) {
		
		// sungjuk 테이블에서 한 행 가져오기
		
		int sno=23;
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null; 
		
		
		try {
			String url	   ="jdbc:oracle:thin:@localhost:1521:xe"; 
			String user	   ="sys as sysdba";
			String password="1234"; 
			String driver  ="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			System.out.println("오라클 DB 서버 연결 성공!!");
			
			
			StringBuilder sql=new StringBuilder();
			sql.append(" SELECT sno, uname, kor, eng, mat, tot, aver, addr, wdate ");	//칼럼명이 모두 노출이 되었을 때 * 찍기, 아니라면 칼럼명 모두 다 작성
			sql.append(" FROM sungjuk ");
			sql.append(" WHERE sno=? ");
			
			
			pstmt=con.prepareStatement(sql.toString());	// con(결과값) sql문을 실행시켜주는 명령어.
			pstmt.setInt(1, sno);
			
			
			rs=pstmt.executeQuery(); // ResultSet을 실행시켜주는 명령어.

			if(rs.next()) { //cursor가 있는지? 
				//next()는 커서의 다음요소라는 의미인데, 커서가 가리킨 다음요소가 있으면 true 없으면 false 값을 판단할 수 있다.
				System.out.println("자료있음 @@");	
				
				//1) 칼럼순서 접근
				System.out.println(rs.getInt(1));	//1번칼럼 sno
				System.out.println(rs.getString(2));//2번칼럼 uname
				System.out.println(rs.getInt(3));	//3번칼럼 kor
				System.out.println(rs.getInt(4));	//4번칼럼 eng
				System.out.println(rs.getInt(5));	//5번칼럼 mat
				System.out.println(rs.getInt(6));	//6번칼럼 tot
				System.out.println(rs.getInt(7));	//7번칼럼 aver
				System.out.println(rs.getString(8));//8번칼럼 addr
				System.out.println(rs.getString(9));//9번칼럼 wdate
				
				
				//2) 칼럼명 접근
				System.out.println(rs.getInt("sno"));	//1번칼럼 sno
				System.out.println(rs.getString("uname"));//2번칼럼 uname
				System.out.println(rs.getInt("kor"));	//3번칼럼 kor
				System.out.println(rs.getInt("eng"));	//4번칼럼 eng
				System.out.println(rs.getInt("mat"));	//5번칼럼 mat
				System.out.println(rs.getInt("tot"));	//6번칼럼 tot
				System.out.println(rs.getInt("aver"));	//7번칼럼 aver
				System.out.println(rs.getString("addr"));//8번칼럼 addr
				System.out.println(rs.getString("wdate"));//9번칼럼 wdate
				
				
			}else {
				System.out.println("자료없음 @@");
			}//if end
			
			
		} catch (Exception e) {
			System.out.println("실패" + e);
		}finally{	//자원반납 (순서주의)
			try {
				if (rs!=null) {rs.close();}
			} catch (Exception e) {}
			try {
				if (pstmt!=null) {pstmt.close();}
			} catch (Exception e) {}
			try {
				if (con!=null) {con.close();}
			} catch (Exception e) {}
		}//end
		
		System.out.println("END");
		

		
		
	} // main() end
	
} // class end
