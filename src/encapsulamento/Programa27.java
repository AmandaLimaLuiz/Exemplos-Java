package encapsulamento;
// ----------PRIVATE----------

//PRIVADO A PROPRIA CLASSE
//Só temos acesso ao atributo ou método privado dentro da própria classe 
//onde ele foi declarado.
public class Programa27 {

	public static void main(String[] args) {
		Cliente clie = new Cliente("Felicie","Rua qualquer 122");
		
		clie.dizerOi();
		System.out.println("Nome: " + clie.getNome());
		System.out.println("Endereço: " + clie.getEndereco());
		

	}

}
