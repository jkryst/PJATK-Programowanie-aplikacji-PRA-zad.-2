/**
 *
 *  @author Kryst Jakub PD3724
 *
 */

package zad3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main implements ActionListener  {

	File f;
	
	private NotepadGUI gui;
	String szkoła = "ul. Szkolna 1, 00-000 Warszawa";
	String praca = "ul. Pracowa 1, 00-00 Warszawa";
	String dom = "ul. Domowa 1, 00-000 Warszawa";
	static int[] fonts = {8, 10, 12, 14 , 16, 18, 20, 22, 24};
	static String[] colors = {"Blue", "Yellow", "Orange", "Red", "White", "Black", "Green"};
	static Icon[] icons = {new MyIcon(Color.BLUE),new MyIcon(Color.YELLOW),new MyIcon(Color.ORANGE),new MyIcon(Color.RED),
				new MyIcon(Color.WHITE),new MyIcon(Color.BLACK),new MyIcon(Color.GREEN)};
	
	JFileChooser fc = new JFileChooser(new File("."));
	FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt files", "txt");

	public Main() {
		this.gui = new NotepadGUI(this, colorChanger, fontChanger, adresy, f);
	}

	
	public static void main(String[] args) {
	    new Main();
		  }
	
	public void readFile(File f) {
		   gui.ta.setText(null);
 	       gui.setTitle(f.getName());
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null) {
				gui.ta.append(line);
				gui.ta.append("\n");
			}
			
			br.close();
		} catch (java.io.FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public void openFile() {
        
	    fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
     	   f = fc.getSelectedFile();
     	   readFile(f);
     	   fc.setCurrentDirectory(f);
   
        }
	}
	
	public void saveFile(File f) {

		  try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
					
			bw.write(gui.ta.getText());
			bw.close();

		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void saveAs() {
	
	     fc.setFileFilter(filter);
	     File nf;
		 
	        int returnVal = fc.showSaveDialog(null);
	        if(returnVal == JFileChooser.APPROVE_OPTION) {

	        	String filename = fc.getSelectedFile().toString();     
	        	
	        	if (!filename .endsWith(".txt")) {
	        		nf = new File(filename+".txt");
	                
	        	} else {
	        		nf = new File(filename);	
	        	}
	        	saveFile(nf);
	        	fc.setCurrentDirectory(nf);


	        	if (f != null) {
	        	} else {
	        		readFile(nf);
	        		f=nf;
	        	}
	        }	
	}
	
	
	
	private ActionListener colorChanger = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JComponent c = (JComponent) e.getSource();
			Icon i = ((AbstractButton) c).getIcon();
			Color col = ((MyIcon) i).getIconColor();
			String r = (String) c.getClientProperty(gui.ta);
			
			if(r.equals("background")) {
				gui.ta.setBackground(col);
			}
			if(r.equals("foreground")) {
				gui.ta.setForeground(col);
			}
		   }
		};
		
		
	private ActionListener fontChanger = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		JComponent c = (JComponent) e.getSource();
		int i = (int) c.getClientProperty(NotepadGUI.ta);
		NotepadGUI.ta.setFont(new Font("Serif", Font.PLAIN, i));
		
		}
	};
		
		
	private ActionListener adresy = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		String s = e.getActionCommand();
		if (s.equals("Praca")) {
			gui.ta.append(praca);
		} else if (s.equals("Szkoła")) {
			gui.ta.append(szkoła);
			} else if (s.equals("Dom")){
				NotepadGUI.ta.append(dom);
		}
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String s = e.getActionCommand();
		if (s.equals("Open")) {
			openFile();

		} else if ((s.equals("Save"))) {
	
			if(f != null) {		
			saveFile(f);	
			} else {
			saveAs();	
			}

		} else if ((s.equals("Save As..."))) {
	      saveAs();
	      
		} else if ((s.equals("Exit"))) {
		  System.exit(0);
			
		}
	}
}
