package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttURLConnectionTest {
	public static void main(String []args) throws Exception{
		String site = "https://www.naver.com";
		//URL클래스의 openConnection()을 호출하게 되면, 
		//URL클래스가 사용하는 프로토콜에 따라 URLConnection을 상속한 알맞은 하위 클래스의 인스턴스를 얻게된다
		//예를 들어 , http 프로토콜을 사용할 경우 openConnection()
		//메소드는 java.net.HttpURLConnetion 클래스의 인스턴스를 리턴하게 된다
		
		URL url = new URL(site);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		System.out.print("문서의 타입 : " + conn.getContentType());
		
		int resCode = conn.getResponseCode();
		System.out.println("응답코드 : " + resCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer output = new StringBuffer();
		
		while((inputLine = in.readLine()) != null ){
			output.append(inputLine);
			output.append("\n");
		}
		in.close();
		
		System.out.println("\n--------------문서 내용 -----------------------");
		System.out.println(output);
	}
}
