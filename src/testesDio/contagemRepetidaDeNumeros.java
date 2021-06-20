package testesDio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class contagemRepetidaDeNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira a quantidade de numeros a ser inserido: ");
		int qtd = leitor.nextInt();
		int num [] = new int [qtd];
		for(int i = 0; i < num.length ; i++) {
			num[i] = leitor.nextInt();
			System.out.println(num[i]);
		}
		
			
		
	
	


		leitor.close();
	}

}
