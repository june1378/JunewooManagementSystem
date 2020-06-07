package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuViewer extends JPanel {
	
	WindowFrame frame;

	public MenuViewer(WindowFrame frame) {
		
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Ordernumber");
		model.addColumn("Foodname");
		model.addColumn("Foodprice");
		model.addColumn("Beverage");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
