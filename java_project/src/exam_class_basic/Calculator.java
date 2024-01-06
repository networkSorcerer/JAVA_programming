package exam_class_basic;

public class Calculator {
	public int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	public int minus(int x, int y) {
		int result = x-y;
		return result;
	}
	
	public int multiply(int x, int y) {
		int result = x*y;
		return result;
	}
	
	public double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
		
	}
	
	public int plus(int x, int y, int z) {
		int result = x+y+z;
		return result;
	}
	
	public int plus(int x, int y, int a, int b) {
		int result = x+ y+ a+ b;
		return result;
	}
	
	public int plus (int x, int y, int a, int b, int c) {
		int result = x+ y+ a+ b+ c ;
		return result;
	}
	
	public int plus(int [] numbers) {
		int sum =0;
		for ( int i =0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public int sum (int ... values) {
		int total = 0; 
		for (int i =0; i< values.length; i ++ ) {
			total += values[i];
		}
		return total;
	}

}
