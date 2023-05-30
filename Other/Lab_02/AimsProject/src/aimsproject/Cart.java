package aimsproject;

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
}
