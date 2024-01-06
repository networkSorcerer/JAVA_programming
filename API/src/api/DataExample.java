package api;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataExample {
	public static void main(String [] args) throws ParseException {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(sdf.format(today.getTime()));
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse("2022-02-23");
		System.out.println(sd.format(date));
		
		String data = String.valueOf(10);
		System.out.println("기초형의 값을 문자열로 변환 : " + data);
		
		int number = Integer.parseInt(data);
		System.out.println("문자열을 기초형으로 변환 : " + number);
	}
}
