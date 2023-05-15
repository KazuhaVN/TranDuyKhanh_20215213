package code66pack;
import java.util.Scanner;
public class codee66class {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows of matrix ");
		int m= input.nextInt();
		System.out.println("Enter number of columns of matrix ");
		 int n= input.nextInt();
		 int[][] a = new int[m][n];
		 int[][] b = new int[m][n];
		 System.out.println("Enter first matrix"); 
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			   a[i][j]= input.nextInt();
			}
		}
		 System.out.println("Enter second matrix"); 
		 for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
				   b[i][j]= input.nextInt();
				}
			}
		 
		 for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
				   b[i][j]= b[i][j]+a[i][j];
				}
			}
		 System.out.println("Sum of 2 matrices"); 
		 for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
				  System.out.print(b[i][j]+" ");
				}
				 System.out.println(); 
			}
	}
}
