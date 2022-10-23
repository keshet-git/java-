package JClickBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox chekbox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	myFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton();
		button.setText("subbmit");
		button.addActionListener(this);
		
		chekbox = new JCheckBox();
		chekbox.setText("I'm not a roobot");
		chekbox.setFocusable(false);
		chekbox.setFont(new Font("Consolas",Font.PLAIN,35));
		chekbox.setIcon(xIcon);
		chekbox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(chekbox);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		
		
	}

}
