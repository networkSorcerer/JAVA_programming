package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
	public static Scanner input = new Scanner (System.in);
	public static void main (String [] args) {
		Movie mv2 = new Movie();
		inputData(mv2);
		
		Movie mv3 = new Movie();
		inputData(mv3);
		
		System.out.println("영화 정보는 다음과 같다");
		System.out.println("=============================================");
		System.out.println("제목\t평점\t\t감독\t\t개봉일");
		System.out.println("=============================================");
		System.out.println(mv2.toString());
		System.out.println(mv3.toString());
	}
	
	public static void inputData(Movie mv) {
		System.out.print("영화 제목 : " );
		mv.setMovieTitle(input.nextLine());
		
		System.out.print("영화 평점 : " );
		mv.setMovieGrade(input.nextLine());
		
		System.out.print("영화 감독 : " );
		mv.setMovieDirector(input.nextLine());
		
		System.out.print("발표 연도 : " );
		mv.setMovieYear(input.nextLine());
	}

}
