package exam_class_basic;

public class Employee {
	public String name;
	public String phoneNumber;
	public int salary;
	
	public void employeeData(String eName, String pNumber, int sal) {
		name = eName;
		phoneNumber = pNumber;
		salary = sal;
	}
	public String toString () {
		return String.format("직원정보 [ 사원명 :%s, 전화번호 = %s, 급여 = %d]", name, phoneNumber, salary);
	}
}
