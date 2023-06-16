package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
	
	 public void searchByCategory(String category) {
	        boolean found = false;
	        for (Media media : itemsOrdered) {
	            if (media.getCategory().equalsIgnoreCase(category)) {
	                System.out.println("Found " + media);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Sorry, no media matching the \"" + category + "\" category were found!");
	        }
	    }

	    public void searchByPrice(float maxCost) {
	        boolean matchFound = false;
	        for (Media media : itemsOrdered) {
	            if (media.getCost() <= maxCost) {
	                System.out.println("Found " + media);
	                matchFound = true;
	            }
	        }
	        if (!matchFound) {
	            System.out.println("Sorry, no media were found that match the maximum cost provided!");
	        }
	    }

	    public void searchByPrice(float minCost, float maxCost) {
	        boolean matchFound = false;
	        for (Media media : itemsOrdered) {
	            if (media.getCost() >= minCost && media.getCost() <= maxCost) {
	                System.out.println("Found " + media);
	                matchFound = true;
	            }
	        }
	        if (!matchFound) {
	            System.out.println("Sorry, no media were found that match the cost range between your specified minimum and maximum!");
	        }
	    }

	    public void searchByID(int id) {
	        boolean found = false;
	        for (Media media : itemsOrdered) {
	            if (media.getId() == id) {
	                System.out.println("Found " + media);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Sorry, no media were found that match the ID provided!");
	        }
	    }
	    
	    // Sort media in cart
	    public void sortMediaByTitle() {
	        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	        Iterator<Media> iterator = itemsOrdered.iterator();
	        iterator = itemsOrdered.iterator();
	    
	        while (iterator.hasNext()) {
	            System.out.println(((Media)iterator.next()).toString());
	        }
	    }
	    public void sortMediaByCost() {
	        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	        Iterator<Media> iterator = itemsOrdered.iterator();
	        iterator = itemsOrdered.iterator();
	    
	        while (iterator.hasNext()) {
	            System.out.println(((Media)iterator.next()).toString());
	        }
	    }
	    
	    public void empty() {
	        if (itemsOrdered.size() == 0) {
	            System.out.println("Nothing to remove!");
	        } else {
	            itemsOrdered.clear();
	            System.out.println("Order created.");
	            System.out.println("Now your current cart will be empty!");
	            System.out.println();
	        }
	    }
	    
	    public void searchByTitle(String keyword) {
	        boolean matchFound = false;
	        for (Media media : itemsOrdered) {
	            if (media.isMatch(keyword)) {
	                System.out.println("Found " + media);
	                matchFound = true;
	            }
	        }
	        if (!matchFound) {
	            System.out.println("Sorry, no media were found with \"" + keyword + "\" in the title!");
	        }
	    }
	    
	    public Media searchToRemove(String title) {
			for (Media media : itemsOrdered) {
				if (media.getTitle().equals(title)) {
					return media;
				}
			}
			return null;
		}
	
}
