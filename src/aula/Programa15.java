package aula;

//Opera��es Matemticas
public class Programa15 {

	//opera�oes matematicas
	
	public static void main(String[] args) {
		
		int num1 = 5, num2 = 9, res;
		float res2;
		
		//soma
		res = num1 + num2;
		System.out.println("A soma dos numeros " +  num1 + " + " + num2 + " = " + res);
		
		//subtra��o
		res = num2 - num1;
		System.out.println("A subtra��o dos numeros " +  num2 + " - " + num1 + " = " + res);
		
		//multiplica��o
		res = num1 * num2;
		System.out.println("A multiplica��o dos numeros " +  num1 + " * " + num2 + " = " + res);
		
		//Divis�o
		res2 = (float)num1 / (float)num2; //cast
		System.out.println("A Divis�oo dos numeros " +  num1 + "  " + num2 + " = " + res);
		
		//modulo
		res = num1 % 2;
		System.out.println("A resto da divis�o do " +  num1 + " por 2 " + " = " + res);
		

	}

}
