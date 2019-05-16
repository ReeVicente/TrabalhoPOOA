package GerenciamentoEmpresa;

public abstract class Agencia {
	private int numero;
	private String endereco;
	
	private void setNumero(int numero) {
		// Inserir validação de número
		this.numero = numero;
	}
	
	private void setEndereço(String endereco) {
		// Inserir validação de endereço
		this.endereco = endereco;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
}
