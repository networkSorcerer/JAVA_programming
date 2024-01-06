package exam_inner_class;

public class Main {
	public static void main(String [] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		b.field1 =3;
		b.method1();
		System.out.println();
		
		A.C c = new A.C();
		A.C.method2();
		System.out.println();
		
		a.method();
	}

}
