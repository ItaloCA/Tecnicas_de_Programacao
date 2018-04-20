
	/*Italo Cavalcante de Abreu:397135- Questao 3
	João Vitor Pinheiro Nascimento:388837- Questao 2
	Jordan Ferreira:384360- Questao 1*/
class Main{
	public static void main(String agrvs[]){
		//expressao sen(3*10) / cos(45)
		Operando x,y,z;
		Expressao Operador_1,Operador_2, Operador_3, Operador_4;
		
		x = new Operando(1);
		y = new Operando((float)((Math.PI/180) * 30f));
		z = new Operando((float)((Math.PI/180) * 45f));
		Operador_1 = new Multiplicacao();
		Operador_2 = new Divisao();
		Operador_3 = new Seno();
		Operador_4 = new Cosseno();

		Operador_1.adicionar(x,y);
		Operador_4.adicionar(z);
		Operador_3.adicionar(Operador_1);
		Operador_2.adicionar(Operador_3,Operador_4);
		System.out.println(Operador_2.calcular());
	    
		
	}
}
