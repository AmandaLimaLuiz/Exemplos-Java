package aula;
// Tipos de Dados alfanum�ricos
// Caracteres e Strings
public class Programa13 {

	public static void main(String[] args) {
		// Tipos primitivos
		
		char letra = 'a'; // Aspas simples
		char letra2 = 97; // 97 em decimal � igual ao caracter a
		
		System.out.println("Letra = " + letra);
		
		letra2 = (char) (letra2 + 1); //cast // == b
		System.out.println("Letra2 = " + letra2);

		//Tipos n�o primitivos
		
		Character letra3 = 'A';
		String nome = "Amanda Regina";
		
		System.out.println("Letra 3 = " + letra3);
		System.out.println("Nome: " + nome);
		System.out.println("char/Character " + Character.SIZE + " bits" );//16 bits
		
		//System.out.println("String " + String.SIZE); - String � um vetor de caracteres, por isso n�o em um tamanho.
		
		System.out.println("Tamanho da String: " + nome.length()); //13
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits"); // 208 bits

	}

}
