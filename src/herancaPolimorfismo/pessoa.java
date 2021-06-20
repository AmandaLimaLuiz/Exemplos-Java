package herancaPolimorfismo;
/*
  - CLASSE BASE
 * 
 */

//Agora como classe abstrata
//Impossibilita a cria��o de objetos desta classe.
/*
 * UMA CLASSE ABSTRATA PODE TER:
     - atributos;
     - m�todos;
     -m�todos abstratos --> Que n�o possuem implementa��o.
     possuem apenas declara��o, e, obrigatoriamente, as classes que herdam
     desta classe com ate m�todos abstratos precisa implementar estes m�todos.
 
 */
public abstract class pessoa {
	private String nome;
	private int anoNascimento;
	private String email;
	
	public  pessoa(String nome, int anoNascimento, String email) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.email = email;

	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Overriding - Sobrescrita de m�todo
	public String toString() {
		return "\nnome: " + this.nome + "\nAno de nascimento: " + this.anoNascimento + "\nEmail: " + this.email;
	}
	
	public void mensagem() {
		System.out.println("Esta � minha mesnsagem...");
	}
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	//Declara��o de um m�todo abstrato
	public abstract void outraMsg(String texto);
}
