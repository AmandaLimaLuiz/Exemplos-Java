package tratamentoDeErro;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Informe outro numero: ");
		int n2 = teclado.nextInt();
		
		try {
		System.out.println(divisao(n1,n2));
		}
		catch(ArithmeticException e){
			System.out.println("Não é possivel dividir ");	
		}catch (Exception e){
			System.out.println("Não foi possivel executar a divisão.");
		}
		teclado.close();
	}
	
	//Criando uma função, que avisa que tem a possibilidade de lançar uma exceção do tipo Exeption
		public static int divisao(int n1, int n2) throws Exception{ 
			return n1 / n2;
		}

}


