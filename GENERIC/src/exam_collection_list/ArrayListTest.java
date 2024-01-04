package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String []args) {
		//프로그래밍 언어 (문자열)을 저장하도록 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		list.add(1,"ORACLE");//java oracle java jsp spring
		list.set(2, "Client programming");//java oracle client programming jsp spring
		list.remove(3);
		
		int index = list.indexOf("Java");
		System.out.println(index);
		
		index = list.lastIndexOf("Java");
		System.out.println(index);
		
		for (int i =0; i< list.size(); i++)
			System.out.println(list.get(i));
		
		
		//for ! each문으로 출력 (항상 for 문)
		//형식 : for (데이터 타입 변수명 : 배열명이나 컬렉션의 참조 변수명 ) {
		//실행문;
		//}
		//for (String s : list ) 
			//System.out.println(s);
		System.out.println();
		
		System.out.println("list가 가진 모든 원소를 문자열로 반환");
		System.out.println(list.toString());
		System.out.println();
		
		//정수값을 저장하도록 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(23);
		list1.add(94);
		list1.add(Integer.valueOf(62));
		list1.add(Integer.valueOf(45));
		
		System.out.println();
		
		//Apple이라는 이름으로 클래스를 생성한다. 이 클래스느 품종과 생상을 필드로 가진다
		//여러 사과를 저장하도록 인스턴스 생성
		ArrayList<Apple> list2 = new ArrayList<Apple>();
		list2.add(new Apple("부사","빨강"));
		list2.add(new Apple("아오리","청색"));
		list2.add(new Apple("썸머킹","황금"));
		list2.add(new Apple("홍로","빨강"));
		
		for(int i = 0 ; i < list2.size() ; i++) {
			System.out.print("품좀 : " + list2.get(i).getKind());
			System.out.println(", 색상 : " + list2.get(i).getColor());
			//System.out.println(list2.get(i).toString());
		
		}
		System.out.println();
		
		//출력 - 2 
		for (int i = 0; i < list2.size(); i++) {
			Apple app = list2.get(i);
			System.out.print("품종 :" + app.getKind());
			System.out.println(", 색상 : " + app.getColor());
			//System.out.println(app.toString());
		}
		System.out.println();
		
		//출력 -3 : for ~ each문으로 출력
		for(Apple app : list2) {
			System.out.println(app.toString());
		}
		
		System.out.println();
		
		//출력 - 4 : 반복자로 출력
		Iterator<Apple> iter = list2.iterator();
		while(iter.hasNext()) {
			Apple apple = iter.next();
			System.out.println(iter.next().toString());
		}
		
		System.out.println("list2가 가진 모든 원소를 문자열로 반환");
		System.out.println(list2.toString());
		System.out.println();
		
		// 여러 영화 정보를 저장하도록 인스턴스 생성
		//Movie클래스는 영화제목 , 평점 감독 개봉일 등의 필드를 가진다
		//인터페이스명 <타입인자> 참조변수 = new 구현클래스 생성자 <타입인자>();
		List<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("더 배트맨 ", "별4 8.78","맷 리브스", "2022 개봉"));
		list3.add(new Movie("다크 나이트 라이즈 ", "별5 9.02","론 하워드", "2020 재개봉"));
		list3.add(new Movie("더 마블스 ", "별0 0","니아 다코스타", "2023 개봉"));
		
		Movie m = new Movie();
		m.setmTitle("소년들");
		m.setmGrade("별3 7.75");
		m.setmDirector("정지영");
		m.setAnYear("2023 개봉");
		list3.add(m);
		
		//원소의 개수로 인덱스 접근
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i).toString());
		}
		System.out.println();
		
		//for ~ each : for (자료형 변수 : 배열이나 컬렉션)
		for (Movie value : list3) {
			System.out.println(value.toString());
		}
		System.out.println();
		
		//반복자
		Iterator<Movie> it = list3.iterator();
		while(it.hasNext()) {
			//Movie me = it.next();
			//System.out.println(me.toString());
			
			System.out.println(it.next().toString());
		}
	
	}
}
