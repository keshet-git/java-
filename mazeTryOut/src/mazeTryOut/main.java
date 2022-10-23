package mazeTryOut;

import java.awt.Color;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
	
	
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setBackground(Color.BLACK);
		frame.setLocationRelativeTo(null);
		
		
		int maze [][] = {{1,1,1,0,1,1,1,1,1,1},
						{1,0,0,0,0,0,0,0,0,1},
						{1,0,1,1,1,1,0,1,0,1},
						{1,0,0,0,1,0,0,1,0,1},
						{1,0,1,0,1,1,0,1,0,1},
						{1,0,0,0,0,0,1,0,0,1},
						{1,1,1,1,1,0,1,1,1,1},
						{1,0,1,0,1,0,1,1,0,1},
						{1,0,0,0,0,0,0,0,0,1},
						{1,1,1,1,1,1,1,0,1,1}};
		
		frame.setVisible(true);
		System.out.println(maze);
						}
	
	
				// TODO Auto-generated method stub

	}


