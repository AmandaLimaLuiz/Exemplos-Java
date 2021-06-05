package geekjava;

import java.util.Scanner;

public class Programa09 {

	//for
	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		//Variavel de controle; Controle de parada; Forma de incremento
		//i++ -> i = i + 1
		for(int i = 0; i < 5; i++) {
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = Integer.parseInt(teclado.nextLine());
		
		}
		teclado.close();
	}

	
	}
  

