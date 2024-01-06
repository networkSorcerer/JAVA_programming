package exam_super;

class ChildClass extends ParentClass{
	protected int data;
	
	public ChildClass() {
		data=200;
	}
	@Override
	public void print() {
		int data =300;
		super.print();
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println("data : " + data);
		System.out.println("this.data : " + this.data);
		System.out.println("super.data : " +super.data );
	}

}
