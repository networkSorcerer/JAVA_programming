package api;

public class ApiPractice {
	//패키지 사용 
	//서로 다른 패키지 안에 들어 있는 클래스나 인터페이스를 사용하는 방법
	//클래스에 패키지 이름을붙여서 참조한다
	//개별 클래스를 import한다
	//전체 클래스를 import한다
	
	//1)클래스에 패키지 이름을 붙여서 참조
	//같은 패키지 내에 포함되어 있지 않는 클래스를 사용하려면 클래스의 완전한 이름을 써주어야 한다
	
	//graphics.Circle obj = new  grphics.Circle();
	
	//2)패키지 멤버를 import 
	//외부 패키지의 특정 클래스를 사용하려면 import문장을 사용한다
	//import문장은 package 문장 다음에 위치하여야 한다
	//import graphics.Circle;
	//Circle obj = new Circle();
	
	//패키지 사용
	//3)전체 패키지를 import
	//하나의 패키지 안에 포함된 모든 클래스를 포함하려면 다음과 같이 *를 사용하면 된다
	//import graphics.*;
	//Rectangle objRe = new Rectangle();
	//Circle objC = new Circle();
	
	//4)계층구조의 패키지 포함하기
	
	//5)정적 import문장
	//클래스안에 정의된 정적 상수나 정적메소드를 사용하는 경우에 일반적으로 클래스이름을 앞에 적어주어야 한다
	//int val = Math.max((int)(Math.random()*10)+1, 5);
	//하지만 정적 import문장을 사용하면 클래스 이름을 생략하여도 된다
	//import static java.lang.Math.*;
	//int val = max((int)(random()*10)+1,5);
	//protected Object clone() 객체자신의 복사본을 생성하여 반환한다
	//public  boolean equals(Object obj)
}
