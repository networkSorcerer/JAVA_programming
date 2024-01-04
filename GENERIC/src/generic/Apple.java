package generic;

public class Apple {
	private String color;
	//디폴트 생성자
	public Apple() { }
	
	public Apple(String color) {
		this.color=color;
	}
	//접근자
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() { //Object toString () 메서드를 오버라이딩
		return "Apple [color : " + color + "]";
	}
}
