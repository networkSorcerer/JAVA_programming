
package subject_management;


import java.util.ArrayList;

import academic.MenuViewer;


public class SubjectManagement {
	private SubjectDAO dao = SubjectDAO.getInstance();
	
	public void read(String mode) {
		SubjectVO vo = null;
		if(mode.equals("search")) {
			vo = inputData("search");
			System.out.println("검색 단어 : " + vo.getS_name());
		}
		ArrayList<SubjectVO> svo = dao.getSubjectTotal(vo);
		System.out.println("\n**** subject 테이블 데이터 출력 ****");
		System.out.println("번호\t학과번호\t학과명");
		
		if(svo.size() > 0) {
			for(SubjectVO sub : svo) {
				System.out.print(sub.getNo() + "\t");
				System.out.print(sub.getS_num() + "\t");
				System.out.println(sub.getS_name() + "\t");
			}
			
		} else {
			System.out.println("학과 정보가 존재 하지 않습니다.");
		}
	}
	
	private SubjectVO inputData(String mode) {
		String s_num = null, s_name = null;
				
		//추후 입력시 학과번호를 자동으로 부여하도록 설정
		//SubjectDAO클래스에서 getSubjectNum() 메서드가 정의되면 아래의 입력부분을 주석 해제
		if(mode.equals("input")) {
			System.out.print("학과코드 입력 : " );
			s_num = dao.getSubjectNum();
			System.out.println(s_num);
		}
		//SubjectDAO 클래스에서 getSubjectNum() 메서드가 정의되면 아래의 입력부분을 주석처리
		
		//System.out.print("학과코드 입력 : " );
		//s_num = MenuViewer.keyboard.nextLine();
		
		if(!mode.equals("delete")) {
			System.out.print("학과명 입력 : ");
			s_name = MenuViewer.keyboard.nextLine();
		}
		
		if(mode.equals("delete")) {
				System.out.println("삭제 전 소속된 학생 여부를 확인하고자 학과 번호를 입력해주세요");
				System.out.print("학과코드 입력 : ");
				s_num = MenuViewer.keyboard.nextLine();
		}
				
		SubjectVO sub = new SubjectVO(0, s_num, s_name);
		return sub;
	}
	
	public void create() {
		SubjectVO svo = inputData("input");
		boolean result = dao.subjectInsert(svo);
		if(result) {
			System.out.println("학과 데이터 입력 성공");
		}else {
			System.out.println("학과 데이터 입력 실패");
		}
	}
	
	private int inputDataNo() {
		int no;
		System.out.print("번호 입력 : ");
		no = MenuViewer.keyboard.nextInt();
		return no;
	}
	public void update() {
		SubjectVO svo = inputData("update");
		int no = inputDataNo();
		svo.setNo(no);
		boolean result = dao.subjectUpdate(svo);
		if(result) {
			System.out.println("학과 데이터 수정 성공");
		} else {
			System.out.println("학과 데이터 수정 실패");
		}
	}
	
	public void delete() {
		SubjectVO vo = inputData("delete");
		int data = dao.studentDataCheck(vo);
		
		if(data != 0 ) {
			System.out.println("소속된 학생이 존재함으로 학과 데이터를 삭제할수 없습니다");
		} else {
			//int no = inputDataNo();
			//boolean result = dao.subjectDelete(no);
			
			int no = inputDataNo();
			SubjectVO svo = new SubjectVO();
			svo.setNo(no);
			
			boolean result = dao.subjectDelete(svo);
			if(result) {
				System.out.println("학과 데이터 삭제 성공");
			}else {
				System.out.println("학과 데이터 삭제 실패");
			}
		}
	}
}
