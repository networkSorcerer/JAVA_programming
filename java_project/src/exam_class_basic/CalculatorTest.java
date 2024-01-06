package exam_class_basic;

public class CalculatorTest {
	public static void main (String [] args) {
		Calculator myCalc = new Calculator();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("두 수의 합 : " + result1);
		
		int x =10;
		int y =4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("두 수의 나눗셈 : " + result2);
		
		int result3 = myCalc.minus(9, 3);
		System.out.println("두수의 차 : " + result3);
		
		int result4 = myCalc.multiply(2, 7);
		System.out.println("두 수의 곱 : " + result4);
		System.out.println();
		
		int[] num1 = {10, 20, 40, 50 };
		int result5 = myCalc.plus(num1);
		System.out.println("배열값의 합 : " + result5);
		
		int [] num2 = new int[] { 60, 70, 80, 90};
		int result6 = myCalc.plus(num2);
		System.out.println("배열값의 합 : " + result6);
		
		// 배열선언 없이 바로 공간 할당받아 시작주소를 전달
		int result7 = myCalc.plus(new int [] { 1,2,3,4,5});
		System.out.println("배열의 값의 합 : " + result7);
		System.out.println();
		
		int result8 = myCalc.sum(1,2,3);
		System.out.println("가변 길이 값들의 합 : " + result8);
		
		int result9 = myCalc.sum(1,2,3,4,5);
		System.out.println("가변 길이 값들의 합 : " + result9);
		
		int result10 = myCalc.sum(new int[] {1,2,3,4,5});
		System.out.println("가변길이 값들의 합 : " + result10);
		}
 	}


