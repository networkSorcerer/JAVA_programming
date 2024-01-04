package exam_try_catch_finally;

public class DivideByZeroTest2 {
	public static void main(String []args) {
		int x =1;
		int y =0;
		try {
			int result = x/y;//예외발생!
			System.out.println("result : " + result);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다");
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("포로그램 진행");
	}
}
