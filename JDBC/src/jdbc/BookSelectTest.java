package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookSelectTest {
	public static void main(String []args) {
//		Connection con = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			con = ConnectDatabase.makeConnection("JAVAUSER","JAVA1234");
//			stmt = con.createStatement();
//			
//			StringBuffer sql = new StringBuffer();
//			sql.append("select book_id, title, publisher, year, price ");
//			sql.append(" from books");
//			rs = stmt.executeQuery(sql.toString());
//			
//			System.out.println("**** BOOKS 테이블 정보 츨력 ****\n");
//			while (rs.next()) {
//				System.out.print(rs.getInt("book-id")+ "\t");
//				System.out.print(rs.getInt("title")+ "\t");
//				System.out.print(rs.getInt("publisher")+ "\t");
//				System.out.print(rs.getInt("year")+ "\t");
//				System.out.print(rs.getInt("price"));
//
//			}
//			
//		} catch (SQLException s) {
//			System.out.println("[쿼리문 error]\n" + s.getMessage());
//			s.printStackTrace();
//		} finally {
//			try {
//				if(rs != null) rs.close();
//				if(stmt != null) stmt.close();
//				if(con != null) con.close();
//			} catch (SQLException sqle) {
//				System.out.println("CLOSE ERROR");
//			}
//		}
		
		StringBuffer sql = new StringBuffer();
		sql.append("select book_id, title, publisher, year, price");
		sql.append(" from books");
		
		try(Connection con = ConnectDatabase.makeConnection("JAVAUSER","JAVA1234");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql.toString())) {
				System.out.println("**** BOOKS 테이블 정보 출력 ****\n");
				while (rs.next()) {
					System.out.print(rs.getInt("book_id") + "\t");
					System.out.print(rs.getInt("title") + "\t");
					System.out.print(rs.getInt("publisher") + "\t");
					System.out.print(rs.getInt("year") + "\t");
					System.out.print(rs.getInt("price") );
				}
		} catch (SQLException s) {
			System.out.println("[쿼리문 error]\n" +s.getMessage());
			s.printStackTrace();
		}
	}

}
