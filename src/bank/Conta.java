package bank;

public class Conta {
	private int agencia;
	private int numero;
	//private double saldo;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada com sucesso. Agencia: "+this.agencia
				+" Numero: "+this.numero);
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	
}
