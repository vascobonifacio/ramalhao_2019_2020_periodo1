package ramalhao.pgo.dominorio;

public class CasaTabuleiro {
	private boolean ocupado;
	private int posicao;
	
	public CasaTabuleiro(boolean ocupado, int posicao) {
		this.ocupado = ocupado;
		this.posicao = posicao;
	}
	
	public boolean getOcupado() {
		return ocupado;
	}
	
	public boolean setOcupado() {
		return ocupado;
	}
	
	public int getPosicao() {
		return posicao;
	}
	
	public int setPosicao() {
		return posicao;
	}
}
