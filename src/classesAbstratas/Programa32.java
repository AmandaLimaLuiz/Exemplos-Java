package classesAbstratas;


// --------------TEMPLATE METHOD -------------
/*
   - O padr�o templete method define o esqueleto de um algoritmo dentro de um m�todo,
   transferindo alguns de seus passos para as subclasses, o template method permite
   que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
   do proprio algoritmo.
   
   metodo_principal(){
   passo1()
   passo2()
   passo3()
   }
   
 */

public class Programa32 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		TreinamentoInicio tit = new TreinamentoInicio();
		tit.treinodiario();
		
		TreinamentoFim tot = new TreinamentoFim();
		tit.treinodiario();
		

	}

}
