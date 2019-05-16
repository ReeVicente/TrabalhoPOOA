package GerenciamentoTransacoes;
import GerenciamentoConta.ValoresContaInterface;
import java.time.ZonedDateTime;

public abstract class Saque extends Transacao {
	public Saque(ZonedDateTime dataHora, double valor, ValoresContaInterface conta) {
		this.setDataHora(dataHora);
		this.setValor(valor);
		this.setConta(conta);
	}
	
	public void setValor(double valor) {
		// Validação para valor negativo
		if(valor > 0)
			valor = -valor;
		
		this.valor = valor;
		this.contaOrigem.atualizarSaldo(valor);
	}
}
