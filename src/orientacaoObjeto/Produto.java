package orientacaoObjeto;
//Aula orientação a objetos


/*Classes 
-não possuem metodo main, pq não são programas
- O nome inicia c/ letra MAIUSCULA;
-O nome não deve conter: Acentuação, caracteres especiais, espaço;
 
-Toda classe java possui o seguinte código:
 
 public class NomeDaClasse{
 
 }
 */

/* ATRIBUTOS
-Atributos: São caracteristicas da classe/ molde/modelo de dados;
-Podemos entender os atributos como variaveis da classe
-São nomeados com letra minuscula, s/ espaço, s/ caractere especial, s/ acentuação;
-pode se usar o _ ex.: guarda_chuva ; 
*/

/*METODOS
 - Os métodos são como ação que é realizada por um objeto da classe;
 - São comportamentos dos objetos da classe; 
     a) Tipo de Retorno (Tipo de dado que a função vai retornar);
	 b) Nome - corresponde a ação que a função realiza;
	 c) Parâmetros / Argumentos de entrada (Opcional);
	 d) Retorno (Opcional - depende do tipo de retorno);
 * 
 */
public class Produto {
	//Atributo
	String nome;
	float preco;
	float desconto;

	//Metodo p/ aumentar preço em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}

}
