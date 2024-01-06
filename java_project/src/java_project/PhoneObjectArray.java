package java_project;

class Phone {
	private String name;
	private String comp;
	
	public Phone() {
		
	}
	
	public Phone (String name, String comp) {
		this.name = name;
		this.comp = comp;
	}
	
	public void printData() {
		System.out.printf("핸드폰명 : %10s\t제조사명 : %s\n", name, comp);
	}
}

public class PhoneObjectArray {
	public static void main (String [] args) {
		Phone p1, p2, p3;
		p1 = new Phone ("아이폰 12" , "애플");
		p2 = new Phone ("갤럭시 S21" , "삼성");
		p3 = new Phone ("갤럭시 노트 20" , "삼성");
		
		p1.printData();
		p2.printData();
		p3.printData();
		System.out.println();
		
		Phone[] p = new Phone[3];
		
		p[0] = new Phone("아이폰12" , "애플");
		p[1] = new Phone("갤럭시 S21" , "삼성");
		p[2] = new Phone("갤럭시 노트 20" , "삼성");
		
		for (int i =0 ; i < p.length; i ++) {
			p[i].printData();
		}
		System.out.println();
		
		for (Phone ph : p) {
			ph.printData();
		}
		System.out.println();
		
		Phone[] ph = new Phone[] {
				new Phone ("아이폰 12" , "애플"),
				new Phone ("갤럭시 S21" , "삼성"),
				new Phone ("갤럭시 노트 20" , "삼성")
		};
		
		for( int i = 0; i < ph.length; i++) {
			ph[i].printData();
		}
	}

}
