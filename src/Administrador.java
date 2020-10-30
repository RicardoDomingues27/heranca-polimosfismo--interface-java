
public class Administrador extends Funcionario implements Autenticavel{

	@Override
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Administrador");
		return super.getSalario() *2 ;// Este atributo vem da super class Funcionario
	}

	@Override
	public boolean autenticaSenha(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		
	}

}
