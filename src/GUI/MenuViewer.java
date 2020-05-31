package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuViewer extends JFrame {

	public MenuViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Ordernumber");
		model.addColumn("Foodname");
		model.addColumn("Foodprice");
		model.addColumn("Beverage");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
