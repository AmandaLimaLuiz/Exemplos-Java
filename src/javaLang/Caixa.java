package javaLang;


//Caixa de objetos genericos
public class Caixa {
	private Object[] objetos;
	private int posicaolivre;
	
	public Caixa() {
		objetos = new Object[100];//até 100 objetos de 0..99
		posicaolivre = 0;
	}
	
	public void adicionar(Object nova) {
		this.objetos[this.posicaolivre] = nova;
		this.posicaolivre++;
	}
	
	public Object pegar(int posicao) {
		
		return this.objetos[posicao];
	}

}
