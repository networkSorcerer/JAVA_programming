package exam_abstract_class;
abstract class Shape {
	int x,y;
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public abstract void draw();
}

class Rectangle extends Shape {
	int width, height;
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape {
	int radius;
	public void draw() {
	System.out.println("원 그리기 메소드");
	}
}
public class AbstractShapeTest {
	public static void main(String [] args) {
		Rectangle r = new Rectangle();
		r.draw();
		
		Circle c = new Circle();
		c.draw();
	}

}
