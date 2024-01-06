package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookInsertTest {
	//public static void main (String arg[]) {
		//Connection conn = null;
		//Statement stmt = null;
		
		//try {
			//conn = ConnectDatabase.makeConnection("javauser", "java1234");
			//stmt = conn.createStatement();
			
			//StringBuffer sb = new StringBuffer();
			//sb.append("insert into books (book_id, title, publisher, year, price)");
			//sb.append("values (books_seq.nextval, '이것이 우분투 리눅스다', '한빛 미디어', '2020',32000)");
			
			//int insertCount = stmt.executeUpdate(sb.toString());
			
			//if (insertCount == 1) {
				//System.out.println("레코드 추가 성공");
			//} else {
				//System.out.println("레코드 추가 실패");
			//}
		//} catch (SQLException e ) {
			//try {
				//if(stmt != null) stmt.close();
				//if(conn != null) conn.close(); 
			//} catch (Exception en) {
				//en.printStackTrace();
			//}
		//}
	//}
	public static void main (String arg[]) {
		Connection conn = null;
		Statement stmt = null;
		//추후 키보드로 입력받아 데이터 저장을 위해
		String title, publisher, year;
		int price;
		
		title = "오늘부터 개발자";
		publisher = "천그루 숲";
		year = "2021";
		price = 15000;
		
		try { 
			conn = ConnectDatabase.makeConnection("JAVAUSER", "JAVA1234");
			//Statement 사용방법
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM ALL_SEQUENCES WHERE SEQUENCE_NAME = 'BOOKS_SEQ'");
			rs.next();
			int count = rs.getInt(1);
			if (count == 0) {
				// 시퀀스가 존재하지 않으면 생성
				stmt.executeUpdate("CREATE SEQUENCE BOOKS_SEQ START WITH 1 INCREMENT BY 1 MAXVALUE 999999999 MINVALUE 1 NOCYCLE NOCACHE");
			}
			
			StringBuffer sb = new StringBuffer();
			
			
			sb.append("insert into books (book_id, title, publisher, year, price) ");
			sb.append("values (books_seq.nextval,'"+title+"','"+publisher);
			sb.append("','" +year + "'," + price+")");
			
			int insertCount = stmt.executeUpdate(sb.toString());
			
			if(insertCount == 1) {
				System.out.println("레코드 추가 성공");
			} else {
				System.out.println("레코드 추가 실패");
			}
			} catch (SQLException e) {
			System.err.println("[쿼리문 error]\n" + e.getMessage());
			} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception en) {
				en.printStackTrace();
			}
			}
	}
}
