package exam_class_constructor;

public class CarConstructor {
	private int speed;
	private int gear;
	private String color;
	
	public CarConstructor() {
		//speed =0;
		//gear = 1;
		//color = "red"; 
		this(0 , 1 , "red");
	}
	
	public CarConstructor (int speed, int gear, String color ) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return "자동차 정보 [ 속도 = " + speed + ", 기어 =" + gear + ", 색상 = " + color + "]";
	}

}
