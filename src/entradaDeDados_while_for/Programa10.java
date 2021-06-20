package entradaDeDados_while_for;

public class Programa10 {

	//foreach = para cada
	public static void main(String[] args) {
		String nome = "Geek Univesity";
		
		//para cada um dos caracteres da string, imprima o caractere;
		for(char letra : nome.toCharArray()) {
			System.out.println(letra); // uma letra abaixo da outra / para ficar na mesma linha usar apenas print no lugar de println
		}

	}

}
