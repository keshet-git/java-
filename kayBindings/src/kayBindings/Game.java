package kayBindings;

import java.awt.event.*;
import javax.swing.*;

public class Game {

	JFrame frame;
	JLabel label;
	
	Action UpAction;
	Action DownAction;
	Action LeftAction;
	Action RightAction;
	
	Game(){
		
		frame = new JFrame("keyBinding");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		UpAction upAction = new UpAction();
		DownAction downAction = new DownAction();
		LeftAction leftAction = new LeftAction();
		RightAction rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("UpAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("DownAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("LeftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("RightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
		label.setLocation(label.getX(), label.getY()-10);
		}
			
	}
		public class DownAction extends AbstractAction{

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setLocation(label.getX(), label.getY()+10);
			}
			}
			public class LeftAction extends AbstractAction{
				
			@Override
				public void actionPerformed(ActionEvent e) {
					label.setLocation(label.getX()-10, label.getY());
				}
				}
				public class RightAction extends AbstractAction{

					@Override
					public void actionPerformed(ActionEvent e) {
						label.setLocation(label.getX()+10, label.getY());
					}
				}
}
					
				
			
		


	


