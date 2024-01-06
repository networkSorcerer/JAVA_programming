package api;

public class AudoBoxingUnBoxingExample {
	public static void main(String[] args) {
		Integer obj = 100;
		
		System.out.println("value : " + obj.intValue());
		
		int value = obj;
		
		System.out.println("value : " + value);
		
		int result = obj + 100;
		
		System.out.println("result : " + result);
		
		Double dValue = 5.7;
		
		System.out.println(dValue + 6.7);
		
		int n = Integer.parseInt("10");
		System.out.println("n : " + n);
		
		String m = String.valueOf(9);
		System.out.println("m : " + m);
		
		double d = Double.parseDouble("8.9");
		System.out.println("d : " + d);
		
		String d1 = String.valueOf(4.8);
		System.out.println("d1 : " +d1);
		
		Integer obj1 = Integer.valueOf("4");
		System.out.println(obj1);
	}
}
