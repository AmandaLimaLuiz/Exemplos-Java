package aula;

//Operações Matemticas
public class Programa15 {

	//operaçoes matematicas
	
	public static void main(String[] args) {
		
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A soma dos numeros " +  num1 + " + " + num2 + " = " + res);
		
		//subtração
		res = num2 - num1;
		System.out.println("A subtração dos numeros " +  num2 + " - " + num1 + " = " + res);
		
		//multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação dos numeros " +  num1 + " * " + num2 + " = " + res);
		
		//Divisão
		res2 = (float)num1 / (float)num2; //cast
		System.out.println("A Divisãoo dos numeros " +  num1 + "  " + num2 + " = " + res);
		
		//modulo
		res = num1 % 2;
		System.out.println("A resto da divisão do " +  num1 + " por 2 " + " = " + res);
		

	}

}
