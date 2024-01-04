package generic;

class GenericMethod {
	//제네릭 메서드 선언
	//접근제어자 제어자 <타입 매개변수> 반환형 메서드명 (자료형 변수) { }
	//접근제어자 제어자 <타입 매개변수> 타입 매개변수 메서드명 (타입 매개변수 변수) { }
	public static <T> T getLast(T[] arr) {
		return arr[arr.length -1];
	}
}

public class GenericMethodExample {
	public static void main(String []args) {
		String [] language = {"C++","C#","JAVA" };
		String last = GenericMethod.<String>getLast(language);
		System.out.println("language 배열의 마지막 원소 : " + last);
		
		last = GenericMethod.getLast(language);
		System.out.println("language 배열의 마지막 원소 : " + last);
		
		Integer[] number = {70, 67, 88, 90};
		//int lastNum = GenericMethod.<Integer>getLast(number);
		int lastNum = GenericMethod.getLast(number);
		System.out.println("number 배열의 마지막 원소 : " + lastNum);
	}
}
