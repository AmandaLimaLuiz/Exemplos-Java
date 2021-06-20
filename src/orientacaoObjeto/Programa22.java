package orientacaoObjeto;
/*OBJETOS
  - São produtos / instancias da classe;
  - 
 
*/

public class Programa22 {

	public static void main(String[] args) {
		
		//Declaração de um objeto;
		Produto p0;
		
		
		//Declarando e instanciando/iniciando um objeto;
		//p1 -> instancia do objeto / objeto
		Produto p1= new Produto(); //Construtor
		p1.nome = "Notbook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("============= Produtos =============");
		System.out.println(p1.nome);
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + " % \n");
		
		p0 = new Produto();
		p0.nome = "Caneta";
		p0.preco = 2.5f;
		p0.desconto = 5;
		System.out.println(p0.nome);
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + " %");		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jurema";
		pessoa1.email = "jujurema@gmail.com";
		pessoa1.ano_nascimento = 1973;
		
		System.out.println("================ Pessoas ============");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("e-mail: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

	}

}
