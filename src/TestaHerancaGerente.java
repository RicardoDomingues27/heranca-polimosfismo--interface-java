
public class TestaHerancaGerente {
	public static void main(String[] args) {
		Gerente gerente =  new Gerente();
		// Testando heranca de funcionario
		gerente.setNome("Ricardo");
		gerente.setCpf("111.111.111-11");
		gerente.setSalario(8500);
		
		System.out.println(gerente.getNome());
		
		
		// Metodo especifico de Gerente()
		gerente.setSenha("abdc11");
		
		
		System.out.println(gerente.autenticaSenha("abdc11"));
		
		
		
		
		
	}
}
