package br.edu.fatecpg.sobrescrita.view;

import br.edu.fatecpg.sobrescrita.model.Pagamento;
import br.edu.fatecpg.sobrescrita.model.PagamentoBoleto;

public class Main {

	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento();
		pagamento.ProcessarPagamento();
		
		PagamentoBoleto boleto = new PagamentoBoleto();
		boleto.ProcessarPagamento();

	}

}
