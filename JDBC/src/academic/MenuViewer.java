package academic;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);
			public static void showTopMenu() {
				System.out.println("\n선택하세요...");
				System.out.println("1. 학과 관리");
				System.out.println("2. 학생 관리");
				System.out.println("3. 프로그램 종료");
				System.out.println("선택 >>");
			}
			
			public static void showSubMenu() {
				System.out.println("1. 데이터 조회");
				System.out.println("2. 데이터 입력");
				System.out.println("3. 데이터 수정");
				System.out.println("4. 데이터 삭제");
				System.out.println("5. 데이터 검색 (학과명)");
				System.out.println("선택 >> ");
			}

}
