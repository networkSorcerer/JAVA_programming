package exam_mutator_accessor;

public class CarMutatorAccessor {
	
	private int speed;
	private int gear;
	private String color;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int s) {
		if(s > 0) 
			speed = s;
		else 
			speed =0;
	}
	
	public void setGear(int gear) {
		gear=0;
	}
		
	
	public int getGear() {
		return gear;
	}
	
	public void setColor(String c) {
		color =c;
	}
	
	public String getColor () {
		return color;
	}
	
	public void carData(int s, int g, String c) {
		speed = s;
		gear = g;
		color = c;
	}
	
	public void speedUp(int s) {
		speed += s;
	}
	
	public void speedDown(int s) {
		speed -= s;
	}
	
	public String toString () {
		return "자동차 상태 정보 [ 속도 : " +speed + "기어 : " + gear + "색상 :" + color + "]";
	}

}
