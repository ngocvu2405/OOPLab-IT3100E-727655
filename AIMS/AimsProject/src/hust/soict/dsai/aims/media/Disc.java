package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected String director;
	protected int length;
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.length =length;
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, int length) {
		super(title);
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

}
