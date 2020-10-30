
public class TestaPolimorfismo {
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(1000);

		Gerente gerente = new Gerente();
		gerente.setSalario(5000);

		Programador programador = new Programador();
		programador.setSalario(8500);

		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(funcionario);
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(programador);

		double total = controleBonificacao.getTotalBonificacao();

		System.out.println(controleBonificacao.getDescricaoTotal());
		System.out.println("Total das bonificacoes: " + total);

	}
}
