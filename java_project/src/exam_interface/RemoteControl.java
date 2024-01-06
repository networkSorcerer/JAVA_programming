package exam_interface;

public interface RemoteControl {
	public static final int MAX_VOLUME = 32;
		int MIN_VOLUME = 0;
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume);

}
