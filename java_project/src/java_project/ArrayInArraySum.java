package java_project;

public class ArrayInArraySum {
	public static void main (String []args) {
		int array[][] = new int [][] {
			{10, 10, 10, 10, 0},
			{30, 30, 30, 30, 0},
			{40, 40, 40, 40, 0},
			{50, 50, 50, 50, 0},
			{0, 0, 0, 0, 0}
		};
		
		System.out.println("=======실행 전 ========");
		for (int i =0; i < array.length; i ++) {
			for (int j =0; j < array[i].length; j++) {
				System.out.printf("%-5d", array[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length - 1; i ++) {
			for (int j = 0; j < array[i].length-1; j++) {
				array[i][4] += array[i][j];
				array[4][j] += array[i][j];
				if (i ==j)
					array[4][4] += array[i][j];
			}
		}
		
		System.out.println("======== 계산 후 ========");
		
		for (int i = 0; i < array.length; i ++) {
			for ( int j = 0; j < array[i].length; j ++) {
				System.out.printf("%-5d", array[i][j]);
			}
			System.out.println();
		}
	}
}
