package orientacaoObjeto;
//classes
//Atributos
//Metodos
//Construtores

public class Pessoa {
	String nome, email;
	int ano_nascimento;
	
    //construtor vazio
	public Pessoa(){	
	}
	//construtor com parametro
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		
	}
	
	void imprime_informacoes() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("e-mail: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_nascimento);
	}
}
	
