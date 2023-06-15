package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

//import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
    	if (itemsInStore.contains(media)) {
    		System.out.println("This Media was added previously!");
    	}
    	else {
    		itemsInStore.add(media);
    		System.out.println("Media: " + media.getTitle() +  " has been added!");

    	}
    }
    
    public void removeMedia(Media media) {
    	if (itemsInStore.contains(media)) {
    		itemsInStore.remove(media);
    		System.out.println("Media: " + media.getTitle() + " has been removed!");
    	}
    	else {
    		System.out.println("Media: " + media.getTitle() +  " is not exist in the Store.");

    	}
    }
    
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
	
	public void print() {
		System.out.println("**********************STORE************************");
		for (Media disc: itemsInStore) {
			System.out.println(itemsInStore.indexOf(disc)+1 +". " + disc);
		}
		System.out.println("***************************************************");
	}
    
}
