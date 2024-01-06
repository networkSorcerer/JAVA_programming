package exam_interface;
import java.util.Arrays;
@SuppressWarnings("rawtypes")
class Student implements Comparable {
	private String name;
	private int total;
	public Student(String name, int total) {
		super();
		this.name = name;
		this.total = total;
	}
	public String getName() {
		return name;
	}
	
	public int getTotal() {
		return total;
	}
	@Override
	public String toString () {
		return "이름=" + name + "총점 =" + total;
	}
	//Comparalbe의 추상 메소드 구현
	
	public int compareTo(Object obj) {
		Student student = (Student) obj;
		
		if (this.total < student.total)
			return -1;
		else if (this.total > student.total)
			return 1;
		else
			return 0;
	}

}
