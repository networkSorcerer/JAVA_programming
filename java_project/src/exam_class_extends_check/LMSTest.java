package exam_class_extends_check;

public class LMSTest {
	public static void main(String [] args) {
		Employee e = new Employee("홍길동", 30, "입학처");
		Professor p = new Professor("김철수", 50, "자바");
		Student s = new Student("김희수", 20, "컴퓨터과학");
		
		System.out.println("Employee 정보 : " + e.toString());
		System.out.println("Professor 정보 : " + p.toString());
		System.out.println("Student 정보 : " + s.toString());
	}

}
