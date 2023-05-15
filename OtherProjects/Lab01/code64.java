package day;
import java.util.Scanner;


public class code {
	static int validyear(String strNum) {
	    if (strNum == null) {
	        return 0;
	    }
	    try {
	        int d =  Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return 0;
	    }
	    return 1;
	}
static int validmonth(String month) {
  switch(month) {
  case "1","January","Jan.","Jan","3","March","Mar.","Mar","5","May","7","July","Jul","8","August","Aug.","Aug","10","Octorber","Oct.","Oct","12","December","Dec.","Dec":
  return 1;
  case "2","February","Feb.","Feb" : return 2;
  case "4","April","Apr.","Apr","6","June","Jun","9","September","Sept.","Sep","11","November","Nov.","Nov": return 3;
  
  
  }
	return 0;

}

		  public static void main(String[] args) {
			  int leap=0;
				Scanner input = new Scanner(System.in);
			 System.out.println("Input year ");
			 String b = input.next();
		     while(true)	{ if(validyear(b)==0){System.out.println("Invalid year ,try again "); b = input.next();}
		                 else {break;}  
		     }
		     
		     int a=Integer.parseInt(b);
			 if(a % 4 == 0 ) {
				 if((a % 100 == 0) &&(a % 400 != 0) ) { leap =0;}
				 else {leap=1;}
			 }
			 else {leap = 0;}
			 
			 System.out.println("Input month ");
			 String month = input.next();
               while(true) {if (validmonth(month) == 0) { System.out.println("Invalid month ,try again ");
                    month = input.next(); } 
               else {break;} 
               }
			 
               int d= validmonth(month);
              
               if(d==1) {System.out.println("31 days");}
               else if(d==3) {System.out.println("30 days");}
               else if(d==2) {
            	   if(leap==1) {System.out.println("29 days");}
            	   else {System.out.println("28 days");}
               }
			System.exit(0);
		  }

}
