package GerenciamentoEmpresa;

public abstract class Agencia {
	private int numero;
	private String endereco;
	
	public Agencia(int numero, String endereco) {
		this.setNumero(numero);
		this.setEndere�o(endereco);
	}
	
	public void setNumero(int numero) {
		// Inserir valida��o de n�mero
		this.numero = numero;
	}
	
	public void setEndere�o(String endereco) {
		// Inserir valida��o de endere�o
		this.endereco = endereco;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}
