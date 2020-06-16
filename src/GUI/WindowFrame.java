package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MenuManagement;
import manager.Menumanager;

public class WindowFrame extends JFrame {
	
	Menumanager menumanager;
	Menuselection menuselection;
	MenuAdder menuadder;
	MenuViewer menuviewer;
	
	

	public WindowFrame(Menumanager menumanager) {
		
		this.menumanager = menumanager;  // ¹¹°¡ ¹®Á¦Áö?
		menuselection = new Menuselection(this); 
	    menuadder = new MenuAdder(this);
		menuviewer = new MenuViewer(this, this.menumanager);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setupPanel(menuselection);
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
		}
	
	
	public Menuselection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(Menuselection menuselection) {
		this.menuselection = menuselection;
	}

	public MenuAdder getMenuadder() {
		return menuadder;
	}

	public void setMenuadder(MenuAdder menuadder) {
		this.menuadder = menuadder;
	}

	public MenuViewer getMenuviewer() {
		return menuviewer;
	}

	public void setMenuviewer(MenuViewer menuviewer) {
		this.menuviewer = menuviewer;
	}

}
