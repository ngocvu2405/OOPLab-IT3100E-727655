package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new DVDs objects and add to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		cart.addDigitalVideoDisc(dvd1);		
		cart.addDigitalVideoDisc(dvd2);
		cart.addDigitalVideoDisc(dvd3);
		
		//print Cost --check totalCost()
		System.out.println("Total cost is: " + cart.totalCost());
		
		cart.searchTitle("Aladin");
		cart.searchTitle("Doraemon");
		
		//Remove DVD by title -- cost decreased
		cart.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: " + cart.totalCost());
		cart.print();
		
		cart.searchTitle("The Lion King");
	}

}
