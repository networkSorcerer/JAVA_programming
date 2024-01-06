package subject_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubjectDAO {//데이터베이스작업만을 위한 클래스
	private static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
	private static final String USER = "JAVAUSER";
	private static final String PASSWD = "JAVA1234";
	
	private static SubjectDAO instance = null;
	
	public static SubjectDAO getInstance() {
		if(instance == null) {
			instance = new SubjectDAO();
		}
		return instance;
	}
	
	private SubjectDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	private Connection getConnection() throws SQLException{
		Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		return con;
		
		
	}
	public ArrayList<SubjectVO> getSubjectTotal(SubjectVO vo){
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			SubjectVO svo = null;
			ArrayList<SubjectVO> list = new ArrayList<SubjectVO>();
			
			StringBuffer sql = new StringBuffer();
			sql.append("select no, s_num , s_name from subject ");
			if(vo != null) {
				sql.append("where s_name like ? ");
			}
			sql.append("order by no");
			
			try {
				con = getConnection() ;
				pstmt = con.prepareStatement(sql.toString());
				if(vo != null) {
					pstmt.setString(1, "%" + vo.getS_name() + "%");
				}
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					svo = new SubjectVO();
					
					svo.setNo(rs.getInt("no"));
					svo.setS_num(rs.getString("s_num"));
					svo.setS_name(rs.getString("s_name"));
					
					list.add(svo);
				}			
		}catch (SQLException se) {
			System.out.println("조회에 문제가 있어 잠시 후에 다시 진행해 주세요 ");
			se.printStackTrace();
		}catch(Exception e) {
			System.out.println("error = [" + e.getMessage()+" ]");
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(SQLException e ) {
				System.out.println("디비 연동 해제 error = [" + e+ "]");
			}
		}
			return list;
	}
		
		public String getSubjectNum() {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String subjectNumber = "";
			
			//쿼리문 그대로 가져와서 붙여 넣기 해주세요
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT NVL(LPAD(MAX(TO_NUMBER(LTRIM(S_NUM,'0')))+1,2,'0'),'01')");
			sql.append("AS SUBJECTNUM FROM SUBJECT");
			try {
				con = getConnection();
				pstmt = con.prepareStatement(sql.toString());
				rs = pstmt.executeQuery();
				if(rs.next()) {
					subjectNumber = rs.getString("subjectNum");
				}
			}catch (SQLException se) {
				System.err.println("쿼리 getSubjectNum error = [" + se.getMessage() + "]");
				se.printStackTrace();
			}catch (Exception e) {
				System.out.println("error = [" +e+ " ]");
			}finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException se) {
					System.out.print("디비 연동 해제 error = [" + se + "]");
				}
			}
			return subjectNumber;
		}
		
		public boolean subjectInsert(SubjectVO svo) {
			StringBuffer sql = new StringBuffer();
			sql.append("insert into subject(no, s_num, S_name) ");
			sql.append("values(subject_seq.nextval, ?, ?)");
			
			Connection con =null;
			PreparedStatement pstmt = null;
			boolean success = false;
			try {
				con = getConnection () ;
				pstmt = con.prepareStatement(sql.toString ());
				pstmt.setString(1, svo.getS_num());//첫번째 ? (바인딩변수)설정값 - 학과번호
				pstmt.setString(2, svo.getS_name());//두번째 ?(바인딩변수)설정값 - 학과명
				
				int i = pstmt.executeUpdate();//쿼리문 실행 - 결과값은 입력된 행의 수 반환
				if(i == 1) {
					success = true;
				}
			}catch (SQLException se) {
				System.out.println("입력에 문제가 있어 잠시 후에 다시 진행해 주세요");
				//se.printStackTrace(); 오류발생시 확인
			}catch (Exception e) {
				System.out.println("error =[" + e.getMessage() + " ]");
			}finally {
				try {
					if (pstmt != null) pstmt.close( );
					if (con != null) con.close( );
				}catch (SQLException e) {
					System.out.println("디비 연동 해제 error = [" + e+ " ]");
				}
			}
			return success;	
		}
		public boolean subjectUpdate(SubjectVO svo) {
			StringBuffer sql = new StringBuffer();
			sql.append("update subject set s_name = ? ");
			sql.append("where no = ?");
			
			Connection con = null;
			PreparedStatement pstmt = null;
			boolean success = false;
			
			try {
				con = getConnection () ;
				pstmt = con.prepareStatement(sql.toString ());
				pstmt.setString(1, svo.getS_name());//첫번째 ? (바인딩변수)설정값 - 학과번호
				pstmt.setInt(2, svo.getNo());//두번째 ?(바인딩변수)설정값 - 학과명
				
				int i = pstmt.executeUpdate();//쿼리문 실행 - 결과값은 입력된 행의 수 반환
				if(i == 1) {
					success = true;
				}
			}catch (SQLException se) {
				System.out.println("입력에 문제가 있어 잠시 후에 다시 진행해 주세요");
				//se.printStackTrace(); 오류발생시 확인
			}catch (Exception e) {
				System.out.println("error =[" + e.getMessage() + " ]");
			}finally {
				try {
					if (pstmt != null) pstmt.close( );
					if (con != null) con.close( );
				}catch (SQLException e) {
					System.out.println("디비 연동 해제 error = [" + e+ " ]");
				}
			}
			return success;	
		}
		
		public int  studentDataCheck(SubjectVO svo) {
			StringBuffer sql = new StringBuffer();
			sql.append("select count(sd_num) from student");
			sql.append(" where s_num = ?");
			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int data = 0;
			try {
				con = getConnection() ;
				pstmt = con.prepareStatement(sql.toString ());
				pstmt.setString(1, svo.getS_num());
				rs = pstmt.executeQuery();
				if(rs.next()) {
					data = rs.getInt(1);
				}
				
			}catch (SQLException se) {
				System.out.println("쿼리 studentDataCheck error = [" + se +"]" );
				se.printStackTrace();
			} catch (Exception e) {
				System.out.println("error = [" + e +"]");
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException se) {
					System.out.println("디비 연동 해제 error = [" + se+ "]");
				}
				
			}
			return data;
		}
		
		
		public boolean subjectDelete(SubjectVO svo) {
			StringBuffer sql = new StringBuffer();
			sql.append("delete from subject where no = ? ");
			
			Connection con = null;
			PreparedStatement pstmt = null;
			boolean success = false;
			
			try {
				con = getConnection () ;
				pstmt = con.prepareStatement(sql.toString ());
				pstmt.setInt(1, svo.getNo());//두번째 ?(바인딩변수)설정값 - 학과명
				
				int i = pstmt.executeUpdate();//쿼리문 실행 - 결과값은 입력된 행의 수 반환
				if(i == 1) {
					success = true;
				}
			}catch (SQLException se) {
				System.out.println("삭제에 문제가 있어 잠시 후에 다시 진행해 주세요");
				se.printStackTrace(); //오류발생시 확인
			}catch (Exception e) {
				System.out.println("error =[" + e.getMessage() + " ]");
			}finally {
				try {
					if (pstmt != null) pstmt.close( );
					if (con != null) con.close( );
				}catch (SQLException e) {
					System.out.println("디비 연동 해제 error = [" + e+ " ]");
				}
			}
			return success;	
		}

		
		
}

		
		
		