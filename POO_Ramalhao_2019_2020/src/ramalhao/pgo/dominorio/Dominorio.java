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
		this.tabuleiro = new Tabuleiro(numeroCasasPorLado);
		this.jogoConcluido = false;
		this.jogadorVerticalAtivo = true;
		this.avaliadorRegras = new AvaliadorRegras(this.tabuleiro);
	}
	
	public static void main(String[] args) {
		Dominorio jogo = new Dominorio();
		Scanner scanner = new Scanner(System.in);
		
		while(!jogo.isJogoConcluido()) {
			
			jogo.desenhaTabuleiro();
			
			int opcao = jogo.apresentarOpcoes(scanner);
			
			switch(opcao) {
				case 1:
					//fazer a jogada
					jogo.fazerJogada(scanner);
					//verificar se o jogo acabou
					jogo.verificarFimJogo();
					break;
				case 2:
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
	
	private void desenhaTabuleiro() {
		System.out.println(this.tabuleiro);
	}

	private int apresentarOpcoes(Scanner scanner) {
		if(this.jogadorVerticalAtivo) {
			System.out.println("Jogador V ativo.");
		}
		else {
			System.out.println("Jogador H ativo.");
		}
		System.out.println("Opções:");
		System.out.println("1 - Fazer jogada");
		System.out.println("2 - Sair");
		System.out.print("Opção:");
		int opcao = scanner.nextInt();
		
		return opcao;
	}
	
	private void fazerJogada(Scanner scanner) {
		//ler a jogada
		Jogada jogada = this.lerJogada(scanner);
		
		//validar a jogada
		if(this.avaliadorRegras.validarJogada(jogada, this.jogadorVerticalAtivo))
		{
			//registar a jogada no tabuleiro
			this.tabuleiro.registarJogada(jogada, this.jogadorVerticalAtivo);
			
			//mudar o jogador ativo
			this.jogadorVerticalAtivo = ! this.jogadorVerticalAtivo;
		}
	}
	
	private Jogada lerJogada(Scanner scanner) {
		Jogada jogada = null;
		
		if(this.jogadorVerticalAtivo) 
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
	
	private void verificarFimJogo()
	{
		if(!this.tabuleiro.existemJogadasDisponiveis(this.jogadorVerticalAtivo))
		{
			this.desenhaTabuleiro();
			System.out.println("Fim do jogo.");
			if(this.jogadorVerticalAtivo)
			{
				System.out.println("Vencedor é o jogador H.");
			}
			else
			{
				System.out.println("Vencedor é o jogador V.");
			}
			this.jogoConcluido = true;
		}
	}

	private boolean isJogoConcluido() {
		return this.jogoConcluido;
	}

	private void setJogoConcluido(boolean jogoConcluido) {
		this.jogoConcluido = jogoConcluido;
	}
}
