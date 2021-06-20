package classesAbstratas;

import herancaPolimorfismo.Aluno;


//---------Classes Abstratas-------------

// - É um recurso que proporciona um bloqueio 

public class Programa31 {

	public static void main(String[] args) {
		
		Aluno maria = new Aluno("Maria de Silva", 1999,"maria@gmail.com", "jjjhh");
		System.out.println(maria);
		
		maria.outraMsg("meu nome é: " + maria.getNome());
	}

}
