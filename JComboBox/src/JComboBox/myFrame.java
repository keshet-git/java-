package JComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
	}
		JComboBox comboBox;
		
		myFrame(){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			String[] animals = {"dog","cat","bird"};
			
			comboBox = new JComboBox(animals);
			comboBox.addActionListener(this);
			
			//comboBox.setEditable(true);
			//System.out.println(comboBox.getItemCount());
			//comboBox.addItem("Hours");
			//comboBox.insertItemAt("pig", 0);
			//comboBox.setSelectedItem(0);
			//comboBox.removeItem("cat");
			//comboBox.removeItemAt(0);
			//comboBox.removeAllItems();
			
			this.add(comboBox);
			this.pack();
			this.setVisible(true);
		}
		// TODO Auto-generated method stub

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox);
		//System.out.println(comboBox.getSelectedIndex());
		//System.out.println(comboBox.getSelectedItem());
	}
		// TODO Auto-generated method stub
		
	}