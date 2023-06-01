package hust.soict.dsai.aims.cart;
import java.util.*;  
import hust.soict.dsai.aims.media.Media;
public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

public float totalCost() {
	float sum=0;
	for(Media i : itemsOrdered) {
		sum = sum + i.getCost();
		}
	return sum;
}

public void addMedia(Media a) {
	if (itemsOrdered.size() == MAX_NUMBER_ORDERED) {return ;}
	if(itemsOrdered.contains(a)) {
		return ;
	}
	else {itemsOrdered.add(a);}
	
}

public void removeMedia(Media a) {
	if(itemsOrdered.contains(a)) {
		itemsOrdered.remove(a);
	}
	else {return ;}
	
	
}

public void print() {
	System.out.println("\n***********************CART***********************");
	System.out.println("Ordered items:");
	for (int i=1; i<=itemsOrdered.size(); i++) {
		System.out.println(i + ". " + itemsOrdered.get(i-1).toString());
	}
	System.out.println("Total cost: " + this.totalCost() + "$");
	System.out.println("***************************************************");
}

// array method 
//public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//	int dvdlength = dvdList.length;
//	if(qtyOrdered == 20 ) { System.out.println("The cart is full , please create a new cart"); return;}
//	if(qtyOrdered + dvdlength > 20) {
//		System.out.println("The cart can not take more dvd "); return;
//	}
//	
//	for(int i=0; i<dvdList.length ;i++)
//	{	itemOrdered[qtyOrdered] = dvdList[i];
//     System.out.println("The disc " + itemOrdered[qtyOrdered].getTitle()+ " has been added"); 
//     sum= sum + itemOrdered[qtyOrdered].getCost();
// 	qtyOrdered++;
//     }
//	
//}



public void printdvd() {
	System.out.println("\n***********************CART***********************");
	System.out.println("Ordered items:");
	for (Media a: itemsOrdered ) {
		int b = itemsOrdered.indexOf(a);
		System.out.println(b + ". " + a.toString());
	}
	System.out.println("Total cost: " + this.totalCost() + "$");
	System.out.println("***************************************************");
}


public void searchTitle(String title) {
	int found = 0;
	for(Media a: itemsOrdered) {
		if( a.getTitle().equals(title) ) {
			System.out.println(a.toString());
			found =1;
		}
	}
	if (found==0){
		System.out.println("Item not found");
	}
}
public void searchId(int id) {
	for(Media a: itemsOrdered) {
		if( a.getId() == id ) {
			System.out.println(a.toString());
			return ;
		}
	}
	
	System.out.println("Item not found");
	return ;
}
public void sortByTitle() {
    Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
}

public void sortByCost() {
    Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
}

public void makeEmpty() {
	itemsOrdered.clear();
}

public Media findByTitle(String title) {
	for (Media media : itemsOrdered) {
		if (media.getTitle().equals(title))
			return media;
	}
	return null;
}

}




