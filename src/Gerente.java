// Gerente é um Funcionario
public class Gerente extends Funcionario {
	private String senha;
	
	public boolean autenticaSenha(String senha) {
		if(senha == this.senha) {
			return true;
		}
		return false;		
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Gerente");
		return super.getSalario() + super.getBonificacao();// Este atributo vem da super class Funcionario
	}
	
}
