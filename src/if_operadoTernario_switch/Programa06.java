package if_operadoTernario_switch;

//Instrução SWITCH

public class Programa06 {
public static void main(String[] args) {
	int numero = 1;
	
	switch (numero) {
	case 1:
		System.out.println("O numero é 1");
		break;

	case 2:
		System.out.println("O numero é 2");
		break;
		
	case 3:
		System.out.println("O numero é 3");
		break;
		
	default:
		System.out.println("O numero não é valido");
		break;
	}
}
}
