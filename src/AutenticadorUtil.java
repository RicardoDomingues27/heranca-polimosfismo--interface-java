

public class AutenticadorUtil {
	private String senha;
	
	public boolean autenticaSenha(String senha) {
		if(senha.equals(this.senha)) {
			//System.out.println("Senha autenticada com sucesso.");
			return true;
		}
		return false;
	}

	public void setSenha(String senha) {
		this.senha = senha;
		
	}
}
