package entradaDeDados_while_for;
import java.util.Scanner;

// While e do while

// Receba dados do usuario enquanto a idade do usuario for maior que 0
public class Programa07 {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados via teclado
		Scanner teclado = new Scanner(System.in);
		
		
		//sempre checa o valor antes de executar o bloco
		while(idade > 0) {
		
		  System.out.println("Informe seu nome: ");
		  nome = teclado.nextLine(); //receber string
		
		  System.out.println("Informe sua idade: ");
		  //idade = teclado.nextInt(); BUG // receber int
		  idade = Integer.parseInt(teclado.nextLine());
		
		  System.out.println("Olá " + nome + " você tem " + idade + " anos");
		
		  
		}
		teclado.close();
	}

}
