package regras;

/**
 * Neste código tomei a liberdade de usar >= no método validarNumeros.
 * Pois avaliei que o tamanho mínimo do array a ser criado deveria ser >= 1
 */

import excecoes.ParametrosInvalidosException;

public class RegrasContador {
	
	public static int  validarNumeros(int num1, int num2) throws ParametrosInvalidosException{
		
		if(num1 >= num2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		return num2 - num1;
		
	}
	
	public static int[] criarArray(int tamanho) {
		int[] array = new int[tamanho];
		
		return array;
	}
	
	public static void imprimirArray(int[] arrayImpressao) {
		
		for(int i = 0; i < arrayImpressao.length; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
	}
	

}
