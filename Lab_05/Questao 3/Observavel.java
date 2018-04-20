public interface Observavel{
	public void adicionarObservador(Observador o);
	public void removerObservador(Observador o);
	public void notificar();
}