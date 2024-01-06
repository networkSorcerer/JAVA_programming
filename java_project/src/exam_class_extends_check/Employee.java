package exam_class_extends_check;

public class Employee  extends Person {
	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee 생성자 호출");
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept=dept;
		System.out.println("Employee(name, age, dept) 생성자 호출");
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString () {
		return super.toString() + " ; " + dept;
	}

}
