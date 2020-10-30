// Gerente é um Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Gerente");
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
