package io;

//import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String []args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readerCharNo;
		String data;
		char[] cbuf = new char[10];
		System.out.print("문자를 입력해 주시요1:");
		while((readerCharNo=reader.read(cbuf)) != -1) {
			data = new String(cbuf, 0 , readerCharNo -2);
			System.out.println(data);
		}
		
		//BufferedReader br = new BufferedReader(reader);
		//String str;
		//System.out.print("문자를 입력해 주세요2:");
		//while((str=br.readLine()) != null) {
			//System.out.println(str);
		//}
		//br.close();
		reader.close();
	}
 }
