package ramalhao.pgo.arrays;

import java.util.ArrayList;

public class Empresa {
	
	public static void main(String[] args)
	{	
		int [] valores = {1, 4, 9, 16, 25, 36, 49, 64, 81};
		int contador = 0;
		for(int i = 0; i <= 5; i ++)
		{
//			contador = contador * 2;
//			contador = contador + i;
			contador = contador + valores[i];
		}
		System.out.println(contador);











		
		/** /
		int contador = 2;
		for(int i = 0; i < 5; i ++)
		{
			contador = contador * 2;
			
		}
		System.out.println(contador);
		/**/
		
		/** /
		int contador = 45;
		for(int i = 0; i < 4; i ++)
		{
			contador = contador + i;
		}
		System.out.println(contador);
		/**/
		
		/** /
		int [] numeros = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
		int contador = 1;
		for(int i = 0; i < 6; i ++)
		{
			contador = numeros[i];
			
		}
		System.out.println(contador);
		/**/
		
		/** /
		int [] numeros = {1, 4, 9, 16, 25, 36, 49, 64, 81};
		int contador = 0;
		for(int i = 0; i <=5; i ++)
		{
			contador = contador + numeros[i];
		}
		System.out.println(contador);
		/**/
		
		/** /
		int contador = 0;
		for(int i = 0; i < 9; i ++)
		{
			if(i % 2 == 0 ) {
				contador = contador + i;
			}
			
		}
		System.out.println(contador);
		/**/
		
		/** /
		int contador = 0;
		for(int i = 0; i < 5; i ++)
		{
			if(i % 2 == 1 ) {
				contador = contador + i;
			}
			
		}
		System.out.println(contador);
		/**/
		
		/** /
		int contador = 1;
		for(int i = 0; i < 5; i ++)
		{
			if(i % 2 == 1 ) {
				contador = contador + i;
			}
			
		}
		System.out.println(contador);
		/**/
		
		/** /
		int contador = 1;
		for(int i = 0; i < 5; i ++)
		{
			if(i % 2 == 1 ) {
				contador = contador + i;
			}
			
		}
		System.out.println(contador);
		/**/
		
	}
	
	private ArrayList<Pessoa> trabalhadores = new ArrayList<>(8);
	private Pessoa[] trabalhadores2;
	private Pessoa[] trabalhadores3 = new Pessoa[3];
}
