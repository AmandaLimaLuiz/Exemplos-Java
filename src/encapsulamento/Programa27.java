package encapsulamento;
// ----------PRIVATE----------

//PRIVADO A PROPRIA CLASSE
//S� temos acesso ao atributo ou m�todo privado dentro da pr�pria classe 
//onde ele foi declarado.
public class Programa27 {

	public static void main(String[] args) {
		Cliente clie = new Cliente("Felicie","Rua qualquer 122");
		
		clie.dizerOi();
		System.out.println("Nome: " + clie.getNome());
		System.out.println("Endere�o: " + clie.getEndereco());
		

	}

}
