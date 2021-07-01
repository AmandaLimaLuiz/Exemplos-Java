package executavel;

import java.util.Scanner;

import encapsulamento.Cliente;
import encapsulamento.Conta;

/* ------------GERANDO EXECUTAVEIS COM JAR----------------
 
 * JAR - Java Archive - arquivo compactado java.
 
  	-zip/rar
 
 */
public class Principal {
	
	static Cliente cliente = new Cliente("Angelina","Rua da paz, 25");
	static Conta conta = new Conta(1,200,300,cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println("============ Depósito ===========");
		System.out.println("\nInforme o valor a ser depositado: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Depósito efetuado com sucesso. ");			
		}else {
			System.out.println("O valor precisa ser positivo.");
		}
	}
	
	public static void sacar() {
		System.out.println("============= Sacar =========");
		System.out.println("Informe o valor do saque: ");
		float valor = teclado.nextFloat();
		if(valor > 0) {
			conta.sacar(valor);
			System.out.println("Saque realizado com sucesso.");
		}else {
			System.out.println("O valor precisa ser positivo.");
		}	
	}
	
	public static void consultar() {
		System.out.println("Seu saldo é: " + conta.getSaldo());
	}

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("\nBem-vindo ao Banco Geek");
		
		do {
			System.out.println("\nSelecione uma opção abaixo: ");
			System.out.println("\n1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}while(opcao > 0);
		teclado.close();

	}

}
