package java_project;

import java.util.Scanner;

public class StudentArrayExample {
	public static void main( String [] args) {
		final int STUDENTS = 3;
		final int SUBJECTS = 3;
		
		int [][] scores = new int [STUDENTS][SUBJECTS];
		String[] subjectName = {"국어" , "영어" , "수학"};
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < SUBJECTS; i++) {
			for ( int j =0; j < SUBJECTS; j++) {
				System.out.println((i+1)+ "번째 학생의 " + subjectName[j] + "성적을 입력하시오:");
				scores[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		System.out.println("\n===========3명의 학생 데이터 출력 ============");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------");
		for(int i =0; i <STUDENTS; i ++) {
			total =0;
			
			for (int j =0; j < SUBJECTS; j ++) {
				total += scores[i][j];
				System.out.printf("%3d\t", scores[i][j]);
			}
			System.out.printf("%3d\t%.1f\n", total, (double)total/SUBJECTS);
		}
	}

}
