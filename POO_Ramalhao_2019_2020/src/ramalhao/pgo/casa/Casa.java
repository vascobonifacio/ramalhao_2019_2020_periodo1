package ramalhao.pgo.casa;

import java.awt.Color;

public class Casa {

	private Color cor;
	private int x;
	private int y;
	
	private Telhado telhado;
	
	private static final int LARGURA = 300;
	private static final int ALTURA = 200;

	public Casa(Color cor, int posicaoX, int posicaoY,
			Color corDoTelhado) 
	{
		super();
		this.cor = cor;
		this.x = posicaoX;
		this.y = posicaoY;
		this.telhado = new Telhado(corDoTelhado);
	}
	
	public Color getCor() {
		return cor;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getLargura() {
		return LARGURA;
	}

	public int getAltura() {
		return ALTURA;
	}
	
	public Color getCorDoTelhado() {
		return telhado.getCor();
	}
	
	public int getAlturaDoTelhado() {
		return telhado.getAltura();
	}
}
