package exam_abstract_class;
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override 
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class MethodOverridingExample {
	public static void paint (Shape p) {
		p.draw();
	}
	public static void main(String [] args) {
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
