package newpack;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store(3);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("King");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Queen");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Evil");
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.addDVD(dvd3);
		store.removeDVD(dvd1);
		store.removeDVD(dvd2);
		store.removeDVD(dvd3);
	}

}
