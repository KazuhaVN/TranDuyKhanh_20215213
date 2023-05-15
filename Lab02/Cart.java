package newpack;

public class Cart {
	private static int qtyOrdered=0;
	private static float sum=0;
public static final int MAX_NUMBER_ORDERED = 20;
private static DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];


public float totalCost() {
	return sum;
}
public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	
	if(qtyOrdered == 20 ) { System.out.println("The cart is full , please create a new cart"); return;}
	
	itemOrdered[qtyOrdered] = disc;
	sum= sum + disc.getCost();
	qtyOrdered++;
	System.out.println("The disc " + disc.getTitle() + " has been added");
    if(qtyOrdered >= 18 ) { System.out.println("The cart is almost full");}
    else if(qtyOrdered == 20 ) { System.out.println("The cart is full now");}
    
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

public void addDigitalVideoDisc(DigitalVideoDisc ... dvdList) {
	int dvdlength = dvdList.length;
	if(qtyOrdered == 20 ) { System.out.println("The cart is full , please create a new cart"); return;}
	if(qtyOrdered + dvdlength > 20) {
		System.out.println("The cart can not take more dvd "); return;
	}
	
	for(int i=0; i<dvdList.length ;i++)
	{	itemOrdered[qtyOrdered] = dvdList[i];
     System.out.println("The disc " + itemOrdered[qtyOrdered].getTitle()+ " has been added"); 
     sum= sum + itemOrdered[qtyOrdered].getCost();
 	qtyOrdered++;
     }
	
}
public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
	if (qtyOrdered + 2 <= MAX_NUMBER_ORDERED) {
		itemOrdered[qtyOrdered] = disc1;
		qtyOrdered++;
		itemOrdered[qtyOrdered] = disc2;
		qtyOrdered++;
		System.out.println("The disc " + disc1.getTitle() + " has been added");
		System.out.println("The disc " + disc2.getTitle() + " has been added");
	}
	else {
		System.out.println("The cart can not take more dvd"); 
		return ;
	}
}

public int findposition(DigitalVideoDisc disc) {
	for(int i=0 ; i< qtyOrdered; i++) {
	
		if( (itemOrdered[i]).equals(disc) ) {
return i;
	}
}
	return -1;
}
public void changeposition(DigitalVideoDisc disc) {
	int k = findposition(disc);
	if(k==-1) {System.out.println("The disc you want to delete is not in the Cart");return ;}
	System.out.println("The disc "+ itemOrdered[k].getTitle() +" has been removed");
	if(k==(qtyOrdered-1)) {
		itemOrdered[k] = null;
		return ;}
	
	for(int d=k;d<qtyOrdered-1;d++) {
		itemOrdered[d]=itemOrdered[d+1];
	}
	itemOrdered[qtyOrdered-1]= null;
	
	return;
	
}

public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	sum= sum - disc.getCost();
	changeposition(disc);
	qtyOrdered--;
    
	
}

public void printdvd() {
	System.out.println("\n***********************CART***********************");
	System.out.println("Ordered items:");
	for (int i=1; i<=qtyOrdered; i++) {
		System.out.println(i + ". " + itemOrdered[i-1].toString());
	}
	System.out.println("Total cost: " + this.totalCost() + "$");
	System.out.println("***************************************************");
}


public void searchTitle(String title) {
	int found = 0;
	for (int i=0; i<qtyOrdered; i++) {
		if (itemOrdered[i].isMatch(title)) {
			System.out.println(itemOrdered[i].toString());
			found = 1;
		}
	}
	if (found==0){
		System.out.println("Item not found");
	}
}
public void searchId(int id) {
	for (int i=0; i<qtyOrdered; i++) {
		if (itemOrdered[i].getId() == id) {
			System.out.println(itemOrdered[i].toString());
			return;
		}
	}
	System.out.println("Item not found");
}

}

