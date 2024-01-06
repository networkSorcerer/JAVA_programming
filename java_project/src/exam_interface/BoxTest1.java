package exam_interface;
	//자바에서는 객체의 크기를 비교하는데 사용되는 java.lang.Comparalbe 인터페이스를 제공해 준다
	//public interface Comparable {
	//이 객체가 다른 객체보다 크면 1, 같으면 0, 작으면 -1을 반환 한다
	//int compareTo(Object other);

@SuppressWarnings("rawtypes")
class Box implements Comparable {
	private double volume;

	public Box(double volume) {
		super();
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}
	
	@Override
	public int compareTo(Object obj) {
		Box other = (Box) obj;
		if (this.volume < other.volume)
			return -1;
		else if (this.volume > other.volume)
			return 1;
		else 
			return 0;
	}
}
public class BoxTest1 {
	public static void main (String [] args) {
		Box b1 = new  Box(100.4);
		Box b2 = new Box(85.0);
		
		// compareTo 메서드에 비교할 대상을 명시하고 비교
		if (b1.compareTo(b2) > 0)
			System.out.println("b1이 b2보다 더 크다");
		else 
			System.out.println("b1가 b2보다 같거나 작다");
	}
}

