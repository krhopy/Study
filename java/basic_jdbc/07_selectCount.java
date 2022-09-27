package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01_selectCount {

	public static void main(String[] args) {
		
		// sungjuk 테이블의 행의 개수를 출력하시오
		
	
		Connection con=null;			// → java와 Database를 연결해주는 객체
		PreparedStatement pstmt=null;	// → SQL구문을 실행시키는 기능을 갖는 객체 (statement를 상속받는 인터페이스)
		ResultSet rs=null; 				// → SELECT문의 결과를 저장하는 객체
		
		
		/*
	    ResultSet : SELECT문의 결과를 저장하는 객체
		 			이때 Cursor는 ResultSet이 결과값으로서 받아온 SQL 테이블의 각 행을 가리킨다.
		 			각 행을 이동하며 그 값을 확인할 수 있게끔 해준다.
					Cursor는 처음에 Before the first row를 가리키고있다.
					첫 번째 노드가 아닌 그 앞의 무언가를 가리키고 있는 것과 같다.
					따라서 1부터 시작한다.
					
					a b c d e		 
				  ↑					==>  		a를 가리키고 있다.
				  
				  next()를 활용해 값을 가져오게 된다.
				  다음행으로 커서를 이동한 다음 더이상 행이 존재하지 않을 때까지 true를 리턴. 다음행이 없으면 false 리턴.
		*/
		
		
		
//		이 객체들은 try~catch문으로 자원반납 해줘야 한다!!
//		→ 데이터베이스 연동과 관련이있는 인터페이스이기 때문에 자원반납을 반드시 할 것을 추천.
//		→ 자원반납 순서는 작성한 순서 반대로 닫아줘야한다. (스택 호출과 비슷한 것인가?)
		
		
		
		/*
		DB는 네트워크 연결의 문제 등에서 에러가 발생할 수 있습니다. 이에 **반드시** try-catch 문으로 에러를 잡아 StackTrace를 통해 추후 Exception이 발생한 위치를 정확히 알 수 있도록 합니다.
		*/
		
		try {
			String url	   ="jdbc:oracle:thin:@localhost:1521:xe"; 
			String user	   ="sys as sysdba";
			String password="1234"; 
			String driver  ="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			System.out.println("오라클 DB 서버 연결 성공!!");
			
			
			StringBuilder sql=new StringBuilder();
			sql.append(" SELECT COUNT(*) AS cnt ");
			sql.append(" FROM sungjuk ");
			
			
			pstmt=con.prepareStatement(sql.toString());	// con(결과값) sql문을 실행시켜주는 명령어.
			rs=pstmt.executeQuery(); // ResultSet을 실행시켜주는 명령어.
			
			//cursor: 행을 가리키는 값. 이동할 수 있다
			if(rs.next()) { //cursor가 있는지? 
				//next()는 커서의 다음요소라는 의미인데, 커서가 가리킨 다음요소가 있으면 true 없으면 false 값을 판단할 수 있다.
				System.out.println("자료있음 @@");
				
				//1) 칼럼 순서 접근 
				// → select 칼럼1, 칼럼2, 칼럼3 ~~~
				// → 자료형을 일치하면서 가져온다.
				// → 예를들어 cnt값은 정수형이기 때문에 int형으로 가져와야한다.
				System.out.println("전체 행 개수 : " + rs.getInt(1));
									//rs.getInt(1): rs에서 정수형을 가져오는데, 그 중 첫번째 칼럼을 가져오라는 의미.
				
				//2) 칼럼명으로 접근. 
				// →칼럼이 여러개면 칼럼명으로 접근하는게 편하다. 보통 많이 사용
				System.out.println("전체 행 개수 : " + rs.getInt("cnt")); 
									// 위에 SELECT COUNT(*) AS cnt 에서 이름을 cnt로 주었으므로 "cnt" 값을 가져오라는 의미
				
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
		
		
		
//		<자원반납 순서>
		
//		맨 위에 데이터 연동 인터페이스 선언 한 문장의 작성 순서
//		Connection con=null;
//		PreparedStatement pstmt=null;
//		ResultSet rs=null;
		
//		자원반납은 
//		1. ResultSet rs=null;
//		2. PreparedStatement pstmt=null; 
//		3. Connection con=null; 순서로 작성해야한다.

		
		
		
		
		
		
		
	} // main() end
	
} // class end
