package bank;

public class TestaCalculadoraImposto {
	public static void main(String[] args) {
		ContaCorrente contaCorrente =  new ContaCorrente(1018, 2020);
		SeguroDeVida seguroDeVida =  new SeguroDeVida();
		
		CalculadorImposto calculadorImposto =  new CalculadorImposto();
		
		calculadorImposto.calcularImposto(contaCorrente);
		calculadorImposto.calcularImposto(seguroDeVida);
		
		System.out.println("Total de imposto: "
				+CalculadorImposto.totalImposto
				+"%");		
	}
}
