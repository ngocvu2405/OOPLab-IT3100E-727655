package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new DVDs objects and add to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		cart.addMedia(dvd1);		
		cart.addMedia(dvd2);
		cart.addMedia(dvd3);
		
		//print Cost --check totalCost()
		System.out.println("Total cost is: " + cart.totalCost());
		
		cart.searchTitle("Aladin");
		cart.searchTitle("Doraemon");
		
		//Remove DVD by title -- cost decreased
		cart.removeMedia(dvd3);
		System.out.println("Total cost is: " + cart.totalCost());
		cart.print();
		
		cart.searchTitle("The Lion King");
	}

}
