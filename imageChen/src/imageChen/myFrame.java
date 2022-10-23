package imageChen;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myFrame extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon deer;
	ImageIcon sheep;
	ImageIcon brifcase;
	ImageIcon fp;
		// TODO Auto-generated method stub

	
	myFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		brifcase = new ImageIcon("Brifcase.png");
		deer = new ImageIcon("deer.png");
		sheep = new ImageIcon("sheep.png");
		fp = new ImageIcon("fp.png");
		
		label.setIcon(brifcase);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(fp);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(sheep);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setIcon(deer);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(brifcase);
		
	}

}
