package GerenciamentoCliente;

public abstract class ClienteJuridico extends Cliente {
	private int cnpj;
	
	public ClienteJuridico(String nome, String endereco, int cnpj) {
		this.atualizarNome(nome);
		this.atualizarEndereco(endereco);
		this.setCnpj(cnpj);
		this.setId();
	}
	
	public void setCnpj(int cnpj) {
		// Inserir validação de cnpj
		this.cnpj = cnpj;
	}
}
