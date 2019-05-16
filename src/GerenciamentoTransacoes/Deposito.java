package GerenciamentoTransacoes;
import GerenciamentoConta.ValoresContaInterface;
import java.time.ZonedDateTime;

public abstract class Deposito extends Transacao {
	public Deposito(ZonedDateTime dataHora, double valor, ValoresContaInterface conta) {
		this.setDataHora(dataHora);
		this.setValor(valor);
		this.setConta(conta);
	}
	
	public void setValor(double valor) {
		// Validação para valor positivo
		if(valor < 0)
			valor = -valor;
		
		this.valor = valor;
		this.contaOrigem.atualizarSaldo(valor);
	}
}
