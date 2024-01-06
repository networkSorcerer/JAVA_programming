package exam_class_basic;

public class CarMutatorAccessor {
	
	private int speed;
	private int gear;
	private String color;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed >0)
			this.speed =speed;
		else
			speed =0;
			
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
	
	public void carData(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	
	public void speedUp(int s) {
		speed += s;
		
	}
	
	public void speedDown(int s) {
		speed -=s;
	}
	
	public String toString () {
		return "자동차 상태 정보 [속도 : " + speed + " 기어 : "+ gear + "색상 : " + color + "]";
	}

}
