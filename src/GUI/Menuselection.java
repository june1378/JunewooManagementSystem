package GUI;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menuselection extends JFrame{
	
	public Menuselection() {
		this.setSize(300, 300);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu selection");
		JButton button1 = new JButton("Add food");
		JButton button2 = new JButton("Delete food");
		JButton button3 = new JButton("Edit food");
		JButton button4 = new JButton("View food");
		JButton button5 = new JButton("Exit");
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}
