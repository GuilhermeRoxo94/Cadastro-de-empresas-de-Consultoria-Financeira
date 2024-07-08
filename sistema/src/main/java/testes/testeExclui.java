package testes;

import modelo.consultoriaFinanceiraDao;

public class testeExclui {

	public static void main(String[] args) {
		
		consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
		consultoriafinanceiradao.excluiPorNomeEmpresa("Empresa");
	}

}


