import java.util.Scanner;

public class Teste {
	public static void main (String [] args) {
		
		System.out.println("Olá, quantas contas deseja criar? ");
		
		Scanner scanner = new Scanner(System.in);
		int nContas = Integer.parseInt(scanner.nextLine());
		
		ContaBancaria [] contas = new ContaBancaria[nContas];
		
		for(int i = 0; i < nContas; i++) {
			System.out.println("Que tipo? digite: \n Conta corrente: 1\n Conta poupança: 2 ");
			int tipoConta = Integer.parseInt(scanner.nextLine());
			
		    
			if (tipoConta == 1) {
				 contas [i] = new ContaCorrente("senha");
				  ((ContaCorrente) contas[i]).deposita(scanner);
				  ((ContaCorrente) contas[i]).saca(scanner);
				  ((ContaCorrente) contas[i]).tiraExtrato(scanner);  
				  System.out.println("Voce realizou "+((ContaCorrente) contas[i]).getQtdTransaçoes()+" transações.");
			 }
			 
			 else if (tipoConta == 2) {
				 contas[i] = new ContaPoupança("senha");
				 ((ContaPoupança) contas[i]).settRendimento(2.0);
				 ((ContaPoupança) contas[i]).deposita(scanner);
				 ((ContaPoupança) contas[i]).saca(scanner);
				 ((ContaPoupança) contas[i]).tiraExtrato(scanner);
				 System.out.println(((ContaPoupança) contas[i]).gettRendimento());
			 }
		
			 else {
				 System.out.println("Digito invalido, conta corrente sera criada por padrão ");
				 contas [i] = new ContaCorrente("senha");
				 ((ContaCorrente) contas[i]).deposita(scanner);
				 ((ContaCorrente) contas[i]).saca(scanner);
			     ((ContaCorrente) contas[i]).tiraExtrato(scanner);
				  System.out.println(((ContaCorrente) contas[i]).getQtdTransaçoes());
			 }
			
		}
		
		System.out.println("Quantos Lca pretende criar? ");
		int nInv = Integer.parseInt(scanner.nextLine());
		
		Lca [] inv = new Lca[nInv];
		for(int i = 0; i< nInv; i++) {
			
			System.out.println("digite o valor a ser investido: ");
			double nValor = Double.parseDouble(scanner.nextLine());
			System.out.println("Digite a taxa de rendimento: ");
			double rendimento = Double.parseDouble(scanner.nextLine());
			inv[i] = new Lca(nValor,rendimento);
			double rend = inv[i].calculaRendimento();
			System.out.println("Essa conta rende:" + rend + " ao mes:");
		}
		
		scanner.close();
    }
}
