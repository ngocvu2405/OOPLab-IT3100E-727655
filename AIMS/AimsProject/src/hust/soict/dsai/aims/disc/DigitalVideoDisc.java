package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs+1;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs+1;
	}
	public int getLength() {
		return length;
	}
	public int getId() {
		return id;
	}

	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	private static int nbDigitalVideoDiscs = 0;
	
	@Override
	public String toString() {
		return "DVD: " + this.title 
				+ " - "  + this.category 
				+ " - "  + this.director 
				+ " - " + this.length
				+ ": " + this.cost + "$";
	};
}
