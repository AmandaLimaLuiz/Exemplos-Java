package aula;

import java.util.Scanner;

public class Programa08 {

	//do while
	public static void main(String[] args) {
		int idade;
		String nome;
		
		//Para receber dados via teclado
		Scanner teclado = new Scanner(System.in);
		
		
		//Primeiro executa o bloco e depois faz a checagem
		do{
		
		  System.out.println("Informe seu nome: ");
		  nome = teclado.nextLine(); //receber string
		
		  System.out.println("Informe sua idade: ");
		  //idade = teclado.nextInt(); BUG // receber int
		  idade = Integer.parseInt(teclado.nextLine());
		
		  System.out.println("Olá " + nome + " você tem " + idade + " anos");
		
		  
		}while(idade > 0);
		teclado.close();
	


	}

}
