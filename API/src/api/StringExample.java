package api;

public class StringExample {
	public static void main(String []args) {
		String a = new String ("c#");
		String b = new String (",c++");
		
		System.out.println(a+"의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("c#", "Java");
		System.out.println(a);
		System.out.println();
		
		String s[] = a.split(",");
		for(int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		a = a.substring(5);
		
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
		
		String subject = "JAVA 프로그래밍";
		System.out.println(subject.indexOf("JAVA"));
		
		if(subject.indexOf("JAVA") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		String country = "한국, 일본, 증국, 미국, 독일, 프랑스";
		
		String[] list = country.split(",");
		
		String[] list2 = country.split(",",3);
		
		for (String item  : list) {
			System.out.println(item);
		}
		System.out.println("===========================");
		for (String item : list2) {
			System.out.println(item);
			
		}
		System.out.println("===========================");
		
		String email = "purum@rubypaper.co.kr";
		
		//split()메서드를 사용하지 않고 출력되도록 코드 작성해주세요 id와 company정의
		

        // "@"를 기준으로 id와 company 추출
        int atIndex = email.indexOf("@");
        String id = email.substring(0, atIndex);
        String company = email.substring(atIndex + 1, email.indexOf("."));

        // 결과 출력
        System.out.println("ID: " + id);
        System.out.println("Company: " + company);
		
		System.out.println(id);
		System.out.println(company);
		
		//숫자 -> 문자열. 문자열 -> 숫자 10 -> "10"."10"->10
		int number = 10;
		String value = String.valueOf(number);
		System.out.println(value);
		
	}
}
