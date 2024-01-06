package api;

public class BoxingUnBoxingExample {
	public static void main(String[]args) {
		Integer obj1 = Integer.valueOf(300);
		
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		Double obj4 = Double.valueOf(3.8);
		double value4 = obj4.doubleValue();
		System.out.println(value4);
	}
}
