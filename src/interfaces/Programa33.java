package interfaces;

//  -------------INTERFACES-----------------

/* 
  - INTERFACES s�o cohecidas como contratos 'como regra' para definir
  a cria��o de um produto ou servi�o.
  - Quem implementar o contrato � obrigado a seguir as regras.
 */
public class Programa33 {

	public static void main(String[] args) {
		
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador �: " + vent.MARCA);
		vent.desligar(); // n�o deve imprimir a msg
		
		vent.ligar(); // deve imprimir a msg
		
		vent.desligar(); // deve imprimir a msg
		
	}

}
