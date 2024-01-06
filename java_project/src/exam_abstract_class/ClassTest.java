package exam_abstract_class;
class A {
	int a =10;
	
	void b() {
		System.out.println("A");
	}
}

class AA extends A {
	int a = 20;
	
	@Override 
	void b() {
		System.out.println("AA");
	}
	
	void c() {
		System.out.println("C");
	}
}

class BB extends A {
	int a = 30;
	
	@Override 
	void b() {
		System.out.println("BB");
	}
	
	void d() {
		System.out.println("D");
	}
}
public class ClassTest {
	public static void main (String [] args) {
		A z = new AA();
		System.out.println(z.a);//10
		z.b();//AA
		
		((AA)z).c();//c
		System.out.println(((AA)z).a);//20
		
		AA a1 = (AA) z;
		System.out.println(a1.a);//20
		a1.c();//c
		
		z= new BB();
		System.out.println(z.a);//10
		z.b();//BB
		((BB)z).d();//D
		System.out.println(((BB)z).a);//30
		
		BB b1 = (BB)z;
		b1.d();//D
		System.out.println(b1.a);//30
	}

}
