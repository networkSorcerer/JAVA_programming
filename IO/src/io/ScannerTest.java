package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String []args) throws IOException {
		Scanner s = null;
		PrintWriter out = null;
		int sum = 0;
		
		out = new PrintWriter(new FileWriter("input.txt"));
		//out.println("567,123,200");
		out.println("15");
		out.println("9.5");
		out.println("7");
		out.println("Java");
		out.println("3");
		out.flush();
		
		s = new Scanner (new BufferedReader(new FileReader ("input.txt")));
		//s.useDelimiter(",");
		while (s.hasNext()) {
			//System.out.println(s.next());
			if(s.hasNextInt()) {
				sum += s.nextInt();
				
			}else {
				s.next();
			}
		}
		System.out.println("점수의 합 : " + sum);
		if(s != null)
			s.close();
		if(out != null)
			out.close();
		
	}
}
