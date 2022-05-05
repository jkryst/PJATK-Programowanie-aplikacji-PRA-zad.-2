package zad3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NotepadGUI extends JFrame  {
	
	final public static JTextArea ta = new JTextArea();
	
	

	public NotepadGUI(ActionListener a, ActionListener b, ActionListener c, ActionListener d, File f) {

		SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        createNotepadGUI(a, b, c, d, f);
		      }
		    });
	}

	public void createNotepadGUI(ActionListener fileOptions, ActionListener colorChanger, ActionListener fontChanger, ActionListener adresy, File f) {
		
		setTitle("Bez tytułu");
		
		JMenuBar menu = new JMenuBar();
		
		JMenu file = newMenuTitle("File");
		file.add(newJMenuItemF("Open", 'o', "control O", fileOptions));
		file.add(newJMenuItemF("Save", 's', "control S", fileOptions));
		file.add(newJMenuItemF("Save As...", 'a', "control A", fileOptions));
	
		CustSep sep = new CustSep();
		sep.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		sep.setPreferredSize(new Dimension(100,10));
		file.add(sep);
		
		file.add(newJMenuItemF("Exit", 'e', "control E", fileOptions));
		menu.add(file);
		
		JMenu edit = newMenuTitle("Edit");
		JMenu eadresy = newMenu("Adresy");
		      eadresy.add(newJMenuItemMA("Praca", 'p', "control shift P", adresy));
		      eadresy.add(newJMenuItemMA("Szkoła", 's', "control shift S", adresy));     
		      eadresy.add(newJMenuItemMA("Dom", 'd', "control shift D", adresy));
		     
		edit.add(eadresy);      
		menu.add(edit);
		
		JMenu options = newMenuTitle("Options");
		JMenu foregrcol = newMenu("Foreground");
		  for (int i=0; i<Main.colors.length; i++) {
			  foregrcol.add(newJMenuItemColor(ta, "foreground", Main.colors[i], Main.icons[i], colorChanger));
		  }
		options.add(foregrcol);
		
		JMenu backgrcol = newMenu("Backgound");
		  for (int i=0; i<Main.colors.length; i++) {
			  backgrcol.add(newJMenuItemColor(ta, "background", Main.colors[i], Main.icons[i], colorChanger));
		  }
		options.add(backgrcol);
		
		JMenu font = newMenu("Fontsize");
		  for (int i=0; i<Main.fonts.length; i++) {
			  font.add(newJMenuItemFont(ta, Main.fonts[i]+" pts", Main.fonts[i], fontChanger));
		  }
		options.add(font);
		menu.add(options);
	
		setJMenuBar(menu);

		add(ta);
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
	
		setSize(500, 500);
        setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	
	public JMenu newMenuTitle(String s) {
		JMenu m = new JMenu(s);
		return m;
	}
	
	public JMenu newMenu(String s) {
		JMenu m = new JMenu(s);
		m.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return m;
	}
	
	
	
	
	public JMenuItem newJMenuItemF(String s, int m, String a, ActionListener fileOptions) {
		JMenuItem it = new JMenuItem(s);
		it.addActionListener(fileOptions);
		it.setAccelerator(KeyStroke.getKeyStroke(a));;
		it.setMnemonic(m);
		it.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return it;
	}
	
	public JMenuItem newJMenuItemMA(String s, int m, String a, ActionListener adresy) {
		JMenuItem it = new JMenuItem(s);
		it.addActionListener(adresy);
		it.setAccelerator(KeyStroke.getKeyStroke(a));;
		it.setMnemonic(m);
		it.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return it;
	}
	

	public JMenuItem newJMenuItemFont(Component p, String s, int i, ActionListener fontChanger) {
		JMenuItem it = new JMenuItem(s);
		it.addActionListener(fontChanger);
		it.putClientProperty(p, i);
		it.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return it;
	}
	
    public JMenuItem newJMenuItemColor(Component p, String r, String s, Icon i, ActionListener colorChanger) {
    	JMenuItem it = new JMenuItem(s, i);
    	it.addActionListener(colorChanger);
    	it.putClientProperty(p, r);
    	it.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return it;
	}
	
    public JMenuItem newJMenuItem(String s) {
    	JMenuItem it = new JMenuItem(s);
    	it.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		return it;
	
	}

	public void openFile(File f) {
		
	}
}
