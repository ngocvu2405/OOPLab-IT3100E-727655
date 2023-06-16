package hust.soict.dsai.test.media;

import java.util.*;
import hust.soict.dsai.aims.media.*;
public class TestMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("The Crayon Shin-chan 20", "Comics", 16.00f);


        CompactDisc cd = new CompactDisc("Run away!", "Music","SonTung MTP", 1500.98f);
        Track track1 = new Track("ngbthg - Sweet Band", 161);
        Track track2 = new Track("Den", 403);
        Track track3 = new Track("Concert 25 - Hoang Dung", 300);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd);    

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
	}

}
