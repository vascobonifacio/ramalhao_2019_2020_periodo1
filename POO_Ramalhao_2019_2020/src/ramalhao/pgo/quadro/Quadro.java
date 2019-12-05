package ramalhao.pgo.quadro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import ramalhao.pgo.program.Pentagono;
import ramalhao.pgo.program.Point;
import ramalhao.pgo.program.Quadrilatero;
import ramalhao.pgo.program.Triangulo;

public class Quadro extends JPanel {
	
	private static final String QUADRADO = "Quadrado";
    private static final String TRIANGULO = "Triangulo";
    private static final String RECTANGULO = "Rectangulo";
    private static final String CASA = "Casa";
    private static final String PENTAGONO_EQUIL = "Pentagono Equilátero";
    
    private static final String[] FORMAS = { QUADRADO, TRIANGULO, RECTANGULO, CASA, PENTAGONO_EQUIL };
    
    private String textoForma = "";
    
    private ButtonGroup buttonGroupFormas = new ButtonGroup();

    public Quadro() {
    	
    	RadioBtnListenerFormas radioBtnListenerFormas = new RadioBtnListenerFormas();
        JPanel panelFormas = new JPanel();
        
        for (String shape : FORMAS) 
        {
            JRadioButton rBtn = new JRadioButton(shape);
            rBtn.setOpaque(false);
            rBtn.setActionCommand(shape);
            rBtn.addActionListener(radioBtnListenerFormas);
            panelFormas.add(rBtn);
            buttonGroupFormas.add(rBtn);
        }
        panelFormas.setOpaque(false);
        setLayout(new BorderLayout());
        add(panelFormas, BorderLayout.PAGE_START);
    }
	
	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		setBackground(Color.WHITE);
		
		if (TRIANGULO.equals(textoForma))
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.green);
			
			Point p1 = new Point(150,150);
			Point p2 = new Point(250,300);
			Point p3 = new Point(50,300);
			
			
			Triangulo t = new Triangulo(p1,p2,p3);
			g2d.fill(t.getPolygon());
		}
		else if (RECTANGULO.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.yellow);
			
			Point p1 = new Point(100,100);
			Point p2 = new Point(500,100);
			Point p3 = new Point(500,300);
			Point p4 = new Point(100,300);
			
			Quadrilatero q = new Quadrilatero(p1,p2,p3,p4);
			g2d.fill(q.getPolygon());
		}	
		else if (QUADRADO.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.RED);
			
			Point p1 = new Point(100,100);
			Point p2 = new Point(300,100);
			Point p3 = new Point(300,300);
			Point p4 = new Point(100,300);
		
			
		Quadrilatero q = new Quadrilatero(p1,p2,p3,p4);
		g2d.fill(q.getPolygon());
		}	
		else if (CASA.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.gray);
			
			Point p1 = new Point(150,100);
			Point p2 = new Point(250,200);
			Point p3 = new Point(250,350);
			Point p4 = new Point(50,350);
			Point p5 = new Point(50,200);
			
			
			Pentagono p = new Pentagono(p1,p2,p3,p4,p5);
			g2d.fill(p.getPolygon());
		}
		else if(PENTAGONO_EQUIL.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.BLUE);
			
			Point p1 = new Point(100,50);
			Point p2 = new Point(150,100);
			Point p3 = new Point(125,150);
			Point p4 = new Point(75,150);
			Point p5 = new Point(50,100);
			
			
			Pentagono p = new Pentagono(p1,p2,p3,p4,p5);
			g2d.fill(p.getPolygon());
		}
	}
	
	class RadioBtnListenerFormas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	textoForma = e.getActionCommand();
            repaint();
        }
    }
}
