public class ObservadorPositivo implements Observador{
	public void update(Observavel objObservado){
		if(((Expression)objObservado).calcular() > 0)
			System.out.println("Resultado da expressao " + objObservado.toString() + " e positivo\n");
	}
}