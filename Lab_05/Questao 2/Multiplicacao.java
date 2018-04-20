class Multiplicacao extends Expressao{
	
	double calcular(){
		return  esquerda.calcular() * direita.calcular();
	}
}
