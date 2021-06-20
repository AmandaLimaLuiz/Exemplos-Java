package interfaces;

//  -------------INTERFACES-----------------

/* 
  - INTERFACES são cohecidas como contratos 'como regra' para definir
  a criação de um produto ou serviço.
  - Quem implementar o contrato é obrigado a seguir as regras.
 */
public class Programa33 {

	public static void main(String[] args) {
		
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é: " + vent.MARCA);
		vent.desligar(); // não deve imprimir a msg
		
		vent.ligar(); // deve imprimir a msg
		
		vent.desligar(); // deve imprimir a msg
		
	}

}
