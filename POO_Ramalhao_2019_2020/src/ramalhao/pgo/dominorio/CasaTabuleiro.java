package ramalhao.pgo.dominorio;

public class CasaTabuleiro
{
	private int posicao;
	private boolean ocupada;
	private String jogadorQueOcupa;
	
	public CasaTabuleiro(int posicao)
	{
		this.posicao = posicao;
		ocupada = false;
	}
	
	public boolean isOcupada()
	{
		return ocupada;
	}
	
	public void setOcupada(boolean ocupada) 
	{
		this.ocupada = ocupada;
	}
	
	public void setJogadorQueOcupa(String jogadorQueOcupa) 
	{
		this.ocupada = true;
		this.jogadorQueOcupa = jogadorQueOcupa;
	}
	
	@Override
	public String toString() 
	{
		return "{" + String.format("%02d", posicao) +
				"," +
				(ocupada? jogadorQueOcupa :" ") + "}";
	}
}