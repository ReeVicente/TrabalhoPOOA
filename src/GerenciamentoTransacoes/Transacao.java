package GerenciamentoTransacoes;
import GerenciamentoConta.ValoresContaInterface;
import java.time.ZonedDateTime;

public abstract class Transacao {
	private ZonedDateTime dataHora;
	protected double valor;
	protected ValoresContaInterface contaOrigem;
	
	public void setDataHora(ZonedDateTime dataHora) {
		// Inserir validação de data e instante
		this.dataHora = dataHora;
	}
	
	public void setValor(double valor) {
	}
	
	public void setConta(ValoresContaInterface conta) {
		this.contaOrigem = conta;
	}
}
