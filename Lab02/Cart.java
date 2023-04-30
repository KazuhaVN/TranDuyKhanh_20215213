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

}




