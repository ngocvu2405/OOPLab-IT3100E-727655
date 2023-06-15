package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	//Method add & remove Media
	public void addMedia(Media media) {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			System.out.println("Your Cart is full.");
		}
		else if (!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
			System.out.println("Media "+ media.getTitle() + " has been added");
		}
		else if (itemsOrdered.contains(media)) {
			System.out.println("Media "+ media.getTitle() + " has been exists");
		}
		else {
			System.out.print("Some error are happen, you can't add this media to your cart");
		}
	}
	
	public void removeMedia(Media media) {
		 if (itemsOrdered.contains(media)) {
				itemsOrdered.remove(media);
				System.out.println("Media "+ media.getTitle() + " has been removed");
			}
			else if (!itemsOrdered.contains(media)) {
				System.out.println("Media "+ media.getTitle() + " hasn't been exists");
			}
			else {
				System.out.print("Some error are happen, you can't add this media to your cart");
			}
	}
	//Method totalCost
	public float totalCost() {
		float total = 0.0f;
		for (int i = 0; i <itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
	    
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 1; i <= itemsOrdered.size(); i++) {
			System.out.println(i + ". DVD: " + itemsOrdered.get(i-1));
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
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if(isMatch(keyword, itemsOrdered.get(i).getTitle())) {
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
