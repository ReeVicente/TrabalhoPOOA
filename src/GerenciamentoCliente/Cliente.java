package GerenciamentoCliente;

public abstract class Cliente {
	private String nome;
	private String endereco;
	private int id;
	private static int counter = 0;
	
	public void atualizarNome(String nome) {
		// Inserir validação de nome
		this.nome = nome;
	}
	
	public void atualizarEndereco(String endereco) {
		// Inserir validação de endereço
		this.endereco = endereco;
	}
	
	protected void setId() {
		this.id = Cliente.counter++;
	}
}
