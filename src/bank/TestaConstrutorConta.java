package bank;

public class TestaConstrutorConta {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(1018, 2020);

		System.out.println("Consulta -> Conta Corrente: " + contaCorrente.getNumero());

		ContaPoupanca contaPoupanca = new ContaPoupanca(1018, 20201);

		System.out.println("Consulta -> Conta Poupanca: " + contaPoupanca.getNumero());

		contaCorrente.deposita(1500);
		contaPoupanca.deposita(5000);

		contaCorrente.getSaldo();
		contaPoupanca.getSaldo();

		contaCorrente.saca(100);
		
		contaCorrente.getSaldo();
		
	}
}
