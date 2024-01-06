package exam_class_basic;

import java_project.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car myCar = new Car();
		
		myCar.carData(0,1,"red");
		
		myCar.speedUp(20);
		
		System.out.println(myCar.toString ());
		System.out.println();
		
		Car yourCar = new Car();
		
		yourCar.carData(30, 3, "blue");
		
		yourCar.speedDown(10);
		System.out.println(yourCar.toString());
		
	}
	

}
