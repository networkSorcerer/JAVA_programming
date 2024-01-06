package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//조건
//클래스 : Account
//필드 : accountNo (계좌번호) , ownerName(예금주), balance(잔액)
//
//파일명은 account.dat
//
//직렬화하여 저장되어야 하는 데이터는 123-4535-33478 홍길동 100000
//역직렬화하여 화면에 보여지는 형태는
//계좌번호 : 123-4535-33478
//예금주명 : 홍길동
//잔액 : 100000
//으로 보여질수 있도록 코딩해주세요

public class AccountExample {
	public static void main(String [] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("account.dat"));
			out.writeObject(new Account("123-4535-33478", "홍길동", 100000));
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("account.dat"));
			Account ea = (Account)in.readObject();
			
			System.out.println(ea.toString());
		}catch(ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}catch (IOException i) {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(in != null)
					in.close();
				if(out != null)
					out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
