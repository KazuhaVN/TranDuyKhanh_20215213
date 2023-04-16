package lesson1oop;
import java.util.Scanner;
public class code226p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Input  a11 , a12 and b1 for a11x+a12y=b1 ");
		 double a11 = input.nextDouble();
		 double a12 = input.nextDouble();
		 double b1 = input.nextDouble();
		 System.out.println("Input  a21 , a22 and b2 for a21x+a22y=b2 ");
		 double a21 = input.nextDouble();
		 double a22 = input.nextDouble();
		 double b2 = input.nextDouble();
		 
	      double D=(double)(a11*a22-a21*a12);
	      double Dx=(double)(b1*a22-a12*b2);
	      double Dy=(double)(b2*a11-b1*a21);
	      if(D==0) {
	    	  if((Dx==0) &&(Dy==0)) {
	    		  System.out.println("Infinite solution");
	    	  }
	    	  else {System.out.println("No solution ");}
	      }
	      else {double x=(double)(Dx/D); double y=(double)(Dy/D);
	    	  System.out.printf("x= %.2f y=%.2f",x,y);}
	}
}
