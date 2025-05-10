public class ContaPoupança extends ContaBancaria implements Rentavel{

	private double tRendimento;


	public ContaPoupança(String senha, int numero, double saldo, double tRendimento) {
		super(senha, numero, saldo);
		this.tRendimento = tRendimento;
	}

	public ContaPoupança(String senha) {
		super(senha);
		// TODO Auto-generated constructor stub
	}

	public double gettRendimento() {
		return tRendimento;
	}

	public void settRendimento(double tRendimento) {
		this.tRendimento = tRendimento;
	}

	public double calculaRendimento() {
		double x =(this.getSaldo() * this.gettRendimento());
		return x;
	}

	@Override
	void deposita(java.util.Scanner scanner) {
		System.out.println("Digite o valor que sera depositado: ");
		double valor = Double.parseDouble(scanner.nextLine());
		setSaldo(valor);
		System.out.println("Dinheiro depositado com sucesso! ");

	}

	@Override
	void tiraExtrato(java.util.Scanner scanner) {
		System.out.println("Digite a senha da conta: ");
		String senha1 =  (scanner.nextLine());
		while (!senha1.equals(getSenha())) {
			System.out.println("Senha incorreta, digite novamente: " );
			senha1 =  (scanner.nextLine());
		}
		System.out.println("Aguarde a impressão");
		System.out.println("Extrato impresso. Obrigado =) ");
	}

	@Override
	void saca(java.util.Scanner scanner) {
		System.out.println("Digite o valor que deseja retirar: ");
		double valor = Double.parseDouble(scanner.nextLine());
		if (getSaldo() < valor) {
			System.out.println("Saldo insuficiente");
		}
		else {
			setSaldo((getSaldo() - valor));
			System.out.println("Seu saque de" + valor + "$ foi realizado! ");
		}	
	}


}
