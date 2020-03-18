package ramalhao.pgo.dominorio;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

	private List<List<CasaTabuleiro>> casas;
	private int numeroCasasPorLado;
	
	public Tabuleiro(int numero) {
		
		this.numeroCasasPorLado = numero;
		this.casas = new ArrayList<>();
		
		int contadorPosicoes = 1;
		
		for(int i = 0; i < this.numeroCasasPorLado; i++) {
			
			List<CasaTabuleiro> linha = new ArrayList<>();
			
			for(int j = 0; j < this.numeroCasasPorLado; j++) {
				CasaTabuleiro casa = new CasaTabuleiro(contadorPosicoes);
				contadorPosicoes++;
				linha.add(casa);
			}
			
			casas.add(linha);
		}
	}
	
	public void registarJogada(Jogada jogada, boolean jogadorVerticalAtivo) 
	{		
		CasaTabuleiro casa1 = this.obterCasa(jogada.getPosicao1());
		CasaTabuleiro casa2 = this.obterCasa(jogada.getPosicao2());
		
		if(jogadorVerticalAtivo)
		{
			
		}
	}
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("[\n");
		
		for(List<CasaTabuleiro> linha: casas) {
			sb.append(linha);
			sb.append("\n");
		}
		
		sb.append("]");

		return sb.toString();
	}
	
	public CasaTabuleiro obterCasa(int posicao)
	{
		int x = (posicao - 1) / numeroCasasPorLado;
		int y = (posicao - 1) % numeroCasasPorLado;

		return casas.get(x).get(y);
	}

}
