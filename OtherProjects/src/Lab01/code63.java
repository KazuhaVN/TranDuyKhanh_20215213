package Lab01;
import java.util.Scanner;
public class code63 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Input n");
    
        int n = input.nextInt();
        int star= (n-1)*2+1;
        int space=0;
        for(int i=1;i<=star;i=i+2) {
        	space=(star-i)/2;
        	for(int k=1;k<=space;k++) { System.out.print(" ");}
        	for(int j=1;j<=i;j++) { System.out.print("*");}
        	for(int k=1;k<=space;k++) { System.out.print(" ");}
        	System.out.println();
        }
	}
	
}
