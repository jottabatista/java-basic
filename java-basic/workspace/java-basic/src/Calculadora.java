import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("## Calculadora ##");
		
		int opcao = Integer.MAX_VALUE; //Esse Integer.MAX_VALUE recebe o maior valor maximo possivel do computador para inteiro.
		
		// While eh uma estrutura de repeticao
		// Ou como vc mesmo disse, de Loop
		// Ele funciona assim, "enquanto a opcao for diferente de 0 fa?a o que estiver dentro do bloco do while"
		while(opcao != 0) {
			System.out.println("Escolha uma op??o:");
			
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			
			opcao = scanner.nextInt();
			
			double primeiroNumero = Double.MAX_VALUE; //Esse Double.MAX_VALUE recebe o maior valor maximo possivel do computador para double.
			double segundoNumero = Double.MAX_VALUE; //Esse Double.MAX_VALUE recebe o maior valor maximo possivel do computador para double.
			
			// Faz um Switch entre as opcoes disponiveis
			// Switch = Escolha uma opcao e se ela for compativel com algum caso disponivel, o codigo que estiver dentro do caso...
			// ser? rodado. Se n?o entrar? no caso "default"
			switch (opcao) {
			case 1:
				System.out.println("Escolha o primeiro numero:");
				primeiroNumero = scanner.nextDouble();
				
				System.out.println("Escolha o segundo numero:");
				segundoNumero = scanner.nextDouble();
				
				double somaDosNumeros = primeiroNumero + segundoNumero;
				System.out.println("A soma dos numeros eh: " + somaDosNumeros);
				break;
			case 2:
				System.out.println("Escolha o primeiro numero:");
				primeiroNumero = scanner.nextDouble();
				
				System.out.println("Escolha o segundo numero:");
				segundoNumero = scanner.nextDouble();
				
				double subtracaoDosNumeros = primeiroNumero - segundoNumero;
				System.out.println("A subtracao dos numeros eh: " + subtracaoDosNumeros);
				break;
			case 3:
				System.out.println("Escolha o primeiro numero:");
				primeiroNumero = scanner.nextDouble();
				
				System.out.println("Escolha o segundo numero:");
				segundoNumero = scanner.nextDouble();
				
				double multiplicacaoDosNumeros = primeiroNumero * segundoNumero;
				System.out.println("A multiplicacao dos numeros eh: " + multiplicacaoDosNumeros);
				break;
			case 4:
				System.out.println("Escolha o primeiro numero:");
				primeiroNumero = scanner.nextDouble();
				
				System.out.println("Escolha o segundo numero:");
				segundoNumero = scanner.nextDouble();
				
				double divisaoDosNumeros = primeiroNumero / segundoNumero;
				System.out.println("A divisao dos numeros eh: " + divisaoDosNumeros);
				break;
			default:
				opcao = 0;
				break;
			}
		}
		
		System.out.println("Bye");
	}

}
