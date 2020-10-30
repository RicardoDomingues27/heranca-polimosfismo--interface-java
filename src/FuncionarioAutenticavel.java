
public abstract class FuncionarioAutenticavel extends Funcionario {
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
}
