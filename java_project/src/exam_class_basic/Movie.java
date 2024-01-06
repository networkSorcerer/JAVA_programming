package exam_class_basic;

public class Movie { 
	private String movieTitle;
	private String movieGrade;
	private String movieDirector;
	private String movieYear;
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieGrade() {
		return movieGrade;
	}
	public void setMovieGrade(String movieGrade) {
		this.movieGrade = movieGrade;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	
	public void moiveData(String title, String grade, String director, String year) {
		movieTitle = title;
		movieGrade = grade;
		movieDirector = director;
		movieYear = year;
	}
	
	public String toString() {
		return String.format("%s\t %s\t %-10s\t %s" , movieTitle, movieGrade, movieDirector, movieYear);
	}

}
