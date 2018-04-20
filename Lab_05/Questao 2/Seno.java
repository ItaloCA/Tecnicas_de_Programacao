
class Seno extends Expressao{
	
	double calcular(){
		return calcular('e');
	}
	double calcular(char filho){
		if(filho == 'e' || filho == 'E')
			return Math.sin(esquerda.calcular());
		else
			return Math.sin(direita.calcular());
	}
}
