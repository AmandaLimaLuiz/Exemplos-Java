package herancaPolimorfismo;
/* Beneficios da Herança:
  - Evita a repetição de código
  - Facilita a manutenção do Programa.
 */

//classe especifica / sub-classe
public class Aluno extends pessoa{  // <--- Aluno é uma pessoa
		private String ra;
/* Quando uma classe herda de outra classe ela ganha:
   - TODOS  os atributos e metodos da classe herdada. 
 */
		
		
		public Aluno(String nome, int anoNascimento,String email, String ra) {
		super(nome, anoNascimento,email);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	public String setRa() {
		return this.ra;
	}
	
	// POLIMORFISMO
	
	public String toString() {
		return super.toString() + "\nR.A.: " + this.ra;
	}

	@Override
	public void outraMsg(String texto) {
		System.out.println(texto);
		
	}
}
