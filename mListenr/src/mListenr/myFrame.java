package mListenr;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements MouseListener{

	JLabel label;
	
	
	myFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.blue);
		label.setVisible(true);
		label.setOpaque(true);
		this.addMouseListener(this);
		
		this.add(label);
		this.setVisible(true);
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("You Clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("You pressed the mouse");	// TODO Auto-generated method stub
		label.setBackground(Color.green);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You relessed the mouse");// TODO Auto-generated method stub
		label.setBackground(Color.black);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You entered the component");
		label.setBackground(Color.PINK);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You exset the mouse");
		label.setBackground(Color.blue);
	}

}
