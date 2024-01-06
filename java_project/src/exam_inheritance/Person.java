package exam_inheritance;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	

}
