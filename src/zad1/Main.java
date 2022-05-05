/**
 *
 *  @author Kryst Jakub PD3724
 *
 */

package zad1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main extends JFrame {

	public Main() {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				createGui();
			}
		});			
		}
		
				
	protected void createGui() {
		
	
		setTitle("Okno");
		setLayout(new BorderLayout(20, 20));
		
		add(nowaEt("Etykieta 1", Color.BLUE, Color.YELLOW, "Times New Roman", 30, "Podpowiedz nr 1", BorderFactory.createLineBorder(Color.CYAN)), "West");
		add(nowaEt("Etykieta nr2", Color.WHITE, Color.BLACK, "Arial", 20, "To jest podpowiedz nr 2", BorderFactory.createEtchedBorder()), "North");
		add(nowaEt("Etykieta trzecia", Color.GREEN, Color.DARK_GRAY, "Monotype Corsiva", 35, "Trzecia podpowiedz", BorderFactory.createLineBorder(Color.YELLOW, 5)), "East");
		add(nowaEt("Czwarta Etykieta", Color.BLACK, Color.WHITE, "Comic Sans MS", 27, "Podpowiedz czwarta", BorderFactory.createTitledBorder("Ramka")), "South");
		add(nowaEt("Etykieta V", Color.RED, Color.BLUE, "Sans Serif", 45, "IV Podpowiedz", BorderFactory.createBevelBorder(1, Color.MAGENTA, Color.CYAN)), "Center");
	

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	

JLabel nowaEt(String txt, Color koltekstu, Color tlo, String nazwaczc, int wielkczc, 
		String podpowiedz, Border ramka) {
	JLabel e = new JLabel(txt, SwingConstants.CENTER);
	e.setOpaque(true);
	e.setFont(new Font(nazwaczc, Font.PLAIN, wielkczc));
	e.setBackground(tlo);
	e.setForeground(koltekstu);
	e.setToolTipText(podpowiedz);
	e.setBorder(ramka);
	return e;

}
	
  public static void main(String[] args) {
	  
	  new Main();

  }
}
