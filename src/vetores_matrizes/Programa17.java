package aula;

//Vetores Parte 2

//Depois de declarar o tamanho e o tipo de dado não é possivel mudar

public class Programa17 {

	public static void main(String[] args) {
		//Declaração e tamanho do vetor
		int numeros[] = new int[10];
		
		//Para saber o tamanho do vetor
		System.out.println("numeros = " + numeros.length);
		
		//Preencher usando for
		for(int i = 0; i < numeros.length ; i++) {
			numeros[i] =  i + 3;  // numeros[0] = i + 3
		}
		
		System.out.println(numeros[0]);//3 - Primeiro elemento
		System.out.println(numeros[1]);//4 - Segundo elemento
		System.out.println(numeros[9]);//12 - Ultimo elemento

		
		// Preencher com numeros aleatorios
		for(int i = 0; i < numeros.length ; i++) {
			numeros[i] =(int)Math.round(Math.random()*10); //round = arredonda o numero
		}
		System.out.println(numeros[0]);// - Primeiro elemento
		System.out.println(numeros[1]);// - Segundo elemento
		System.out.println(numeros[9]);// - Ultimo elemento
		
		//Gera um numero do tipo double entre 0 .. 1
		System.out.println(Math.random());
		
		//foreach
		
		for (int i : numeros) {
			System.out.println(i);
			
		}
	}

}
