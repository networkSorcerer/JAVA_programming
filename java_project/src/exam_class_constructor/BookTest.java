package exam_class_constructor;

public class BookTest {
	public static void main (String [] args) {
		Book littlePrince = new Book ("어린 왕자" , "생택쥐페리");
		System.out.println(littlePrince.title + "" + littlePrince.author);
		System.out.println(littlePrince.toString());
		System.out.println();
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title + "" + loveStory.author);
		System.out.println(loveStory.toString());
	}

}
