class Divisao extends Expressao{
	
	double calcular(){
		//if(direita != NULL && esquerda != NULL){
			return  esquerda.calcular() / direita.calcular();
		//}
	}
}
