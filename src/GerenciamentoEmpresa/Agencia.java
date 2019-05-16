package GerenciamentoEmpresa;

public abstract class Agencia {
	private int numero;
	private String endereco;
	
	public Agencia(int numero, String endereco) {
		this.setNumero(numero);
		this.setEndereço(endereco);
	}
	
	public void setNumero(int numero) {
		// Inserir validação de número
		this.numero = numero;
	}
	
	public void setEndereço(String endereco) {
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
