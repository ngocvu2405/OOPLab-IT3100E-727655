package hust.soict.dsai.aims.media;

import java.util.*;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media med1, Media med2) {
		int compareCost = Float.compare(med2.getCost(), med1.getCost());
		if(compareCost != 0) {
			return compareCost;
		}
		return med1.getTitle().compareTo(med2.getTitle());
	}

}
