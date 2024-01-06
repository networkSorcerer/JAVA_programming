package exam_class_basic;

public class EmployeeTest {
	public static void main(String [] args) {
		Employee emp = new Employee();
		
		emp.employeeData("홍길동", "010-2345-3476", 1000000);
		System.out.println(emp.toString());
		
		Employee emp02 = new Employee();
		
		emp02.employeeData("김철수", "010-3423-5242", 7000000);
		System.out.println(emp02.toString());
	}

}
