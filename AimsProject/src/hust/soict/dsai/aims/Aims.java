package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Aims {
	public static void main(String[] args) {
		//Create a new cart
		Cart anOrder = new Cart();
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia (dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia (dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "Animation", 18.99f);
		anOrder.addMedia(dvd3);
		//print total cost of the items in the cart System.out.println("Total Cost is: ");
		System.out.printf("%.2f\n",anOrder.totalCost());
		anOrder.removeMedia(dvd2);
		System.out.printf("%.2f\n",anOrder.totalCost());
		anOrder.removeMedia(dvd1);
		System.out.printf("%.2f\n",anOrder.totalCost());
		
		}

}
