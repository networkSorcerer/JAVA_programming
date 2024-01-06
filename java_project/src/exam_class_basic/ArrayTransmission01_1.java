package exam_class_basic;

import java.util.Scanner;

public class ArrayTransmission01_1 {
	public static void main (String [] args) {
		final int STUDENTS =5;
		int [] scores = new int [STUDENTS];
		getValues(scores);
		getAverage(scores);
 	}
	
	private static void getValues(int [] array) {
		Scanner scan = new Scanner (System.in);
		for(int i =0; i < array.length; i++) {
			System.out.print("컴퓨터 점수를 입력하시오 :");
			array[i] = scan.nextInt();
		}
		scan.close();
		
	}
	private static void getAverage(int [] array) {
		int total =0;
		for (int i = 0; i < array.length; i ++) {
			total += array[i];
		}
		System.out.println("평군성적은 " + total/ array.length + "입니다");
	}

}
