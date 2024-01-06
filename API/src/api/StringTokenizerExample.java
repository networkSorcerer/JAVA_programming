package api;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String []args) {
		String text = "홍길동/이수홍,,박연수-김민희,";
		
		StringTokenizer st = new StringTokenizer(text, "/,-");
		int countTokens = st.countTokens();
		System.out.println("전체 토큰 수 : " + countTokens);
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text, "/,-");
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
