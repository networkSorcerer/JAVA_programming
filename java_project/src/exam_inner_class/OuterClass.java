package exam_inner_class;

public class OuterClass {
	private String famous;
	public OuterClass() {
		famous="할 수 있다느 믿음을 가지면 처음에는 그런 능력이 없을지라도"
				+"결국에는 할 수 있는 능력을 확실히 갖게 된다. - 간디";
	}
	
	class InnerClass {
		private String wise;
		public InnerClass() {
			wise="성공이라는 못을 박으려면 끈질김이라는 망치가 필요하다 - 존 메이슨";
		}
		
		public void innerMethod() {
			System.out.println("1. " + wise);
			System.out.println("2. " + famous);
		}
	}

}
