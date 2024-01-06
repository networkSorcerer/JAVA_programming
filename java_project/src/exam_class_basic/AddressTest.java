package exam_class_basic;

public class AddressTest {
	public static void main(String [] args) {
		Address add1 = new Address() ;
		add1.name = "홍길동";
		add1.address = "서울시 강남구 수서동 77-23번지";
		add1.phone = "02-777-2452";
		add1.printData();
		
		Address add2 = new Address();
		add2.addressData("김철수","경기도 성남시 분당구 88-1번지","031-354-8888");
		System.out.println(add2.toString());
	}

}
