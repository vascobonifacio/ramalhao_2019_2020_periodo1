package ramalhao.pgo.graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JPanel;

import ramalhao.pgo.casa.Casa;

public class Quadro extends JPanel 
{
	private Casa primeiraCasa;
	private Casa segundaCasa;

	public Quadro(Casa primeiraCasa, Casa segundaCasa) {
		super();
		this.primeiraCasa = primeiraCasa;
		this.segundaCasa = segundaCasa;
	}

	// Override paintComponent to perform your own painting
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);     // paint parent's background
		setBackground(Color.WHITE);  // set background color for this JPanel
		
		if(primeiraCasa != null) {
			this.paintCasa(g, primeiraCasa);
		}
		
		if(segundaCasa != null) {
			this.paintCasa(g, segundaCasa);
		}
		
	}
  
	private void paintCasa(Graphics g, Casa casa) 
	{
		Polygon quadrado = new Polygon();
		quadrado.addPoint(casa.getX(), 
				casa.getY());
		quadrado.addPoint(casa.getX() + casa.getLargura(), 
				casa.getY());
		quadrado.addPoint(casa.getX() + casa.getLargura(), 
				casa.getY() + casa.getAltura());
		quadrado.addPoint(casa.getX(), 
				casa.getY() + casa.getAltura());
		  
		Graphics2D g2d = (Graphics2D) g.create();
		  
		g2d.setColor(casa.getCor());
		g2d.fill(quadrado);
		
		Polygon triangulo = new Polygon();
		triangulo.addPoint(casa.getX(), 
				casa.getY());
		triangulo.addPoint(casa.getX() + casa.getLargura(), 
				casa.getY());
		triangulo.addPoint(casa.getX() + casa.getLargura() / 2, 
				casa.getY() - casa.getAlturaDoTelhado());
		
		g2d.setColor(casa.getCorDoTelhado());
		g2d.fill(triangulo);
	}
}