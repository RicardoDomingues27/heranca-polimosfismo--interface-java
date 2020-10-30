package bank;

public abstract class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	
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
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		System.out.println("Solicitando saque de R$ "+valor);
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public double getSaldo() {
		System.out.println("Saldo disponivel: "+this.saldo);
		return this.saldo;
	}
}
