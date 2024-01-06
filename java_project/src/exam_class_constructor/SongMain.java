package exam_class_constructor;

public class SongMain {
	public static void main(String args[] ) {
		Song s = new Song("Dansing Queen", 
							"ABBA",
							"Arrival",
							new String [] {"Benny Andersson","Bjorn Ulvaeus"},
							1977,
							2);
		s.show();
	}
}
