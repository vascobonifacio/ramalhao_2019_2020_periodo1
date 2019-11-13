package ramalhao.pgo.graph;
// Using AWT's Graphics and Color
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

// Using Swing's components and containers
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ramalhao.pgo.casa.Casa;
 

public class Figura extends JFrame {

	public static final int CANVAS_WIDTH  = 800;
	public static final int CANVAS_HEIGHT = 600;
	 
	private Quadro canvas;

	public Figura() 
	{ 
		canvas = new Quadro(
				this.createPrimeiraCasa(), 
				this.createSegundaCasa());    
		
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		 
		// Set the Drawing JPanel as the JFrame's content-pane
		Container cp = getContentPane();
		cp.add(canvas);
		 
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
		pack();              // Either pack() the components; or setSize()
		setTitle("......");  // "super" JFrame sets the title
		setVisible(true);    // "super" JFrame show
	}
 

	// The entry main method
	public static void main(String[] args) 
	{
		// Run the GUI codes on the Event-Dispatching thread for thread safety
		SwingUtilities.invokeLater(new Runnable()
			{
			@Override
			public void run() {
				new Figura(); // Let the constructor do the job
				}
			});
	}
	
	private Casa createPrimeiraCasa() 
	{
		Casa casa = new Casa(
				Color.GRAY, 100, 100,
				Color.RED);
		return casa;
	}
	
	private Casa createSegundaCasa() 
	{
		Casa casa = new Casa(
				Color.BLUE, 450, 150,
				Color.YELLOW);
		return casa;
	}
}