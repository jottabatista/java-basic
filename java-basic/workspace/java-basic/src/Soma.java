import java.util.Scanner;

import javax.swing.JSpinner;

public class Soma {

	private static double scanner;

	public static void main(String[] args) {
		// Vc tem que ter duas variaveis inteiras pra receber o valor digitado no teclado
		// Vc tem que ter mais uma variavel inteira pra receber a soma das duas variaveis
		// Vc vai precisar do scanner pra pegar a informa��o do teclado
		// Vc vai precisar do sysout para imprimir o resultado
		
		// Depois vc vai ter que criar a classe Subtracao, Multiplicacao, Divisao e fazer o mesmo
		
		
		int primeiroNumero = (0);
		int segundoNumero = (0);
		int somaTotal = (primeiroNumero + segundoNumero);
		//System.in � a informa��o que vem do teclado
		Scanner s = new Scanner(System.in);
			
		System.out.println("Some o primeiro n�mero");
		primeiroNumero = s.nextInt();
				
		System.out.println("Some o segundo n�mero");
		segundoNumero = s.nextInt();
		
		somaTotal = primeiroNumero + segundoNumero;
		
		System.out.println("A soma total � " + somaTotal);
		
	
		
		}
}
