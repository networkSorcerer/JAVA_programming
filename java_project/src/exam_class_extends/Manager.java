package exam_class_extends;

public class Manager extends Employee{
	private int bonus;
	private String job;
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgrData(String name, String address, String phoneNumber, int salary,String job,int bonus) {
		setEmpData(name, address, phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	public String toString() {
		String data = ", job = " + job + ", bonus = " + bonus;
		return super.toString() + data;
	}

}
