class Operando extends Expression{
	float valor;
	
	Operando(float valor){
		this.valor = valor;
	}
	
	double calcular(){
		return valor;
	}
}
