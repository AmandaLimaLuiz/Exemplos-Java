package orientacaoObjeto;
//Aula orienta��o a objetos


/*Classes 
-n�o possuem metodo main, pq n�o s�o programas
- O nome inicia c/ letra MAIUSCULA;
-O nome n�o deve conter: Acentua��o, caracteres especiais, espa�o;
 
-Toda classe java possui o seguinte c�digo:
 
 public class NomeDaClasse{
 
 }
 */

/* ATRIBUTOS
-Atributos: S�o caracteristicas da classe/ molde/modelo de dados;
-Podemos entender os atributos como variaveis da classe
-S�o nomeados com letra minuscula, s/ espa�o, s/ caractere especial, s/ acentua��o;
-pode se usar o _ ex.: guarda_chuva ; 
*/

/*METODOS
 - Os m�todos s�o como a��o que � realizada por um objeto da classe;
 - S�o comportamentos dos objetos da classe; 
     a) Tipo de Retorno (Tipo de dado que a fun��o vai retornar);
	 b) Nome - corresponde a a��o que a fun��o realiza;
	 c) Par�metros / Argumentos de entrada (Opcional);
	 d) Retorno (Opcional - depende do tipo de retorno);
 * 
 */
public class Produto {
	//Atributo
	String nome;
	float preco;
	float desconto;

	//Metodo p/ aumentar pre�o em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}

}
