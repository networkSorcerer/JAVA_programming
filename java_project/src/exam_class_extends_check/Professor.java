package exam_class_extends_check;

public class Professor extends Person {
	private String subject;
	
	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 호출");
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString () {
		return super.toString()+ ";" + subject;
	}
}
