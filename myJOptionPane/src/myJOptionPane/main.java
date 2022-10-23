package myJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
		//JOptionPane.showInternalMessageDialog(null, "This is sume useless info", "titel", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showInternalMessageDialog(null, "Here is more useless info", "titel", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showInternalMessageDialog(null, "really?", "titel", JOptionPane.QUESTION_MESSAGE);
		//while(true) {
		//JOptionPane.showInternalMessageDialog(null, "You're computer has A VIROS!!", "titel", JOptionPane.WARNING_MESSAGE);
		//}
		//JOptionPane.showInternalMessageDialog(null, "Call tech support NOW OR ELSE!!!", "titel", JOptionPane.ERROR_MESSAGE);

		//JOptionPane.showConfirmDialog(null, "bro do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);
		//String name = JOptionPane.showInputDialog("what is you'r name?: ");
		//System.out.println("Hello " + name);
		String[] responses = {"No, you'r awesome!", "thenk you!","*blush*"};
		ImageIcon icon = new ImageIcon("deer.png");
		
		JOptionPane.showOptionDialog(
				null, 
				"you'r awesome!", 
				"secret message",
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
	}

}
