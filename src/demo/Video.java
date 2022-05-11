package demo;

public class Video {
	
	private String title;
	private String director;

	public Video(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Video{" +
				"title='" + title + '\'' +
				", director='" + director + '\'' +
				'}';
	}
}
