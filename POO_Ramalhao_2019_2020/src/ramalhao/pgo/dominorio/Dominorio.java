package ramalhao.pgo.dominorio;

import java.util.Scanner;

public class Dominorio {
	
	//opções que não sejam letras quebram o jogo. vamos aprender isso a resolver isso no 3º período
	
	private static final int numeroCasasPorLado = 8;
	private Tabuleiro tabuleiro;
	private boolean jogoConcluido;
	private boolean jogadorVerticalAtivo;
	private AvaliadorRegras avaliadorRegras;
	
	public Dominorio() {
		tabuleiro = new Tabuleiro(numeroCasasPorLado);
		jogoConcluido = false;
		jogadorVerticalAtivo = true;
		avaliadorRegras = new AvaliadorRegras();
	}
	
	public static void main(String[] args) {
		Dominorio jogo = new Dominorio();
		Scanner scanner = new Scanner(System.in);
		
		while(!jogo.isJogoConcluido()) {
			
			jogo.desenhaTabuleiro();
			
			int opcao = jogo.apresentarOpcoes(scanner);
			
			switch(opcao) {
				case 1:
					jogo.fazerJogada(scanner);
					break;
				case 2:
					jogo.setJogoConcluido(true);
					break;
				case 3:
					System.out.println("Adeus");
					jogo.setJogoConcluido(true);
					break;
				default: 
					System.out.println("Opção desconhecida");
					break;
			}
		}
		
		scanner.close();
	}
	
	private void fazerJogada(Scanner scanner) {
		Jogada jogada = this.lerJogada(scanner);
		
		
	}
	
	private Jogada lerJogada(Scanner scanner) {
		Jogada jogada = null;
		
		if(jogadorVerticalAtivo) 
		{
			System.out.print("Jogador V ativo. Insira primeira posição para jogar:");
			int posicao1 = scanner.nextInt();
			System.out.print("Jogador V ativo. Insira segunda posição para jogar:");
			int posicao2 = scanner.nextInt();
			
			jogada = new Jogada(posicao1, posicao2);
		}
		else {
			System.out.print("Jogador H ativo. Insira primeira posição para jogar:");
			int posicao1 = scanner.nextInt();
			System.out.print("Jogador H ativo. Insira segunda posição para jogar:");
			int posicao2 = scanner.nextInt();
			
			jogada = new Jogada(posicao1, posicao2);
		}
		
		return jogada;
	}
	
	private int apresentarOpcoes(Scanner scanner) {
		if(jogadorVerticalAtivo) {
			System.out.println("Jogador V ativo.");
		}
		else {
			System.out.println("Jogador H ativo.");
		}
		System.out.println("Opções:");
		System.out.println("1 - Fazer jogada");
		System.out.println("2 - Iniciar novo jogo");
		System.out.println("3 - Sair");
		System.out.print("Opção:");
		int opcao = scanner.nextInt();
		
		return opcao;
	}
	
	private void desenhaTabuleiro() {
		System.out.println(tabuleiro);
	}

	private boolean isJogoConcluido() {
		return jogoConcluido;
	}

	private void setJogoConcluido(boolean jogoConcluido) {
		this.jogoConcluido = jogoConcluido;
	}
}
