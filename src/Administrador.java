
public class Administrador extends Funcionario implements Autenticavel{
	private AutenticadorUtil autenticador ;
	
	public Administrador() {
		autenticador =  new AutenticadorUtil();
	}
	@Override
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Administrador");
		return super.getSalario() *2 ;// Este atributo vem da super class Funcionario
	}

	@Override
	public boolean autenticaSenha(String senha) {
		this.autenticador.autenticaSenha(senha);// Delegando a função para a Classe AutenticadorUtil
		return false;
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);// Delegando a função para a Classe AutenticadorUtil
		
	}
}
