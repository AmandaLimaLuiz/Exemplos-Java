package tratamentoDeErro;

// --------------TRATADO EXCESSOES COM TRY/CATCH-------------
// TRY - tente fazer isso  -> Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que pode acarreta um erro ou problema.

//Catch - pegue o erro -> Utilizamos para capturar o erro e com isso oferecer ao usuario uma msg adequada, sem que o sistema quebre.

//FINALLY - Sempre executado - independente se houve um erro ou não - só funciona dentro do contexto try/catch

public class Programa36 {

	public static void main(String[] args) {
		
		int numeros[] = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =( i + 3) * 2;
		}
		for (int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do Array que não existe. ");
			}finally {
				System.out.println("Continua o processo...");
			}
		}

	}

}
