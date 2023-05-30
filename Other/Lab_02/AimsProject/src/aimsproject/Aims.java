package aimsproject;

public class Aims {

	public static void main(String[] args) {		
		
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVDs objects and add to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		anOrder.addDigitalVideoDisc(dvd1);		
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		//print Cost --check totalCost()
		System.out.println("Total cost is: " + anOrder.totalCost());
		
		//Remove DVD by title -- cost decreased
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: " + anOrder.totalCost());
		
	}

}
