package geekjava;

public class Programa21 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 2, res;
		
		/*res = soma(valor1,valor2);
		System.out.println("O resultado da soma �: " + res);*/
		
		System.out.println("O resultado da soma �: " + soma(valor1,valor2));
		System.out.println(mensagem());
				
	}
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	static String mensagem() {
		return "Ol� usuario";
	}

}
