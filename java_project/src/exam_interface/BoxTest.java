package exam_interface;
class Box {
	private double volume;

	public Box(double volume) {
		this.volume = volume;
	}
	public double getVolume() {
		return volume;
	}
}

public class BoxTest {
	public static void main(String [] args) {
		Box b1 = new Box (100.4);
		Box b2 = new Box (85.0);
		
		if(b1.getVolume() > b2.getVolume()) {
			System.out.println("b1이 b2보다 더 크다");
		} else {
			System.out.println("b1가 b2와 같거나 작다");
		}
	}
}
