package herancaPolimorfismo;
/*
  - CLASSE BASE
 * 
 */

//Agora como classe abstrata
//Impossibilita a criação de objetos desta classe.
/*
 * UMA CLASSE ABSTRATA PODE TER:
     - atributos;
     - métodos;
     -métodos abstratos --> Que não possuem implementação.
     possuem apenas declaração, e, obrigatoriamente, as classes que herdam
     desta classe com ate métodos abstratos precisa implementar estes métodos.
 
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
	
	//Overriding - Sobrescrita de método
	public String toString() {
		return "\nnome: " + this.nome + "\nAno de nascimento: " + this.anoNascimento + "\nEmail: " + this.email;
	}
	
	public void mensagem() {
		System.out.println("Esta é minha mesnsagem...");
	}
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	//Declaração de um método abstrato
	public abstract void outraMsg(String texto);
}
