package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
//	private String title;
//	private String category;
//	private String director;
//	private int length;
//	private float cost;
//	private int id;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title, String category, float cost, String director) {
		super(title, category);
		this.id = nbDigitalVideoDiscs+1;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
		// TODO Auto-generated constructor stub
		this.id = nbDigitalVideoDiscs+1;
	}
	public DigitalVideoDisc(String title) {
		super(title);
//		this.id = nbDigitalVideoDiscs+1;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		this.id = nbDigitalVideoDiscs+1;
	}
	
	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}
	
	public String setTitle(String title) {
		return title;
	}
	
	@Override
	public String toString() {
		return "DVD: " + this.title 
				+ " - "  + this.category 
				+ " - "  + this.director 
				+ " - " + this.length
				+ ": " + this.cost + "$";
	};
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
