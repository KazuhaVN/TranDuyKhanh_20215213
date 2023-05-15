package lesson1oop;
import java.util.Scanner;
import java.lang.Math;
public class code226p3 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			 System.out.println("Input  a , b and c for ax^2+bx+c=0 ");
			 double a = input.nextDouble();
			 double b = input.nextDouble();
			 double c = input.nextDouble();
			 if(a==0) {
				 if(b==0) {
					 if(c==0){System.out.println("Infinite solution");}
					 else { System.out.println("No solution");}
				 }
				 else {double x=(double)(-c/b);
					 System.out.printf("1 solution x= %.2f",x);
				 }
			 }
			 
			 else {
				 double delta = (double)(b*b-4*a*c);
				 if(delta <0) { System.out.println("No real root solution");}
				 else if (delta == 0) {
					 double x0 = (-b)/(2*a);
					 System.out.printf("1 root x= %.2f",x0);}
				 else { double x1 = (-b+Math.sqrt(delta))/(2*a);
				 double x2 = (-b-Math.sqrt(delta))/(2*a);
				 System.out.printf("2 roots x1= %.2f , x2= %.2f",x1,x2);
				 }
				 
			 }
			 
			 
			 
		}
}
