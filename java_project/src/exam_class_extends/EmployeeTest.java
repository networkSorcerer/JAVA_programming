package exam_class_extends;

public class EmployeeTest {
	public static void main(String [] args) {
		Employee emp = new Employee();
		emp.setEmpData("김철수", "서울시 영등포구 당산 6가", "010-2353-3245", 1500000);
		System.out.println(emp.toString());
		
		Manager mgr = new Manager();
		mgr.setMgrData("홍길동", "서울시 성동구 " , "010-7869-0987", 2000000, "대리", 100000);
		System.out.println(mgr.toString());
	}

}
