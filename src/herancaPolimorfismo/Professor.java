package herancaPolimorfismo;

public class Professor  extends pessoa{
	private String matricula;
	
	public Professor(String nome, int anoNascimento,String email, String matricula) {
		super (nome, anoNascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;
	}

	@Override
	public void outraMsg(String texto) {
		
		
	}

}

