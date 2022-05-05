package zad3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;

public class CustSep extends JSeparator {
	

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	int w = getWidth();       
	int h = getHeight();     
	g.setColor(Color.red);    
	g.fillRect(8, h/2-1, w-20, 2);
	} 
}
	
	
	
	

