package ramalhao.pgo.dominorio;

public class CasaTabuleiro {
	private int posicao;
	private boolean ocupada;
	
	public CasaTabuleiro(int posicao, boolean ocupada) {
		this.posicao = posicao;
		this.ocupada = ocupada;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	@Override
	public String toString() {
		return "{" + String.format("%02d", posicao) +
				"," +
				(ocupada?"X":" ") + "}";
	}
}
