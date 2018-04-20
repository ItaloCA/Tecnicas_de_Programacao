abstract class Expressao extends Expression{
	Expression esquerda, direita;
	
	void adicionar(Expression unico){
		this.esquerda = unico;
	}
	void adicionar(Expression esquerda, Expression direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
}
