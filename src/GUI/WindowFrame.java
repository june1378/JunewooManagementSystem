package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	Menuselection menuselection;
	MenuAdder menuadder;
	MenuViewer menuviewer;
	

	public WindowFrame() {
		
		this.menuselection = new Menuselection(this); 
		this.menuadder = new MenuAdder(this);
		this.menuviewer = new MenuViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		revalidate();
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
