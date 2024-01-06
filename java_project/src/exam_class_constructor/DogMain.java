package exam_class_constructor;

public class DogMain {
	public static void main (String [] args) {
		Dog [] dog = {
				new Dog("이쁜이", "요크셔테리어", 1),
				new Dog("잠잠이", "포메리안", 3)
		};
		
		for (Dog d : dog) {
			System.out.println(d.toString());
		}
	}

}
