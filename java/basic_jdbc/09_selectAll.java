package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test03_selectAll {

	public static void main(String[] args) {
		
		// sungjuk 테이블에서 전체 행 가져오기
		
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
			sql.append(" ORDER BY sno DESC ");
			
			
			pstmt=con.prepareStatement(sql.toString());	// con(결과값) sql문을 실행시켜주는 명령어.							
			rs=pstmt.executeQuery(); // ResultSet을 실행시켜주는 명령어.

			if(rs.next()) { 
				System.out.println("자료있음 @@");	
				do {
					System.out.print(rs.getInt("sno") + " ");
					System.out.print(rs.getString("uname") + " ");
					System.out.print(rs.getInt("kor") + " ");
					System.out.print(rs.getInt("eng") + " ");
					System.out.print(rs.getInt("mat") + " ");
					System.out.print(rs.getInt("tot") + " ");
					System.out.print(rs.getInt("aver") + " ");
					System.out.print(rs.getString("addr") + " ");
					System.out.print(rs.getString("wdate") + " ");
					System.out.println();
				}while(rs.next()); //다음 cursor가 있는지?
				
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
