package GerenciamentoEmpresa;

public abstract class Banco {
	private static Banco bancoInstance = null;
	private String nome;
	private int cnpj;
	
	private Banco(String nome, int cnpj) {
		this.setNome(nome);
		this.setCnpj(cnpj);
	}
	
	private void setNome(String nome) {
		// Inserir validação de nome
		this.nome = nome;
	}
	
	private void setCnpj(int cnpj) {
		// Inserir validação de CNPJ
		this.cnpj = cnpj;
	}	
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCnpj() {
		return this.cnpj;
	}
}
