import java.util.ArrayList;

abstract class Expression implements Observavel{
	ArrayList<Observador> lista_de_observadores;

	public void adicionarObservador(Observador o){
		lista_de_observadores.add(o);
				
	}
	public void removerObservador(Observador o){
		lista_de_observadores.remove(o);
	}
	
	public void notificar(){
		for(int i=0; i < lista_de_observadores.size(); i++){
			(lista_de_observadores.get(i)).update(this);
		}
	}

	abstract double calcular();
	void adicionar(Expression esquerda, Expression direita){}
}
