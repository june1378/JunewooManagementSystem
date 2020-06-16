package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.Menumanager;
import test.Menuinput;

public class MenuViewer extends JPanel {
	
	WindowFrame frame;
	
	Menumanager menumanager;

	public MenuViewer(WindowFrame frame, Menumanager menumanager) {
		
		this.frame = frame;
		this.menumanager = menumanager;
		
		System.out.println("***"+ menumanager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Ordernumber");
		model.addColumn("Foodname");
		model.addColumn("Foodprice");
		model.addColumn("Beverage");
		
		for(int i=0; i<menumanager.size(); i++) {
			Vector row = new Vector();
			Menuinput si = menumanager.get(i);
			row.add(si.getOrdernumber());
			row.add(si.getFoodname());
			row.add(si.getFoodprice());
			row.add(si.getBeverage());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}
