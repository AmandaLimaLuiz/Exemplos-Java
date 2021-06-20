package herancaPolimorfismo;


// -------- HERANCA -------

public class Programa28 {

	public static void main(String[] args) {
		//pessoa p1 = new pessoa("Thiago", 1988,"thi@gmail.com");
		//System.out.println(p1.getNome());
		//System.out.println(p1);

		Aluno al1 = new Aluno("Maite",2000,"trg5859","ma@gmail.com");
		//System.out.println(al1.getNome());
		System.out.println(al1);
		
		Professor prof1 = new Professor("Geronimo da Silva",1800,"ge@gmail.com","ACDR2526");
		//System.out.println(prof1.getEmail());
		System.out.println(prof1);

		

	}

}
