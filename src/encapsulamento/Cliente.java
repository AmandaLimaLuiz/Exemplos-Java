package encapsulamento;

public class Cliente {
	private String nome;
	private String endereco;
	

	public Cliente (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	/*------- PROTECT ---------- Default
	 O modificador de acesso Protect faz com que o 
	 elemento seja visivel somente dentro do mesmo
	  pacote onde foi declarado.
	 */
	void dizerOi(){
		System.out.println(this.nome + " Está dizendo Oi...");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
}
