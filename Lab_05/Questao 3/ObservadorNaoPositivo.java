public class ObservadorNaoPositivo implements Observador{
	public void update(Observavel objObservado){
		if(((Expression)objObservado).calcular() < 0)
			System.out.println("Resultado da expressao " + objObservado.toString() + " e negativo\n");
		if(((Expression)objObservado).calcular() == 0)
			System.out.println("Resultado da expressao " + objObservado.toString() + " e nulo (igual a 0)\n");
	}
}