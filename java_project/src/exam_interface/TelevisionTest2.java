package exam_interface;

public class TelevisionTest2 {
	public static void main (String [] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.turnOff();
		System.out.println();
		
		Radio radio = new Radio ("표준 FM (MHZ)", 95.9);
		radio.turnOn();
		radio.setVolume(10);
		radio.printRF();
		System.out.println(radio.toString());
		radio.turnOff();
		System.out.println();
		
		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("http://www.naver.com(네이버)");
		smart.turnOff();
	}

}
