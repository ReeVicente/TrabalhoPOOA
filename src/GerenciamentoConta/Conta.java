package GerenciamentoConta;

public abstract class Conta implements ValoresContaInterface{
	private int numero; 
	private int senha;
	private double saldo = 0;
	private double limite = 0;
	private static int counter = 0;
	
	public Conta(int numero, int senha) {
		this.setNumero();
		this.setSenha(senha);
	}
	
	public void setNumero() {
		this.numero = Conta.counter++;
	}
	
	public void setSenha(int senha) {
		// Inserir validação de senha
		this.senha = senha;
	}
	
	public void atualizarSaldo(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void atualizarLimite(double valor) {
		this.limite = this.limite + valor;
	}
	
	public int getNumero() {
		return this.numero;
	}
}
