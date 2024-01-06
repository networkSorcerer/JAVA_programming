package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection makeConnection(String id, String password) {
		//11g : jdbc : oracle : thin : @127.0.0.1 : 1521 : xe
		//서버위치 : 포트번호 : SID
		//21c :jdbc : oracle : thin : @127.0.01. : 1521/xepd1 <=12c 이상
		//서버위치 : 포트번호 / 서비스 이름 (xe or xepdb1)
		String serviceName ="XEPDB1";
		if(id.equals("hr")) {
			serviceName="xe";
		}
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/" +serviceName;
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터 베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("연결에 실패하였습니다");
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String arg[]) throws SQLException {
		Connection con = makeConnection ("hr", "hr1234");
		con.close();
	}
}
