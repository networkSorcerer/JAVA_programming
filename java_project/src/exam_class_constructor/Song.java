package exam_class_constructor;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	public Song() {}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String[] getComposer() {
		return composer;
	}

	public void setComposer(String[] composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 : " + album);
		System.out.println("작곡가 : ");
		for ( int i=0; i<composer.length; i ++) {
			System.out.println(composer[i]);
			if(i+1 == composer.length) // i+1 == composer.length 구절은 i 배열이 0부터 시작하므로 배열의 마지막 요소를 확인하는 문구이다
				System.out.println();
			else
				System.out.println();
		}
		System.out.println("년도 : " + year);
		System.out.println("트랙 번호 : " + track);
	}

}
