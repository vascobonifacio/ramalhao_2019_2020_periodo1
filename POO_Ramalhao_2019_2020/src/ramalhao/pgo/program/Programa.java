package ramalhao.pgo.program;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Polygon;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ramalhao.pgo.quadro.Quadro;

public class Programa extends JFrame {

	public static final int LARGURA_QUADRO  = 800;
	public static final int ALTURA_QUADRO = 600;
	
	private Quadro quadro;

	public Programa()
	{
		quadro = new Quadro();    
		
		quadro.setPreferredSize(
				new Dimension(LARGURA_QUADRO, ALTURA_QUADRO));
		 
		// Set the Drawing JPanel as the JFrame's content-pane
		Container cp = getContentPane();
		cp.add(quadro);
		 
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
		pack();              // Either pack() the components; or setSize()
		setTitle("Quadro");  // "super" JFrame sets the title
		setVisible(true);    // "super" JFrame show
	}
	
	// The entry main method
	public static void main(String[] args) 
	{
		// Run the GUI codes on the Event-Dispatching thread for thread safety
		SwingUtilities.invokeLater(new Runnable()
			{
			@Override
			public void run()  {
				Programa p = new Programa();
			}
			});
	}
	
}
