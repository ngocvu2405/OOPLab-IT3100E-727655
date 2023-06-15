package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private int length;
	private String title;
	
	public Track(int length, String title) {
		super();
		this.length = length;
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}


}
