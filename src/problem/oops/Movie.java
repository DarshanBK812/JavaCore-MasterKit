package problem.oops;



public class Movie {

	String name;
	String language;
	int duration;

	public Movie(String name, String language, int duration) {
		this.name = name;
		this.language = language;
		this.duration = duration;
	}

	public String toString() {
		return "Movie name :" + name + " " + " movieLanguage :" + language + " " + " Duration :" + duration;
	}

}
