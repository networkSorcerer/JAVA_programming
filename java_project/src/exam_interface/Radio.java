package exam_interface;

public class Radio implements RemoteControl {
	private int volume;
	private String standard;
	private double radioFrequency;
	
	public Radio(String standard, double radioFrequency) {
	this.standard = standard;
	this.radioFrequency = radioFrequency;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Radio 켜기");
	}
	@Override
	public void turnOff() {
		System.out.println("Radio 끄기");
	}
	
	@Override 
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}
	
	public void printRF() {
		System.out.println("현재 주파수 선택은 " + standard + " " + radioFrequency + "MHz(KHz) 입니다");
	}
	public String toString () {
		return "현재 Radio 볼륨 : " + volume;
	}
}

