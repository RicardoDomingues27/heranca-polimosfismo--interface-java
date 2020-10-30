
public class ControleBonificacao {

	private double totalBonificacao;
	private String descricaoTotal = "";

	public double getTotalBonificacao() {
		return totalBonificacao;
	}

	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.descricaoTotal += " + " + bonificacao;
		this.totalBonificacao += bonificacao;

	}

	public String getDescricaoTotal() {
		return descricaoTotal;
	}

}
