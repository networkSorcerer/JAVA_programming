package java_project;

public class Cartest {
	public static void main (String [] args) {
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
