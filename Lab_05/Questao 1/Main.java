
	/*Italo Cavalcante de Abreu:397135- Questao 1
	João Vitor Pinheiro Nascimento:388837- Questao 2
	Jordan Ferreira:384360- Questao 3*/
class Main{
	public static void main(String agrvs[]){
		//expressao (30*10) / (45)
		Operando x,y,z;
		Expressao Operador_1,Operador_2, Operador_3, Operador_4;
		
		x = new Operando(10);
		y = new Operando(30);
		z = new Operando(45);
		Operador_1 = new Expressao();
		Operador_2 = new Expressao();

		Operador_1.adicionar(x,y,'*');
		Operador_2.adicionar(Operador_1,z,'/');
		System.out.println(Operador_2.calcular());
	    
		
	}
}
