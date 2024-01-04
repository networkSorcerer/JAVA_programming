package generic;

public class TV {
	private int size;
	
	public TV() { }

	public TV(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "[size : " + size + " 인치]";
	}
}
