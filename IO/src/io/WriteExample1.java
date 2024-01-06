package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample1 {
	public static void main(String [] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
			//참조변수 = new 서브클래스 생성자();
			//getBytes() 메서드는 문자열을 바이트 배열로 변환하여 반환하는 메서드
			byte[] data = "Java".getBytes();
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			
			//byte[]data = "Hello! Java".getBytes();
			//os.write(data);//write(바이트 배열)
			//byte[] data = "helloWorld! Java".getByte();
			//write 배열의 값 중에서 첫번째 인덱스 부터 2개의 길이만큼만 저장
			//os.write(data,1,2);
			
			//byte[] data = "God doesn't require us to succeed.\n he only requires that you try.".getBytes();
			
			System.out.println("파일이 생성되었습니다");
		} catch (FileNotFoundException fnf) {
			System.out.println("저장할 폴더가 생성되어 있지 않습니다.");
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(os != null) {//인스턴스 정상 생성 ->null이 아닌 주솟값 가짐
					os.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
