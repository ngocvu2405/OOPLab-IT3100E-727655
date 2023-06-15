package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store testStore = new Store();
		
		//Create new DVDs objects and add to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		testStore.addMedia(dvd1);		
		testStore.addMedia(dvd2);
		testStore.addMedia(dvd3);
		
		testStore.print();
		
		//Remove DVD by title -- List doesn't have DVD3
		testStore.removeMedia(dvd3);
		
		testStore.print();
	}

}
