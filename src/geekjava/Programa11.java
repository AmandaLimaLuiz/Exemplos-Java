package geekjava;

// Tipos de Dados
// numericos (Inteiros)

public class Programa11 {

	public static void main(String[] args) {
	
		//Tipos primarios ou primitivos
		
		long num0 = 99; // inteiro muito grande
		int num1 = 4; // inteiro
		short num2 = 4; // inteiro (curto/menor)
		byte num5 = 5; // menor que o short
		char num8 = 34; // valor numérico como character é tratado como valor da tabela ASC
		
		//Tipos não primarios
		
		Long num7 = (long) 9999; // cast
		Integer num3 = 98;
		Short num4 = 7;
		Byte num6 = 9;
		Character num9 = 35;  // valor numérico como character é tratado como valor da tabela ASC
		
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("Integer -> Num3 = " + num3);
		System.out.println("Short -> Num4 = " + num4);
		System.out.println("byte -> Num5 = " + num5);
		System.out.println("Byte -> Num6 = " + num6);
		System.out.println("char -> Num8 = " + num8); // "
		System.out.println("Character -> Num9 = " + num9); // #
		
		System.out.println("int/Integer " + Integer.SIZE + " bits" ); //int/Integer 32 bits
		System.out.println("short/Short " + Short.SIZE + " bits" );   //short/Short 16 bits
		System.out.println("byte/Byte " + Byte.SIZE + " bits" );      //byte/Byte 8 bits
		System.out.println("long/Long " + Long.SIZE + " bits" );      //64 bits
		System.out.println("char/Character " + Character.SIZE + " bits" );//16 bits
		
		System.out.println("long/Long " + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("long/Long " + Long.MAX_VALUE); //9223372036854775807
		
		System.out.println("int/Integer " + Integer.MIN_VALUE); //-2147483648
		System.out.println("int/Integer " + Integer.MAX_VALUE); //2147483647
		
		System.out.println("short/Short " + Short.MIN_VALUE); //-32768
		System.out.println("short/Short " + Short.MAX_VALUE); //32767
		
		System.out.println("byte/Byte " + Byte.MIN_VALUE); //-128
		System.out.println("byte/Byte " + Byte.MAX_VALUE); //127
		
		System.out.println("char/Character " + Character.MIN_VALUE); //0
		System.out.println("char/Character " + Character.MAX_VALUE); //65535
	}

}
