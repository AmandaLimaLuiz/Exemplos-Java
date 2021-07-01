package javaLang;

//Realizando Calculos com Math

/*
 	A biblioteca math possui métodos e constantes estaticas
 	para que possamos utilizar nos nossos programas
 */
public class Programa40 {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sin(45));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		
		System.out.println(Math.round(Math.PI)); //Arredonda p/ inteiro 3 numero		
		System.out.println(Math.ceil(Math.PI));//Arredonda p/ cima float 4.0 numero
		System.out.println(Math.floor(Math.PI));//Arredonda p/ baixo float 3.0 numero
		System.out.println(Math.pow(3, 2)); //9.0 --> elevando ao quadrado
		System.out.println(Math.sqrt(9)); //3.0 -->raiz quadrada
		
		

	}

}
