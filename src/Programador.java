
public class Programador extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Participacao dos lucros do Programador");
		return super.getSalario() * 0.25;
	}
}
