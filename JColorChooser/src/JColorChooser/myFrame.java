package JColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements ActionListener{

	
		JButton button;
		JLabel label;
		
		myFrame(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			button = new JButton("pick a color");
			button.addActionListener(this);
			
			label = new JLabel();
			label.setBackground(Color.white);
			label.setText("this is some text :D");
			label.setFont(new Font("MV Boli",Font.PLAIN,100));
			label.setOpaque(true);
			
			this.add(button);
			this.add(label);
			this.pack();
			this.setVisible(true);
		}
		// TODO Auto-generated method stub

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			Color color = JColorChooser.showDialog(null, "pick a color...I guess",Color.black);
			
			label.setBackground(color);
		}
		
	}

}
