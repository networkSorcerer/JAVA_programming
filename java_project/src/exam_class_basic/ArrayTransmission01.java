package exam_class_basic;

import java.util.Scanner;

public class ArrayTransmission01 {
	public static void main(String []args) {
		final int STUDENTS = 5;
		int[] scores = new int[STUDENTS];
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < scores.length; i ++ ) {
			System.out.print("컴퓨터 점수를 입력하세요 : ");
			scores[i] = scan.nextInt();
		}
		scan.close();
		
		int total = 0; 
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		
		System.out.println("평균성적은 " + total / scores.length + "입니다");
		
	}

}
