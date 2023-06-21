package hust.soict.globalict.aims.test;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("King");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Queen");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Evil");
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.removeMedia(dvd1);
		store.removeMedia(dvd2);
		store.removeMedia(dvd3);
	}

}
