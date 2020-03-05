package ramalhao.pgo.dominorio;

import java.util.ArrayList;
import java.util.List;

public class Dominorio {
	
	private static final int numeroCasas = 8;
	private Tabuleiro tabuleiro;
	
	public Dominorio() {
		tabuleiro = new Tabuleiro(numeroCasas);
	}
	
	public static void main(String[] args) {
		Dominorio jogo = new Dominorio();
		jogo.inicio();
	}

	private void inicio() {
		desenhaTabuleiro();
	}
	
	private void desenhaTabuleiro() {
		System.out.println(tabuleiro);
	}
	
}
