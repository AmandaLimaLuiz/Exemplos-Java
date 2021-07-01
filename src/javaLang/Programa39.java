package javaLang;



import encapsulamento.Cliente;
import encapsulamento.Conta;

public class Programa39 {

//==========OBJECT==============
/*
 A classe object faz parte do pacote java.lang ---> linguagem java padrão
	 
*/
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Bianca", "Rua 1, 234");
		Cliente cli2 = new Cliente("Thiago", "Rua 2, 567");
		
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 500, cli2);
		
		Caixa prateleira = new Caixa();
		
		
		System.out.println(c1);//Por padão a instancia imprime com ToString()
		System.out.println(c2);
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());//Cast
		
		prateleira.adicionar(cli1);
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
	}

}
