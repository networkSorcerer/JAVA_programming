package io;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String []args) throws Exception {
		Reader reader = new FileReader("test.txt");
		
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			//System.out.print(readData + "-");
			System.out.println((char)readData);
		}
		
		//Reader reader = new FileReader("text.txt");
		//int read(char[] ch)메서드
		//int readcharNo;
		//char[] cbuf = new char[2];
		//String data = "";
		//while(true) {
			//readCharNo = reader.read(cbuf);
			//if(readCharNo == -1) break;
			//data += new String(cbuf, 0, readCharNo);
		//}
		//System.out.println(data);
		
		//문자를 읽어 오고자 할때 BufferedReader 의 readLine() 메서드를 이용
		//BufferedReader reader = new BufferedReader (new FileReader("test.txt"));
		//String str = null;
		//while ((str = reader.readLine())!=null) {
		//System.out.println(str);
		//}
		reader.close();
	}
}
