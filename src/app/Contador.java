package app;

import java.util.InputMismatchException;
import java.util.Scanner;

import excecoes.ParametrosInvalidosException;
import regras.RegrasContador;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Digite o primeiro parâmetro: ");
			int numero1 = scanner.nextInt();
			
			System.out.print("Digite o segundo parâmetro: ");
			int numero2 = scanner.nextInt();
			
			int tamanho = RegrasContador.validarNumeros(numero1, numero2);
			int[] array = RegrasContador.criarArray(tamanho);
			
			RegrasContador.imprimirArray(array);	
			
		}
		catch(ParametrosInvalidosException ex) {
			System.out.println(ex.getMessage());
		}
		catch(InputMismatchException ex) {
			System.out.println("Favor verificar os dados de entrada");
		}
		finally {
			scanner.close();
		}

	}

}
