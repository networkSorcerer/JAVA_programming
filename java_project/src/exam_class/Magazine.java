package exam_class;

class Magazine extends Book{
	
	private String date;

	public Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}
	
	public String toString () {
		return super.toString() + "\n발매일 : " + date;
	}

}
