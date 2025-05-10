public class Lca implements Rentavel {
	
	private double valorInvestido;
	
	private double tRendimento;
	
	
	public Lca(double valorInvestido, double tRendimento) {
		super();
		this.valorInvestido = valorInvestido;
		this.tRendimento = tRendimento;
	}
	
	public double gettRendimento() {
		return tRendimento;
	}

	public void settRendimento(double tRendimento) {
		this.tRendimento = tRendimento;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public double calculaRendimento() {
		double y = (this.getValorInvestido() * this.gettRendimento());
		return y;
	}
	
	public void alteraValor(double novoValor) {
		System.out.println("Insira o valor que deseja: ");
		setValorInvestido(novoValor);
	}


	@Override
	public String toString() {
		return "Lca [Valor do investimento: " + valorInvestido + ", Taxa de rendimento ao mes:"  + tRendimento+" ]";
	}
	
	
}
