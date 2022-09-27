package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test07_selectPaging {

	public static void main(String[] args) {
		// 페이징
		// 문제) sungjuk 테이블에서 이름순으로 정렬 후 행번호 4~6만 조회하시오.
		
		int start=4;
		int end=6;
		
		
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
			
			
			sql.append(" SELECT * ");
			sql.append(" FROM ( ");
			sql.append(" 		 SELECT uname, aver, addr, rownum as rnum ");
			sql.append(" 		 FROM ( ");
			sql.append(" 				 SELECT uname, aver, addr ");
			sql.append("				 FROM sungjuk ");
			sql.append("				 ORDER BY uname ");
			sql.append("			   ) ");
			sql.append("		 ) ");
			sql.append(" WHERE rnum>=? and rnum<=? ");
			
			
			
			
			pstmt=con.prepareStatement(sql.toString());	// con(결과값) sql문을 실행시켜주는 명령어.	
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs=pstmt.executeQuery(); // ResultSet을 실행시켜주는 명령어.
			
			if(rs.next()) { 
				System.out.println("자료있음 @@");	
				do {
					System.out.print(rs.getInt("rnum") + " ");
					System.out.print(rs.getString("uname") + " ");
					System.out.print(rs.getInt("aver") + " ");
					System.out.print(rs.getString("addr") + " ");
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
