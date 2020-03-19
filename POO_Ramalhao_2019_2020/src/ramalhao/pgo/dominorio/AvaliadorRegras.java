package ramalhao.pgo.dominorio;

public class AvaliadorRegras 
{
	private Tabuleiro tabuleiro;
	private int numeroCasasPorLadoTabuleiro; 

	public AvaliadorRegras(Tabuleiro tabuleiro) 
	{
		this.tabuleiro = tabuleiro;
		this.numeroCasasPorLadoTabuleiro = tabuleiro.getNumeroCasasPorLado();
	}
	public boolean validarJogada(
			Jogada jogada,
			boolean jogadorVerticalAtivo) 
	{
		boolean validar = true;
		
		if(!this.validarPosicoesIguais(jogada))
		{
			return false;
		}
		
		if(!this.validarLimites(jogada))
		{
			return false;
		}
		
		if(!this.validarCasasOcupadas(jogada))
		{
			return false;
		}
		
		if(jogadorVerticalAtivo)
		{
			if(!this.validarJogadaVertical(jogada))
			{
				return false;
			}
		}
		else
		{
			if(!this.validarJogadaHorizontal(jogada))
			{
				return false;
			}
		}

		return validar;
	}

	private boolean validarCasasOcupadas(Jogada jogada)
	{
		boolean validar = true;
		
		if(tabuleiro.casaJaOcupada(jogada.getPosicao1()))
		{
			System.out.println("Primeira posição escolhida já ocupada");
			validar = false;
		}
		
		if(tabuleiro.casaJaOcupada(jogada.getPosicao2()))
		{
			System.out.println("Segunda posição escolhida já ocupada");
			validar = false;
		}
		
		return validar;
	}
	
	private boolean validarPosicoesIguais(Jogada jogada)
	{
		boolean validar = true;
		
		if(jogada.getPosicao1() == jogada.getPosicao2())
		{
			System.out.println("Posições iguais");
			validar = false;
		}
		return validar;
	}
	
	private boolean validarLimites(Jogada jogada)
	{
		boolean validar = true;
		int posicaoMax = 
				numeroCasasPorLadoTabuleiro * numeroCasasPorLadoTabuleiro;
		
		if(jogada.getPosicao1() < 1 || jogada.getPosicao1() > posicaoMax )
		{
			System.out.println("Primeira posição fora dos limites");
			validar = false;
		}
		
		if(jogada.getPosicao2() < 1 || jogada.getPosicao2() > posicaoMax )
		{
			System.out.println("Segunda posição fora dos limites");
			validar = false;
		}
		
		return validar;
	}
	
	private boolean validarJogadaHorizontal(Jogada jogada)
	{
		int pos1 = jogada.getPosicao1();
		int pos2 = jogada.getPosicao2();
		
		boolean validar = (pos1 - pos2 == 1 || pos2 - pos1 == 1);
		
		int resto1 = pos1 % numeroCasasPorLadoTabuleiro;
		int resto2 = pos2 % numeroCasasPorLadoTabuleiro;
		
		if(resto1 == 0 && resto2 == 1)
		{
			validar = false;
		}
		if(resto2 == 0 && resto1 == 1)
		{
			validar = false;
		}
		
		if(!validar)
		{
			System.out.println("Jogada inválida");
		}
		
		return validar;
	}
	
	private boolean validarJogadaVertical(Jogada jogada)
	{
		int pos1 = jogada.getPosicao1();
		int pos2 = jogada.getPosicao2();
		
		boolean validar = (pos1 - pos2 == numeroCasasPorLadoTabuleiro || 
				pos2 - pos1 == numeroCasasPorLadoTabuleiro);
		
		if(pos1 <= numeroCasasPorLadoTabuleiro && pos2 <= numeroCasasPorLadoTabuleiro)
		{
			validar = false;
		}
		
		int referencia = (numeroCasasPorLadoTabuleiro * numeroCasasPorLadoTabuleiro) - numeroCasasPorLadoTabuleiro;
		if(pos1 > referencia && pos2 > referencia)
		{
			validar = false;
		}
		
		if(!validar)
		{
			System.out.println("Jogada inválida");
		}
		
		return validar;
	}
}
