package desafiodeprojetocontabanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Por favor, digite seu nome ");
		String nomeCliente = entrada.nextLine();
		
		System.out.println("Por favor, digite o número da agência com o dígito!" + "\nExemplo: XXXX-X ");
		String numAgencia = entrada.next();
		
		System.out.println("Por favor, digite o número da conta! ");
		int numConta = entrada.nextInt();
		
		System.out.println("Por favor, faça um depósito inicial " + "\nUm Valor até 9900000 com 2 casas decimais ");
		double valorSaldo = entrada.nextDouble();
				
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + "," + "\nconta " + numConta +" e seu saldo " + valorSaldo + " já está disponível para saque.");
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
	

}
