package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private int length;
	private String title;
	
	public Track(String title, int length) {
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
	
	@Override
	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if(!(obj instanceof Track)) {
			return false;
		}
		return ((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength();
	}
	
	@Override 
	public String toString() {
		return "Track: " + this.getTitle() +
				" - Length: " + this.getLength();
			}


}
