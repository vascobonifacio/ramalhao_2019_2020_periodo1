package ramalhao.pgo.dominorio;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

	private List<List<CasaTabuleiro>> casas;
	
	public Tabuleiro(int numeroCasas) {
		
		casas = new ArrayList<>();
		
		int contadorPosicoes = 1;
		
		for(int i = 0; i < numeroCasas; i++) {
			
			List<CasaTabuleiro> linha = new ArrayList<>();
			
			for(int j = 0; j < numeroCasas; j++) {
				CasaTabuleiro casa = new CasaTabuleiro(contadorPosicoes, false);
				contadorPosicoes++;
				linha.add(casa);
			}
			
			casas.add(linha);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[\n");
		
		for(List<CasaTabuleiro> linha: casas) {
			sb.append(linha);
			sb.append("\n");
		}
		
		sb.append("]");

		return sb.toString();
	}

}
