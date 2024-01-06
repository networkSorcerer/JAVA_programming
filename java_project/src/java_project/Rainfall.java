package java_project;

public class Rainfall {
	public static void main(String [] args) {
		final int YEARS = 3; //3년
		final int QUARTERS = 5; // 4분기 + 총합
		
		//기상청 데이터를 활용하여 2차원 배열 초기화
		double[][] rain = new double[][] {
			{368.1, 586.54, 351.2, 66.5, 0},
			{173.9, 493, 448.4, 168.1, 0},
			{172.8, 1012.4, 259.4, 46.7, 0}
		};
		
		for (int y = 0; y < YEARS; y++) {
			for (int q=0; q < QUARTERS-1; q++) {
				rain[y][QUARTERS-1] += rain[y][q];
				//rain[y][QUARTERS-1] = rain[y][QUATERS-1] + rain[y][q];
				//rain[행][열 마지막 인덱스] = rain[행][열 마지막 인덱스] + 분기별 강수량;
				//rain[행][4] = rain[행][4] + 분기별 강수량;
			}
		}
		String[] year = {"2018", "2019", "2020"};
		//System.out.println("년도\t1분기\t2분기\t3분기\t4분기\t총합");
		
		String[] subject = {"년도", "1분기", "2분기", "3분기", "4분기", "총합"};
		for(String sub : subject) {
			System.out.printf("%s\t", sub);
		}
		
		System.out.println("\n------------------------------------------");
		for(int y =0; y<YEARS; y++) {
			System.out.print(year[y] + "년도\t");
			for(int q=0; q < QUARTERS; q++) {
				System.out.printf("%.1f\t",rain[y][q]);
			}
			System.out.println();
		}
		
	}

}
