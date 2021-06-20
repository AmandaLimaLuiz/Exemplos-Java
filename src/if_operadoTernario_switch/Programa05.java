package if_operadoTernario_switch;
//Operador Ternario para 2 casos true or false
public class Programa05 {
	
	public static void main(String[] args) {
		int valor = 3, numero;
		
		/*if(valor > 0) {
			numero = valor;
		}else {
			numero = 7;
		}*/
		
		//OPERADOR TERNARIO
		numero = (valor >0 ) ? valor : 7;
				
		// digitar sysout + CTRL + ESPAÇO completa a linha automaticamente.
		System.out.println(numero);
	}

}
