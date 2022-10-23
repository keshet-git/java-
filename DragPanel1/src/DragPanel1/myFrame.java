package DragPanel1;

import javax.swing.JFrame;

public class myFrame extends JFrame{
	DragPanel dragPanel = new DragPanel();
	
	myFrame(){
		
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		// TODO Auto-generated method stub

	}

}
