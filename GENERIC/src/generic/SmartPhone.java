package generic;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone() {
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString () {
		return "[" +company +"," +os + "]";
	}
}
