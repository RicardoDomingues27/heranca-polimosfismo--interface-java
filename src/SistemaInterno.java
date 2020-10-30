
public class SistemaInterno {
	public boolean autentica(Autenticavel funcionario) {
		String senha = "1111";
		if(funcionario.autenticaSenha(senha)) {
			System.out.println("Sistema autenticado com sucesso.");
			return true;
		}
		System.out.println("Falha ao efetuar login.");
		
		return false;
	}
}
