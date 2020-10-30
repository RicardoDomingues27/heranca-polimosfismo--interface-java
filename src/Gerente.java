// Gerente é um Funcionario
public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Gerente");
		return super.getSalario() *2 ;// Este atributo vem da super class Funcionario
	}
	
}
