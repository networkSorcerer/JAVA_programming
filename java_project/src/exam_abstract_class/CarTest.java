package exam_abstract_class;

public class CarTest {
	public static void main (String [] args) {
		System.out.println("===자율 주행하는 자동차===");
		AICar myCar = new AICar();
		myCar.run();
		
		System.out.println("===사람이 운전하는 자동차 ===");
		ManualCar hisCar = new ManualCar();
		hisCar.run();
	}

}
