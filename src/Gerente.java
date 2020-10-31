// Gerente é um Funcionario
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticadorUtil autenticador ;
	
	Gerente(){
		autenticador =  new AutenticadorUtil();
	}
	
	
	
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Gerente");
		return super.getSalario() *2 ;// Este atributo vem da super class Funcionario
	}

	@Override
	public boolean autenticaSenha(String senha) {
		
		return this.autenticador.autenticaSenha(senha);// Delegando a função para a Classe AutenticadorUtil
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);// Delegando a função para a Classe AutenticadorUtil
		
	}
	
}
