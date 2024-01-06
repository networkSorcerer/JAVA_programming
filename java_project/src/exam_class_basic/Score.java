package exam_class_basic;

public class Score { 
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	
	public void scoreData(String n, int k, int e, int m) {
		name =n;
		kor = k;
		eng = e;
		mat = m;
	}
	
	public void getTotal() {
		tot = kor + eng + mat;
	}
	
	public double getAverage() {
		return (double)tot/3;
	}
	
	public char getGrade() {
		char hakjum = '\0';
		double avg = getAverage();
		
		if (avg>=90) {
			hakjum ='A';
		} else if (avg>=80) {
			hakjum = 'B';
		} else if (avg>=70) {
			hakjum = 'C';
		} else if (avg>=60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
		return hakjum;
	}
	
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c", name, kor, eng, mat, tot, getAverage(), getGrade());
	}

}
