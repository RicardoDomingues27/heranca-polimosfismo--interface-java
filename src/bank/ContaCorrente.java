package bank;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		
		super(agencia, numero);
	}
	@Override
	public boolean saca(double valor) {
		double taxa = 0.2;
		double valorComTaxa = valor+taxa;
		return super.saca(valorComTaxa);
	}
}
