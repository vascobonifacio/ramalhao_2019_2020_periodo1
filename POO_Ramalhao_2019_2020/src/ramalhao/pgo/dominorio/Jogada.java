package ramalhao.pgo.dominorio;

public class Jogada {
	
	private int posicao1;
	private int posicao2;
	private boolean jogadaValida;
	
	public Jogada(int posicao1, int posicao2) {
		super();
		this.posicao1 = posicao1;
		this.posicao2 = posicao2;
	}
	
	public boolean isJogadaValida() {
		return jogadaValida;
	}
	
	public void setJogadaValida(boolean jogadaValida) {
		this.jogadaValida = jogadaValida;
	}
	
	public int getPosicao1() {
		return posicao1;
	}
	
	public int getPosicao2() {
		return posicao2;
	}
	
	

}
