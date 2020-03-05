package ramalhao.pgo.dominorio;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	
	List<List<CasaTabuleiro>> casas;
	
	public Tabuleiro() {
		casas = new ArrayList<>();
		int contadorPosicoes = 1;
		int N = 8;
		for(int i=0; i < N; i ++) {
			List<CasaTabuleiro> linha = new ArrayList<>();
			for(int j=0; j < N; j ++) {
				CasaTabuleiro casa = new CasaTabuleiro(false, contadorPosicoes);
				contadorPosicoes ++;
				linha.add(casa);
			}
			casas.add(linha);
		}
		
	}
	
	public boolean fazerJogada() {
		return false;
	}
	
	public void desenha() {
		
	}
}
