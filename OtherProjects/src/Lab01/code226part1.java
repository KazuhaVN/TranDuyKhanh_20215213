package Lab01;
import java.util.Scanner;
public class code226part1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Input  a and b for ax+b=0 ");
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 if(a==0) {
			 if(b==0){System.out.println("Infinite solution");}
			 else { System.out.println("No solution");}
		 }
		 else {double x=(double)(-b/a);
			 System.out.printf("1 solution x= %.2f",x);
		 }
	}
}
