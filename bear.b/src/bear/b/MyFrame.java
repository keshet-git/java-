package bear.b;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	MyFrame() {
		ImageIcon icon = new ImageIcon("bear3.png");
		ImageIcon icon2 = new ImageIcon("polish.png");
		
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(100,200,150,200);
		label.setVisible(false);
				
		button = new JButton();
		button.setBounds(100, 250, 100, 90);
		button.addActionListener(this);
		button.setText("i'm a button!");
		button.setFocusable(false);
		button.setIcon(icon2);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEmptyBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		// TODO Auto-generated method stub

	}
		//^button.addActionListener(e -> System.out.println("who let the dogs out"));
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("who let the dogs out");
			//button.setEnabled(false);
			label.setVisible(true);
		}
		// TODO Auto-generated method stub
		
	}

}
