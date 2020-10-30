
public class Administrador extends FuncionarioAutenticavel{

	@Override
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Administrador");
		return super.getSalario() *2 ;// Este atributo vem da super class Funcionario
	}

}
