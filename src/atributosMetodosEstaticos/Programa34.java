package atributosMetodosEstaticos;

//----------ATRIBUTOS ESTATICOS----------
/*
   - Atributos est�ticos s�o atributos, onde os valores s�o compartilhados 
   entre as innstancias da classe.
 * 
 */

public class Programa34 {
	public static void main(String[] args) {
		
		
		Conta c1= new Conta("Angelica");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2= new Conta("Camila");		
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3= new Conta("Jo�o");		
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
	}

}
