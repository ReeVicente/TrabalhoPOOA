package GerenciamentoTransacoes;
import GerenciamentoConta.ValoresContaInterface;
import java.time.ZonedDateTime;

public abstract class Transferencia extends Transacao {
	protected ValoresContaInterface contaDestino;
	
	public Transferencia(ZonedDateTime dataHora, double valor, ValoresContaInterface contaOrigem, ValoresContaInterface contaDestino) {
		this.setDataHora(dataHora);
		this.setValor(valor);
		this.setConta(contaOrigem);
		this.setContaDestino(contaDestino);
	}
	
	public void setValor(double valor) {
		// Validação para valor positivo
		if(valor < 0)
			valor = -valor;
		
		this.valor = valor;
		this.contaOrigem.atualizarSaldo(-valor);
		this.contaDestino.atualizarSaldo(valor);
	}
	
	public void setContaDestino(ValoresContaInterface conta) {
		this.contaDestino = conta;
	}
}
