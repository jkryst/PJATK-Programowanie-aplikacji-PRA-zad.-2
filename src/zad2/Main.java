/**
 *
 *  @author Kryst Jakub PD3724
 *
 */

package zad2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import javax.swing.*;


public class Main extends JFrame implements ActionListener {
	
    int i = 1;
    JButton b = new JButton("Przycisk zmieniający kolory");
    Color[] colors = {Color.BLUE, Color.GREEN, Color.YELLOW, Color.BLACK, Color.MAGENTA, Color.CYAN, Color.ORANGE, Color.RED};
    
	public Main() {
	
        add(b);
        b.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        b.addActionListener(this);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
     
        setResizable(false);
		setSize(400, 100);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	
	public void changeColor(JButton b) {
		
		
		Color c = colors[i];
		b.setBackground(c);
		i++;
		if (i>7) i=0;
		
		if (b.getBackground().equals(Color.BLUE)|b.getBackground().equals(Color.BLACK)|
				b.getBackground().equals(Color.MAGENTA)|b.getBackground().equals(Color.RED)) {
			b.setForeground(Color.WHITE);
		} else {
			b.setForeground(Color.BLACK);
		}
		
	}
	


	
	  public static void main(String[] a) {
		    SwingUtilities.invokeLater(new Runnable() {

		      public void run() {
		        new Main();
		      }
		    });
		  }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		changeColor(b);
		
	}



}
