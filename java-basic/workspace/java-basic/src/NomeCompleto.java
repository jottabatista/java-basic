import java.util.Scanner;

public class NomeCompleto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva seu primeiro nome: ");
		String nome = scanner.next();
		
		System.out.println("Escreva seu sobrenome: ");
		String sobrenome = scanner.next();
		
		//System.out.println(nome);
		//System.out.println(sobrenome);
		
		
		//Juca Palido
		//                    Eliel        Silva
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println("Nome Completo: " + nomeCompleto);
		

	}

}
