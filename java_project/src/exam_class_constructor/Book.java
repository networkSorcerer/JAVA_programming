package exam_class_constructor;

public class Book {
	String title;
	String author;
	
	public Book() {
		this("", "");
	}
	public Book(String title) {
		this(title, "작자미상");
		System.out.println("매개변수가 하나인 생성자\n");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.print("매개변수가 두개인 생성자\n");
	}
	
	public String toString () {
		return "책 제목 : " + title + "책저자 : " + author;
	}

}
