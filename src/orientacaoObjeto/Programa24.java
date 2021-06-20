package orientacaoObjeto;
/* CONSTRUTOR
  - O método construtor de uma classe SEMPRE tem o mesmo nome da classe;
  - Por padrão a JVM , cria em tempo de execução, um construtor padrão - construtor vazio.
  - Pode ter mais de 1 construtor na classe;
    
 
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // -> Construtor
		pessoa1.nome = "Carla";
		pessoa1.email = "carla@gmail.com";
		pessoa1.ano_nascimento = 1983;
		
		
		System.out.println("================ Pessoas ============");
		/*System.out.println("Nome: " + pessoa1.nome);
		System.out.println("e-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento + "\n");
		*/
		pessoa1.imprime_informacoes();
		
		
		Pessoa pessoa2 = new Pessoa("Maria","maria@gmail.com",1930); // -> construtor com parametro
		pessoa2.imprime_informacoes();
	

	}

}
