package java_project;

import java.util.Scanner;

public class ScoreArray {
	public static void main (String [] args ) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"};
		int score [] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[과목정보] - 과목명은 대소문자 정확하게 입력해 주세요");
		System.out.println("Java, C++, HTML5, 컴퓨터 구조, 데이터 베이스");
		
		while(true) {
			System.out.print("과목 이름 >>");
			String name = scanner.next();
			if(name.equals("종료")) {
				break;
			}
			
			int i;
			for (i=0; i<score.length; i++) {
				if(course[i].equals(name) ) {
					System.out.println(name + "의 점수는 " + score[i]);
					break;
				}
			}
			if(i==score.length)
				System.out.println("없는 과목입니다");
		}
		System.out.println("프로그램을 종료합니다");
		scanner.close();
	}

}
