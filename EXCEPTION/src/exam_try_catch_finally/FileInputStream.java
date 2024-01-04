package exam_try_catch_finally;

public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		System.out.println(file + "을 읽습니다");
	}
	
	public void read() {
		System.out.println(file + "을 읽습니다");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다");
	}
}
