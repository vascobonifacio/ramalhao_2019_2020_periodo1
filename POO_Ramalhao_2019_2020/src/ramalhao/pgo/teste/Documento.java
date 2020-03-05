package ramalhao.pgo.teste;

import java.util.Date;

public class Documento 
{
	private String[] autores;
	private Date data;
	private int posicaoUltimoAutor;

	public String[] getAutores() 
	{
		return this.autores;
	}
	
	public void addAutor(String nome) 
	{
		autores[posicaoUltimoAutor] = nome;
		posicaoUltimoAutor++;
	}
	
	public Date getData()
	{
		return this.data;
	}

}
