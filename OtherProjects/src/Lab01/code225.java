package Lab01;

import javax.swing.JOptionPane;
public class code225 {

	  public static void main(String[] args) {
		  String strNum1, strNum2;
		  strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		  double num1 = Double.parseDouble(strNum1);
		  strNum2 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number", JOptionPane.INFORMATION_MESSAGE);
		  double num2 = Double.parseDouble(strNum2);
		  double c= num1+num2;
		  
		  JOptionPane.showMessageDialog(null, "The sum is " + c ,"Show results", JOptionPane. INFORMATION_MESSAGE);
		  c = num1-num2;
		  JOptionPane.showMessageDialog(null, "The difference is " + c ,"Show results", JOptionPane. INFORMATION_MESSAGE);
		  c = num1*num2;
		  JOptionPane.showMessageDialog(null, "The product is " + c ,"Show results", JOptionPane. INFORMATION_MESSAGE);
		  c = num1/num2;
		  JOptionPane.showMessageDialog(null, "The quotient is " + c ,"Show results", JOptionPane. INFORMATION_MESSAGE);
		System.exit(0);
	  }
}
