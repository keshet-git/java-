package menuBar;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class myFrame extends JFrame implements ActionListener{
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem laodItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	 myFrame(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(500,500);
			this.setLayout(new FlowLayout());
			
			menuBar = new JMenuBar();
			
			fileMenu = new JMenu("File");
			editMenu = new JMenu("Edit");
			helpMenu = new JMenu("Help");
			
			laodItem = new JMenuItem("Load");
			saveItem = new JMenuItem("Save");
			exitItem = new JMenuItem("Exit");
			
			laodItem.addActionListener(this);
			saveItem.addActionListener(this);
			exitItem.addActionListener(this);
			
			fileMenu.setMnemonic(KeyEvent.VK_L);
			editMenu.setMnemonic(KeyEvent.VK_S);
			helpMenu.setMnemonic(KeyEvent.VK_E);
			laodItem.setMnemonic(KeyEvent.VK_L);
			saveItem.setMnemonic(KeyEvent.VK_S);
			exitItem.setMnemonic(KeyEvent.VK_E);
			
			fileMenu.add(laodItem);
			fileMenu.add(saveItem);
			fileMenu.add(exitItem);
			
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			menuBar.add(helpMenu);
			this.setJMenuBar(menuBar);
			this.setVisible(true);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==laodItem) {
			System.out.println("*beep boop* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*beep boop* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}

}
