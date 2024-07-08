package testes;

import modelo.consultoriaFinanceira;
import modelo.consultoriaFinanceiraDao;

public class testeAltera {

	public static void main(String[] args) {
		
		consultoriaFinanceira consultoriafinanceira = new consultoriaFinanceira("focus",1,100,90,150,80,90);
		
		consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
		consultoriafinanceiradao.altera(consultoriafinanceira);
		
	}

}


