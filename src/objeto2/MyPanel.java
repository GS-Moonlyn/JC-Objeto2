package objeto2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image amarelo;
	int xVelocity = 1;
	int x = 0;
	
	MyPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		amarelo = new ImageIcon("amarelo.png").getImage();
		
		
	}
	
	public void paint (Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(amarelo, x, xVelocity, null);
	}
	

}
