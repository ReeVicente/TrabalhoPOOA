package GerenciamentoCliente;
import GerenciamentoEmpresa.AgenciaInterface;

public abstract class Cliente {
	private String nome;
	private String endereco;
	private int id;
	private static int counter = 0;
	private AgenciaInterface agencia;
	
	public void atualizarNome(String nome) {
		// Inserir validação de nome
		this.nome = nome;
	}
	
	public void atualizarEndereco(String endereco) {
		// Inserir validação de endereço
		this.endereco = endereco;
	}
	
	public void setAgencia(AgenciaInterface agencia) {
		this.agencia = agencia;
	}
	
	protected void setId() {
		this.id = Cliente.counter++;
	}
}
