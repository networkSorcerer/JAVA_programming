package exam_mutator_accessor;

public class ArrayTransmission {
	public static void main(String [] args) {
		int [] array;
		array = getData();
		printData(array);
	}
	
	private static int [] getData() {
		int [] testData = new int [] {10, 20, 30, 40, 50};
		return testData;
	}
	
	private static void printData(int [] array) {
		for ( int i =0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
