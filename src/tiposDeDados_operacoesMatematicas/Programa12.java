package tiposDeDados_operacoesMatematicas;

//Tipos de Dados
//numericos (Reais)
public class Programa12 {
	public static void main(String[] args) {
		
		//Tipos primarios ou primitivos
		
		// Por padrão, os numeros reais são considerados double
		double preco1 = 23.4;
		float preco2 = 23.4f; //ocupa menos espaço em memória
		
		//Tipos não primarios
		Double preco3 = 44.5;
		Float preco4 = 44.5f;
		
		System.out.println("float -> preco2 = " + preco2);
		System.out.println("double -> preco1 = " + preco1);
		System.out.println("Float -> preco4 = " + preco4);
		System.out.println("Double -> preco3 = " + preco3);
		
		System.out.println("float/Float " + Float.SIZE + " bits" ); //32 bits
		System.out.println("double/Double " + Double.SIZE + " bits" ); //64 bits
		
		System.out.println("float/Float" + Float.MIN_VALUE); //1.4E-45
		System.out.println("float/Float" + Float.MAX_VALUE); //3.4028235E38
		
		System.out.println("double/Double " + Double.MIN_VALUE); // 4.9E-324
		System.out.println("double/Double " + Double.MAX_VALUE); //1.7976931348623157E308
		
	}

}
