package ramalhao.pgo.casa;

import java.awt.Color;

public class Telhado {
	
	private Color cor;
	
	private static final int ALTURA = 50;

	public Color getCor() {
		return cor;
	}
	
	public int getAltura() {
		return ALTURA;
	}

	public Telhado(Color cor) {
		super();
		this.cor = cor;
	}

}
