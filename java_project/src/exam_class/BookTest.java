package exam_class;

public class BookTest {
	public static void main(String [] args) {
		Magazine mgz1 = new Magazine("재미있는 과학잡지 BBC 사이언스", 119, "BBC사이언스", "2016.08.25");
		Magazine mgz2 = new Magazine("엘르 Elle 2022.02월호", 250, "Elle", "2022.01.08");
		
		System.out.println(mgz1.toString());
		System.out.println();
		System.out.println(mgz2.toString());
	}

}
