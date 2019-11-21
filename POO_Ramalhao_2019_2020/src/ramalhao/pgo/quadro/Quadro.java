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

import ramalhao.pgo.quadro.figuras.Triangulo;
import ramalhao.pgo.quadro.figuras.Pentagono;
import ramalhao.pgo.quadro.figuras.Point;
import ramalhao.pgo.quadro.figuras.Quadrilatero;

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
			Point ponto1 = new Point(345, 145);
			Point ponto2 = new Point(744, 377);
			Point ponto3 = new Point(372, 377);
						
			Triangulo t = new Triangulo(ponto1, ponto2, ponto3);
			g2d.fill(t.getPolygon());
			
			
//			TODO inicializar pontos, criar triangulo numa variável chamada t, 
//			depois descomentar a linha abaixo
//			g2d.fill(t.getPolygon());
		}
		else if (RECTANGULO.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.yellow);
			Point ponto1 = new Point(250, 250);
			Point ponto2 = new Point(750, 250);
			Point ponto3 = new Point(750, 500);
			Point ponto4 = new Point(250, 500);
						
			Quadrilatero r = new Quadrilatero(ponto1, ponto2, ponto3, ponto4);
			g2d.fill(r.getPolygon2());
			
//			TODO inicializar pontos, criar quadrilatero numa variável chamada q, 
//			depois descomentar a linha abaixo
//			g2d.fill(q.getPolygon());
		}	
		else if (QUADRADO.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.RED);
			Point ponto1 = new Point(150, 150);
			Point ponto2 = new Point(300, 150);
			Point ponto3 = new Point(150, 300);
			Point ponto4 = new Point(300, 300);
						
			Quadrilatero q = new Quadrilatero(ponto1, ponto2, ponto3, ponto4);
			g2d.fill(q.getPolygon1());
			
//			TODO inicializar pontos, criar quadrilatero numa variável chamada q, 
//			depois descomentar a linha abaixo
//			g2d.fill(q.getPolygon());
		}	
		else if (CASA.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.gray);
			Point ponto1 = new Point(350, 150);
			Point ponto2 = new Point(350, 319);
			Point ponto3 = new Point(291, 331);
			Point ponto4 = new Point(409, 331);
			Point ponto5 = new Point(445, 219);
						
			Pentagono q = new Pentagono(ponto1, ponto2, ponto3, ponto4, ponto5);
			g2d.fill(q.getPolygon());
			
//			TODO inicializar pontos, criar pentagono numa variável chamada p, 
//			depois descomentar a linha abaixo
//			g2d.fill(p.getPolygon());
		}
		else if(PENTAGONO_EQUIL.equals(textoForma)) 
		{
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setColor(Color.BLUE);
			Point ponto1 = new Point(350, 150);
			Point ponto2 = new Point(255, 219);
			Point ponto3 = new Point(291, 331);
			Point ponto4 = new Point(409, 331);
			Point ponto5 = new Point(445, 219);
						
			Pentagono q = new Pentagono(ponto1, ponto2, ponto3, ponto4, ponto5);
			g2d.fill(q.getPolygon());
			
//			TODO inicializar pontos, criar pentagono numa variável chamada p, 
//			depois descomentar a linha abaixo
//			g2d.fill(p.getPolygon());
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
