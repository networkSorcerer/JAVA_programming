package java_project;

public class Car {
	public int speed;
	public int gear;
	public String color;
	
	public void carData(int s, int g, String c) {
		speed = s;
		gear = g;
		color =c;
		
	}
	
	public void speedUp(int s) {
		speed +=s;
	}
	
	public void speedDown (int s) {
		speed -= s;
	}
	
	public void pringtData() {
		System.out.println("속도 : " + speed + "기어 : " + gear + "색상 : " + color);
	}
	
	public String toString() {
		return "속도 : " + speed + "기어 : " + gear + "색상 : " + color;
	}
}


