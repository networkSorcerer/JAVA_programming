package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutpuStreamExample {
	public static void main(String []args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:/Temp/intest.txt");
			fos = new FileOutputStream("C:/Temp/outtest.txt");
			int data = -1;
			
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일 복사가 완료되었습니다");
		}catch(FileNotFoundException fnf) {
			System.out.println("파일이 존재하지 않거나 경로가 맞지않아 더 이상 작업을 진행할수 없습니다");
		}catch(IOException io) {
			System.out.println("파일입출력에 문제가 발생하여 더이상의 작업을 진행할수 없습니다");
		}catch(Exception e) {
			System.out.println("오류 발생으로 더 이상의 작업을 진행할수없습니다");
		}finally {
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
