class Expressao extends Expression{
	Expression esquerda, direita;
	char tipo;
	
	double calcular(){
		if(tipo == '*'){
			return (esquerda.calcular() * direita.calcular());
		}
		else{
			return (esquerda.calcular() / direita.calcular());
		}
	}
	void adicionar(Expression esquerda, Expression direita,char o){
		this.esquerda = esquerda;
		this.direita = direita;
		this.tipo = o;
	}
}
