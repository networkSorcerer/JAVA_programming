package exam_class_basic;

public class Address {
	public String name;
	public String address;
	public String phone;
	
	public void addressData(String n, String addr, String p) {
		name = n;
		address = addr;
		phone = p;
	}
	
	public void printData() {
		System.out.printf("%s %-20s %s\n", name, address, phone);
	}
	
	public String toString() {
		return String.format("%s %-20s %s\n", name, address, phone);
	}

}
