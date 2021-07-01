package testesDio;
import java.io.IOException;
import java.util.Scanner;

public class dio_idades {

	public static void main(String[] args)  throws IOException {
        /*Scanner leitor = new Scanner(System.in);
       double cont = 0;
        double soma = 0;
        double n;
        double media = 0;
        
   	    do {
   	     n = leitor.nextInt();
	   	     if(n >= 1 ) {
	   	    	 cont = cont + 1;
	   	    	 soma = soma + n;		         
	  	 	}	    	  	
   	    }while ( n >= 1);
         media = soma / cont;  
    	 System.out.printf("%.2f", media);
         leitor.close();
         */
         //-----
         String nome = "Amanda";
         String arq = "teste.txt";
 		
 		String texto = nome;
 		if (Arquivo.Write(arq,texto))
 			System.out.println("Arquivo salvo com sucesso!");
 		else
 		System.out.println("Erro ao salvar arquivo!");
       }

	

	
	}
	

