package atributosMetodosEstaticos;

// --------------------MÉTODOS ESTÁTICOS----------------

/*
  - Um método estático não depende de uma instancia d casse para ser utilizado.
  
  - Pode- se utilizar conforme:
  	NomeDaClasse.metodo();
 */
public class Programa35 {

	public static void main(String[] args) {
		Conta c1= new Conta("Suzi");
		System.out.println("Conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		System.out.println("A proxima conta será: " + Conta.proximaConta());

	}

}
