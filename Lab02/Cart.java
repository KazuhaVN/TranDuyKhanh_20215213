package newpack;

public class Cart {
	private static int cnt=0;
	private static float sum=0;
public static final int MAX_NUMBER_ORDERED = 20;
private static DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

public static int qtyOrdered(int a){
	if(a==1) {cnt++;}
	if(a==2) {cnt--;}
	return cnt;
}
public float totalCost() {
	return sum;
}
public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	
	if(cnt == 20 ) { System.out.println("The cart is full , please create a new cart"); return;}
	
	itemOrdered[cnt] = disc;
	sum= sum + disc.getCost();
	qtyOrdered(1);
	System.out.println("The disc " + disc.getTitle() + " has been added");
    if(cnt >= 18 ) { System.out.println("The cart is almost full");}
    else if(cnt == 20 ) { System.out.println("The cart is full now");}
    
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	sum= sum - disc.getCost();
	qtyOrdered(-1);
	disc = null;
	System.out.println("The disc has been removed");
}

}
