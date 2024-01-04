package exam_try_catch_finally;

class RuntimeExceptionCase {
	public static void main(String []args) {
		//RuntimeException 종류 - 비체크 예외
		//ArrayIndexOutOfBoundsException 예외 발생
		//배열을 참조하는 인덱스가 잘못된 경우 발생한다
		try {
			int[]arr = new int [3];
			arr[4] = 20;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//ClassCastException 예외 발생
		//적절치 못한 클래스로 형변환하는 경우에 발생한다
		try {
			Object x = Integer.valueOf(0);
			//부모 클래스명 참조 변수 = new 서브클래스 생성자();
			System.out.println((String)x);
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		
		
		//NegaticeArraySizeException 예외 발생
		//배열의 크기가 음수값인 경우 발생한다
		try {
			int[]arr = new int[-10];
			System.out.println(arr.toString());
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		//NullPointerException 예외 발생
		//null 객체를 참조할 때 발생한다
		try {
			String str = null;
			@SuppressWarnings("null")
			int len = str.length();
			System.out.println(len);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		//NumberFormatException 예외 발생
		
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 +"+" + data2 +"=" +result);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
