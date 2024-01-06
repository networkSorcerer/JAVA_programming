package api;

public class Member implements Comparable<Member> {
	private String name;
	private String address;
	private int age;
	

	public Member (String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public int compareTo(Member o) {
		if(this.age > o.age)
			return 1;
		else if(this.age < o.age)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return String.format("name=%s address=%s age=%d\n", name, address, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}