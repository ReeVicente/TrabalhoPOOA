package GerenciamentoCliente;
import java.util.Date;

public abstract class ClienteFisico extends Cliente {
	private int cpf;
	private Date dataNascimento;
	
	public ClienteFisico(String nome, String endereco, int cpf, Date dataNascimento) {
		this.atualizarNome(nome);
		this.atualizarEndereco(endereco);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setId();
	}
	
	public void setCpf(int cpf) {
		// Inserir validação de cpf
		this.cpf = cpf;
	}
	
	public void setDataNascimento(Date data) {
		// Inserir validação de data
		this.dataNascimento = data;
	}
}
