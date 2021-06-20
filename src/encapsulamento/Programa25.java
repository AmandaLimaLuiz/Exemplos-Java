package encapsulamento;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente ("João da Silva", "Rua da paz, 45");
		Cliente maria = new Cliente ("Maria Lima", "Rua do parque, 20");
		
		Conta conta_joao = new Conta(1 , 100.00f, 200.00f, joao);
		Conta conta_maria = new Conta(2 , 300.00f, 500.00f, maria);
		
		System.out.println("Saldo do João: (Antes do saque) " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());

		conta_joao.sacar(400);
		System.out.println("Saldo do João: (Depois do saque) " + conta_joao.getSaldo());
		
		
	}

}
