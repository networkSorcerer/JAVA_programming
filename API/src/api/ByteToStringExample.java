package api;

import java.util.Arrays;

public class ByteToStringExample {
	public static void main(String []args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1.toString());
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		byte[] byteArray = str2.getBytes();
		System.out.println(Arrays.toString(byteArray));
		
		char[] value = {'H','e','l','l','o'};
		String str = new String(value);
		System.out.println("배열을 이용한 문자열 객체 생성 : " + str);
	}
}
