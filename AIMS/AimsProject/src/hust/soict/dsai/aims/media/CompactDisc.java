package hust.soict.dsai.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable{

	private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    
	public CompactDisc(String title, String category, float cost, String director, int length, String artist) {
		super(title, category, cost, director, length);
		this.artist = artist;
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}; 
	
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Track " + track.getTitle() + " is added!");
		}
		else {
			System.out.println("Track " + track.getTitle() + " has been existed!");
		}
	}
    
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track " + track.getTitle() + " has ben removed!");
		}
		else {
			System.out.println("Track " + track.getTitle() + " is not exist!");
		}
	}
	
	public int getLength() {
		int total = 0;
		for (Track track: tracks) {
			total += track.getLength();
		}
		return total;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
		for (Track track: tracks) {
			track.play();
		}
	}
}
