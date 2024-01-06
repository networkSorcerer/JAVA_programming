package academic;

import subject_management.SubjectManagement;
public class AcademicManagement {

		public static void main(String [] args) {
			SubjectManagement subject = new SubjectManagement();
			int topMenuchoice, subMenuchoice;
			
			System.out.println("학사 관리 프로그램을 시작합니다");
			
			while(true) {
				MenuViewer.showTopMenu();
				topMenuchoice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(topMenuchoice < 1 || topMenuchoice > 3) {
					System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
					continue;
				}
				
				if(topMenuchoice == 3) {
					System.out.println("프로그램을 종료합니다");
					return;
				}
				
				MenuViewer.showSubMenu();
				subMenuchoice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(topMenuchoice == 1) {
					switch(subMenuchoice) {
					case 1:
						//System.out.println("조회");
						subject.read("select");
						break;
					case 2:
						//System.out.println("입력");
						subject.create();
						break;
					case 3:
						//System.out.println("수정");
						subject.update();
						break;
					case 4:
						//System.out.println("삭제");
						subject.delete();
						break;
					case 5:
						//System.out.println("검색(학과명)");
						subject.read("search");
						break;
					default:
						System.out.println("검색, 입력, 수정, 삭제, 검색 중에 하나를 선책해 주면 됩니다");
					}
				} else if (topMenuchoice == 2) {
					System.out.println("아직 준비중에 있습니다");
				}
			}
		}
	}
