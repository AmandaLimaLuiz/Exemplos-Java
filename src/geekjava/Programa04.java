package geekjava;
//if, else, else if
public class Programa04 {

	public static void main(String[] args) {
		//Declarando e Inicializando a variavel
		int numero = 2;
		
		if(numero > 5) {
			
			System.out.println("O numero " + numero +" � maior que 5");
			
		}
		else if (numero == 5) {
			System.out.println("O numero " + numero +" � igual a 5");
			
		}
		else if (numero % 2 == 0) {
			System.out.println("O numero " + numero +" � par");
			
		}
		else {
			System.out.println("O numero "+ numero + " n�o � maior que 5");
		}

	}

}
