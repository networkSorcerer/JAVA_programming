package api;

import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for( int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0 ; i < names.length; i ++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동", "서울시 성동구 마장동 ", 50);
		Member m2 = new Member("김철수", "서울시 마포구 대흥동 ", 35);
		Member m3 = new Member("홍길동", "서울시 강남구 삼성동 ", 20);
		Member [] members = {m1, m2, m3 };
		
		Arrays.sort(members);
		
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "] : " + members[i].toString());
		}
		
	}
}
