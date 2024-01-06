package exam_abstract_class;
class Parent {
	String field;
	
	public void method1() {
		System.out.println("Parent-method()");
	}
	
	public void method2() {
		System.out.println("Parent-method()");
	}
}

class Child extends Parent {
	String field2;
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			child.field2 = "Child로 변환 성공";
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2 (Parent parent) {
		Child child = (Child) parent;
		child.field2 = "Child로 변환 성공";
		System.out.println("method2 - " + child.field2);
	}
	public static void main (String [] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
	}

}
