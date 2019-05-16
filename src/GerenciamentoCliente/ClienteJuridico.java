package GerenciamentoCliente;
import GerenciamentoEmpresa.AgenciaInterface;

public abstract class ClienteJuridico extends Cliente {
	private int cnpj;
	
	public ClienteJuridico(String nome, String endereco, int cnpj, AgenciaInterface agencia) {
		this.atualizarNome(nome);
		this.atualizarEndereco(endereco);
		this.setCnpj(cnpj);
		this.setId();
		this.setAgencia(agencia);
	}
	
	public void setCnpj(int cnpj) {
		// Inserir validação de cnpj
		this.cnpj = cnpj;
	}
}
