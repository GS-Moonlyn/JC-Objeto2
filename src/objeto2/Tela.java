package objeto2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela {
	
	JFrame fr;
	JPanel gamePanel;
	
	public Tela() {
		initGUI();
		
	}
	
	public void initGUI() {
		
		fr = new JFrame ("Corrida");
		fr.setLayout(null);
		
		fr.setSize(1000, 500);
		fr.setVisible(true);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new BorderLayout(10, 10));
		
		final JPanel childPanel1 = new JPanel();		
        childPanel1.setBackground(Color.red);
        childPanel1.setPreferredSize(new Dimension(300, 40));
        
        final JPanel childPanel2 = new JPanel();
        childPanel2.setBackground(Color.blue);
        childPanel2.setPreferredSize(new Dimension(800, 600));
        childPanel2.setLocation(100, 230);
		
		
		gamePanel.setSize(80,80);
		gamePanel.setLocation(350, 380);
		gamePanel.setBackground(Color.BLACK);
		
		
		
		fr.add(gamePanel);
		fr.add(childPanel2);
		fr.add(childPanel1);
		
		
	}

}
