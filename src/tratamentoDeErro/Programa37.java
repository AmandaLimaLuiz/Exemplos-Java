package tratamentoDeErro;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primero numero para divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o 2 numero para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
		System.out.println(" A divisao de " +  num1 + " por " + num2 + " é: " + num1/num2);
		}
		catch(ArithmeticException e){
			System.out.println("Não é possivel dividir " + num1 + " por " + num2);
			
		}
		teclado.close();

	}

}
