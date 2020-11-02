package bank;

public class CalculadorImposto {
	public static double totalImposto ;
	
	public double  calcularImposto(Tributavel tributavel) {
		
		double valorImposto = tributavel.getValorImposto();
		CalculadorImposto.totalImposto += valorImposto;
		
		return valorImposto;
	}
	
	
}
