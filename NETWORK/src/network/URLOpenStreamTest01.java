package network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOpenStreamTest01 {
	public static void main(String []args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			URL url = new URL("http:/www.hanbit.co.kr/");
			//url.openStream()의 반환형 - InputStreamReader(url.openStream()));
			
			out = new PrintWriter(new FileWriter("index.html"));
			String inLine;
			while((inLine = in.readLine()) != null) {
				//System.out.println(inLine);
				out.println(inLine);
			}
			System.out.println("파일 복사 완료되었습니다");
		}catch(MalformedURLException e) {
			System.out.println("URL ERROR");
		}catch (IOException i) {
			System.out.println("IO ERROR");
		}finally {
			try {
				if(in != null)
					in.close();
			}catch(Exception e) {
				System.out.println("CLOSE ERROR");
			}
		}
	}
}
