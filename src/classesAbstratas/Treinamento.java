package classesAbstratas;
//template method
public abstract class Treinamento {
	// FINAL é um modificador de acesso que faz com que o elemento que esteja utilizando
	//não possa ser extendido nem reescrito.
	public final void treinodiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
		
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("treino...");
	}
	

}
