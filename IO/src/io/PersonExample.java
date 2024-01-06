package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PersonExample {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String []args) {
		String file = "person.dat";
				output(file);
				input(file);
	}
	
	private static void output(String file) {
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			System.out.print("이름:");
			String name = scan.nextLine();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			scan.nextInt();
			
			oos.writeObject(new Person(name, age));
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	private static void input(String file) {
		try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream oos = new ObjectInputStream(fis)) {
			while (true) {
				Person p = (Person) oos.readObject();
				System.out.println(p.toString());
			}
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}catch(IOException io) {
			
		}
	}
}
