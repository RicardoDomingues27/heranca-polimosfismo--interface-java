
public class TestaAbstract {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setSenha("1111");
		
		Administrador admin = new Administrador();
		admin.setSenha("2222");
		
		
		SistemaInterno sistema =  new SistemaInterno();
		sistema.autentica(gerente);
		
		sistema.autentica(admin);
		
		
		
	}
}
