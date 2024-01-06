package exam_interface;

import java.util.Arrays;

public class StudentSort {
	public static void main(String [] args) {
		int [] numbers = {60, 88, 10, 45, 90};
		Arrays.sort(numbers);
		
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 270);
		students[1] = new Student("이한솔", 290);
		students[2] = new Student("김희진", 210);
		Arrays.sort(students);
		
		for (Student s : students) {
			System.out.println("이름 = " + s.getName() + "총점=" + s.getTotal());
		}
	}

}
