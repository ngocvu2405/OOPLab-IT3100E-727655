package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc disc) {
    	if (itemsInStore.contains(disc)) {
    		System.out.println("This DVD was added previously!");
    	}
    	else {
    		itemsInStore.add(disc);
    		System.out.println("DVD " + disc.getTitle() +  " has been added!");

    	}
    }
    
    public void removeDVD(DigitalVideoDisc disc) {
    	if (itemsInStore.contains(disc)) {
    		itemsInStore.remove(disc);
    		System.out.println("DVD " + disc.getTitle() + " has been removed!");
    	}
    	else {
    		System.out.println("DVD " + disc.getTitle() +  " is not exist in the Store.");

    	}
    }
    
	public ArrayList<DigitalVideoDisc> getItemsInStore() {
		return itemsInStore;
	}
	
	
	public void print() {
		System.out.println("**********************STORE************************");
		for (DigitalVideoDisc disc: itemsInStore) {
			System.out.println(itemsInStore.indexOf(disc)+1 +". " + disc);
		}
		System.out.println("***************************************************");
	}
    
}
