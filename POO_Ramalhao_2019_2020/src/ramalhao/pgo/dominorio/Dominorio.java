package ramalhao.pgo.dominorio;

import java.util.Scanner;

public class Dominorio {
	
	private static final int numeroCasas = 8;
	private Tabuleiro tabuleiro;
	private boolean jogoConcluido;
	private boolean jogadorVerticalAtivo;
	
	
	public Dominorio() {
		tabuleiro = new Tabuleiro(numeroCasas);
		jogoConcluido = false;
		jogadorVerticalAtivo = true;
	}
	
	public static void main(String[] args) {
		Dominorio jogo = new Dominorio();
		
		while(!jogo.isJogoConcluido()) {
			
			jogo.desenhaTabuleiro();
			
		}
	}
	
	private void lerJogada() {

		if(jogadorVerticalAtivo) {
			System.out.println("Jogador V ativo. Insira primeira posição para jogar:");
			Scanner scan = new Scanner(System.in);
			int posicao1 = scan.nextInt();
			System.out.println("Jogador V ativo. Insira segunda posição para jogar:");
			int posicao2 = scan.nextInt();
		}
		else {
			
		}
		
		
	}
	
	private void desenhaTabuleiro() {
		System.out.println(tabuleiro);
		jogoConcluido = true;
	}

	private boolean isJogoConcluido() {
		return jogoConcluido;
	}

	private void setJogoConcluido(boolean jogoConcluido) {
		this.jogoConcluido = jogoConcluido;
	}
}
