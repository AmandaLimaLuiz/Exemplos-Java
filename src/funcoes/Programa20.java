package funcoes;

import java.util.Scanner;

// Funções
// Criando nossas proprias funções

/*
 Faça um programa que receba diversos nomes de frutas e no final imprima 
 essas frutas em ordem contrária. O programa deve solicitar ao usuario 
 quantas frutas ele quer informar.
 */

public class Programa20 {
	
	//Variaveis globais
	static String frutas[]; //vetor
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// variavel local
		int qtd;
		
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		//qtd = teclado.nextInt(); ---> Para ñ dar bug nas proximas entradas declarar -->
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
			
		teclado.close();
	}
	/*
	 Uma função deve ter:
	 a) Tipo de Retorno (Tipo de dado que a função vai retornar);
	 b) Nome - corresponde a ação que a função realiza;
	 c) Parâmetros / Argumentos de entrada (Opcional);
	 d) Retorno (Opcional - depende do tipo de retorno); 
	 */
	// void = vazio
	 static void cadastrar_dados(int quantidade) {
		 
		 frutas = new String[quantidade]; // Definindo o tamanho do vetor
		 
		 for(int i = 0; i < quantidade; i++) {
				System.out.println("Informe a " + (i + 1) + " fruta: ");
				frutas[i] = teclado.nextLine();	
			}
	 }
	 static void mostrar_dados(int quantidade) {	
		 for(int i = (quantidade - 1); i >= 0; i--) {
			 System.out.println(frutas[i]);
		}	
	 }
	 	
}
