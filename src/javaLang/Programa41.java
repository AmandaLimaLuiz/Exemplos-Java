package javaLang;

//------------TRABALHANDO COM STRINGS------------

/*
   Em java Strings s�o imutaveis, ou seja, n�o muda.

 */
public class Programa41 {

	public static void main(String[] args) {
		
		String curso = "Programa��o em Java: Essencial.";
		
		
		curso = curso.replace("Java", "Python"); //REPLACE Altera na String se encontrar a primeira palavra pela segunda.
		
		curso = curso.toLowerCase();
		curso = curso.toUpperCase();
		System.out.println(curso);
		
		System.out.println(curso.charAt(0));// P --> busca a letra no index.
		

	}

}
