package zad3;

import java.awt.*;
import javax.swing.Icon;

public class MyIcon implements Icon {
	
	Color c;
	
	MyIcon(Color c) {
	this.c = c;	
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub		 	
	    g.setColor(this.c);
	    g.fillOval(x, y, 16, 16);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 16;
	}
	
	public Color getIconColor() {
		return c;
	}
}
