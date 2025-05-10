public abstract class ContaBancaria {
	
	private String senha;
	private int numero;
	private double saldo;

	public ContaBancaria(String senha, int numero, double saldo) {
		this.senha = senha;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public ContaBancaria(String senha) {
		this.senha = senha;
	}


	abstract void saca(java.util.Scanner scanner);
	
    abstract void deposita(java.util.Scanner scanner);
    
    abstract void tiraExtrato(java.util.Scanner scanner);
    
    public String getSenha() {
		return senha;
	}
    
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void AlteraSenha(java.util.Scanner scanner, String senha) {
	System.out.println("Digite a senha antiga");
	String senhaA = scanner.nextLine();
		while(!senha.equals(getSenha())) {
			System.out.println("Senha incorreta, digite novamente: ");
			senhaA = scanner.nextLine();
		}
	System.out.println("Sua senha foi alterada! ");
	}
}
	