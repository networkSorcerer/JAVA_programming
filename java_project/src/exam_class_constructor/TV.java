package exam_class_constructor;

public class TV { 
	private String manufacturer;
	private int year;
	private int size;
	
	
	public TV(String manufacturer, int year, int size) {
		
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	public void show() {
		System.out.print(this.manufacturer + "에서 만든 ");
		System.out.print(this.year + "년형");
		System.out.println(this.size + "인치 TV");
	}

}
