package testes;

import modelo.consultoriaFinanceira;
import modelo.consultoriaFinanceiraDao;

public class testeCadastro {

	public static void main(String[] args) {
		
		consultoriaFinanceira consultoriafinanceira = new consultoriaFinanceira("renner",3,50,20,5,10,30);
		
		consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
		consultoriafinanceiradao.cadastrar(consultoriafinanceira);
	}

}


