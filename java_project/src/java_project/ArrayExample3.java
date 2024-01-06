package java_project;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		int su = 0;
		do {
			System.out.print("숫자 두 개를 입력해주세요 :");
			array[su] = input.nextInt();
			if (array[su]<1 || array[su]>9  ) {
				continue;
			}
			su++;
		}while (su <2);
	
	
	for (int i = 2; i<array.length; i++) {
		array[i] = (array[i-2]*array[i-1])%10;
	}
	System.out.print("[");
	for (int i = 0; i< array.length; i++) {
		System.out.println(array[i]);
		if (i < array.length-1) {
			System.out.println(",");
		}
	}
	System.out.println("]");
	input.close();
	}
}
