package generic;

public class Box1<T> {//접근제어자 class 클래서명<매개변수 타입>{ }
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}

}
