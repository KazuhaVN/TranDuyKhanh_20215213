package Lab01;
import javax.swing.JOptionPane;

public class code61part2 {

public static void main(String[] args) { 
	Object[] options = {"I do", "I don't",};
	
	int n = JOptionPane.showOptionDialog(null,"Do you want to change your first class ticket?",
		    null,
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[1]);
	JOptionPane.showMessageDialog(null,"You've chosen: "+(n==JOptionPane.YES_OPTION?"Yes":"No"));
System.exit(0);
}
}
