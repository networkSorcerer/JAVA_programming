package api;

import java.util.StringTokenizer;

public class StringSplitExample {
	public static void main(String [] args) {
		String text = "자바&오라클,, 리눅스,HTML-JAVASCRIPT-JQUERY";
		String [] names = text.split(",");
		
		System.out.println("배열의 수 : " + names.length);
		
		for(String name : names) {
			System.out.println(names);
		}
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(text, ",");
		
		int countTokens = st.countTokens();
		System.out.println("전체 토큰 수 : " + countTokens);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
