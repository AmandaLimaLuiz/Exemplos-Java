package encapsulamento;
/* GETTERS E SETTERS
 * 
 *GETTERS - É um método público, que serve para consultar dados;
 * - A nomenclatura desses métodos é get_nome_do_atributo()
 */
public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			
		}else if (valor <= (this.saldo + this.limite)){
			float tem = this.saldo - valor;
			if(tem <0) {
				this.saldo = 0;
			}
			tem = this.limite + tem;
			this.limite = tem;
			
		}else {
			System.out.println("Saldo Insuficiente.");
		}
	}
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	//----Método getter-------
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	
}
