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

public class Quadro extends JPanel {
	
	private static final String QUADRADO = "Quadrado";
    private static final String TRIANGULO = "Triangulo";
    private static final String RECTANGULO = "Rectangulo";
    private static final String LINHA = "Linha";
    private static final String CASA = "Casa";
    
    private static final String[] FORMAS = { QUADRADO, TRIANGULO, RECTANGULO, LINHA, CASA };
    
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
		
		if (QUADRADO.equals(textoForma)) {
			g.setColor(Color.BLUE);
            g.fillRect(25, 25, 50, 50); 
		}
		else if(TRIANGULO.equals(textoForma)) {
			Graphics2D g2d = (Graphics2D) g.create();
			  
			g2d.setColor(Color.RED);
			g2d.fill( variavel da figura);
			
		}
            
            // TODO: livrarem-se dos números mágicos, usarem a classe polygon
            /*
             * 
             * Graphics2D g2d = (Graphics2D) g.create();
		  
				g2d.setColor(Color.RED);
				g2d.fill( variavel da figura);
             * 
             */
        
	}
	
	private class RadioBtnListenerFormas implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	textoForma = e.getActionCommand();
            repaint();
        }
    }
}
