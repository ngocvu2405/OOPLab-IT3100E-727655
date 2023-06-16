package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	public int compare(Media med1, Media med2) {
		int compareTitle = med1.getTitle().compareTo(med2.getTitle());
		if(compareTitle != 0) {
			return compareTitle;
		}
		return Float.compare(med2.getCost(), med1.getCost());
	}

}
