package exam_inner_class;

class A {
	private int num;
	static int number;
	
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	class B {
		int field1;
		
		B() {
			num=5;
			number=3;
			System.out.println("B 객체가 생성됨");
		}
		void method1() {
			System.out.println("num : " + num);
			System.out.println("number : " + number);
			System.out.println("field1 : " + field1);
		}
	}
	static class C {
		int field1;
		static int field2;
		
		C() {
			number =9;
			System.out.println("C 객체가 생성됨");
		}
		
		void method() {
			System.out.println("field : " + field1);
		}
		static void method2() {
			System.out.println("field2 : " + field2);
		}
	}
	void method() {
		class D {
			int field3;
			
			D(){
				System.out.println("D 객체가 생성됨");
			}
			
			void method1() {
				System.out.println("field3 : " + field3);
			}
		}
		D d = new D();
		d.field3 = 3;
		d.method1();
	}
}
