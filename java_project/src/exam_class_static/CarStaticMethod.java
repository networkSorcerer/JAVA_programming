package exam_class_static;

public class CarStaticMethod {
	private int speed;
	private int gear;
	private String color;
	
	private static int numberOfCars =0;
	
	public CarStaticMethod(int speed, int gear, String color) {
		this.speed = speed;
		this.gear =gear;
		this.color = color;
		++numberOfCars;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public String toString() {
		return "자동차 정보 [속도: " + speed + "기어 : " + gear +"색상 : " + color+"]";
	}

}
