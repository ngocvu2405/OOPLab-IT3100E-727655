package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	// Method addDigitalVideoDisc
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		}
		else if (qtyOrdered == MAX_NUMBERS_ORDERED-1) {
			System.out.println("The cart is almost full");
		}
	}
	
	//overload method addDigitalVideoDisc
	public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) {
		for (int i=0; i<dvdList.length; i++) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	//Method removeDigitalVideoDisc
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (disc.getTitle() == itemsOrdered[i].getTitle() ) {
				for (int j = i; j < qtyOrdered-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
			}
		}
	}
	
	//Method totalCost
	public float totalCost() {
		float total = 0.0f;
		for (int i = 0; i <qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	    
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 1; i <= qtyOrdered; i++) {
			System.out.println(i + ". DVD: " + itemsOrdered[i-1]);
		}
        System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	
	private boolean isMatch(String keyword, String title) {
		if (title.equals(keyword)) {
				return true;
		}
		return false;
	}
	
	public void searchTitle(String keyword) {
		boolean match = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if(isMatch(keyword, itemsOrdered[i].getTitle())) {
				System.out.println(keyword + " is found!");
				match = true;
				break;
			}
		}
		if(!match) {
			System.out.println(keyword +" is not found in your Cart!");
		}
	}
}
