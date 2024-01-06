package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementTest {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		String title, publisher, year;
		int price;
		
		System.out.println("\n**** books 테이블 데이터 입력 및 수정 ****");
		
		System.out.println("책제목 입력 : " );
		title = input.nextLine();
		System.out.println("출판사 입력 : ");
		publisher =input.nextLine();
		System.out.println("출판연도 입력 : ");
		year =input.nextLine();
		System.out.println("가격 입력 : ");
		price =input.nextInt();
		
		addBook(title, publisher, year, price);
		
		input.close();
	}
	
	public static void addBook(String title, String publisher, String year, int price) {
		Connection con = ConnectDatabase.makeConnection("JAVAUSER","JAVA1234");
		PreparedStatement pstmt = null;
		try {
			StringBuffer sb = new StringBuffer();
			sb.append("insert into books (book_id, title, publisher, year, price) ");
			sb.append("values (books_seq.nextval,?,?,?,?)");
			
			pstmt = con.prepareStatement(sb.toString());
			
			pstmt.setString(1, title);
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			
			int insertCount = pstmt.executeUpdate();
			
			if(insertCount == 1) {
				System.out.println("레코드 추가 성공");
				
			}else 
				System.out.println("레코드 추가 실패");
		}catch (SQLException e) {
			System.err.println("[쿼리문 error]\n" + e.getMessage());
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(con != null) {con.close();}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	
	}
	
	private static void readAllBook() {
		Connection con = ConnectDatabase.makeConnection("JAVAUSER","JAVA1234");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			StringBuffer sb = new StringBuffer();
			sb.append("select book_id, title, publisher, year, price ");
			sb.append("from books order by book_id");
			
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			System.out.println("\n**** books 테이블 데이터 출력 ****");
			System.out.printf("%s\t%-20s\t%12s\t%s\n", "책번호", "책제목","출판사","출판연도","가격");
			
			while(rs.next()) {
				System.out.printf("%d\t", rs.getInt("book_id"));
				System.out.printf("%-26s", rs.getString("title"));
				System.out.printf("%-13s\t", rs.getString("publisher"));
				System.out.printf("%s\t", rs.getString("year"));
				System.out.printf("%d\n", rs.getString("price"));
			}
		}catch (SQLException e) {
			System.out.println("[쿼리문 error] \n" + e.getMessage());
		}finally {
			try {
				if(rs != null) {rs.close();}
				if(pstmt != null) {pstmt.close();}
				if(con != null) {con.close();}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
