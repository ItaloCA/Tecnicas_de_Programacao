class Cosseno extends Expressao{
	
	double calcular(){
		return this.calcular('e');
	}
	double calcular(char filho){
		if(filho == 'e' || filho == 'E')
			return Math.cos(esquerda.calcular());
		else
			return Math.cos(direita.calcular());
	}
}
