package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MenuAdder extends JPanel {
	
	WindowFrame frame;
	
	public MenuAdder(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelordernumber = new JLabel("Ordernumber: ", JLabel.TRAILING);
		JTextField fieldordernumber = new JTextField(10);
		labelordernumber.setLabelFor(fieldordernumber);//label�� txtfield�� �־��ִ�
		panel.add(labelordernumber);
		panel.add(fieldordernumber);
		
		JLabel labelfoodname = new JLabel("Foodname: ", JLabel.TRAILING);
		JTextField fieldfoodname = new JTextField(10);
		labelfoodname.setLabelFor(fieldfoodname);//label�� txtfield�� �־��ִ�
		panel.add(labelfoodname);
		panel.add(fieldfoodname);

		JLabel labelfoodprice = new JLabel("Foodprice: ", JLabel.TRAILING);
		JTextField fieldfoodprice = new JTextField(10);
		labelfoodprice.setLabelFor(fieldfoodprice);//label�� txtfield�� �־��ִ�
		panel.add(labelfoodprice);
		panel.add(fieldfoodprice);
		
		JLabel labelbeverage = new JLabel("Beverage: ", JLabel.TRAILING);
		JTextField fieldbeverage = new JTextField(10);
		labelbeverage.setLabelFor(fieldbeverage);//label�� txtfield�� �־��ִ�
		panel.add(labelbeverage);
		panel.add(fieldbeverage);
		
		panel.add(new JButton("����"));
		panel.add(new JButton("���"));

		SpringUtility.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
	

}
