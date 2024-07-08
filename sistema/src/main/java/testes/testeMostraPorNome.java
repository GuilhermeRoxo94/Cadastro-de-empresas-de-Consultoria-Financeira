package testes;

import modelo.consultoriaFinanceira;
import modelo.consultoriaFinanceiraDao;

public class testeMostraPorNome {

	public static void main(String[] args) {
		
		consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
		consultoriaFinanceira consultoriafinanceira = consultoriafinanceiradao.mostraPorNome("renner");
		
		if(consultoriafinanceira!=null){
			System.out.println("Nome Empresa: " + consultoriafinanceira.getNomeEmpresa());
			System.out.println("Clientes Ativos: " + consultoriafinanceira.getClientesAtivos());
			System.out.println("Media Retorno Investimento: " + consultoriafinanceira.getMediaRetornoInvestimento());
			System.out.println("honorarios: " + consultoriafinanceira.getHonorarios());
			System.out.println("Comissoes: " + consultoriafinanceira.getComissoes());
			System.out.println("Retainers: " + consultoriafinanceira.getRetainers());
			System.out.println("Salarios Funcionarios: " + consultoriafinanceira.getSalariosFuncionarios());
			System.out.println();
		} else {
			System.out.println("Nome Empresa nao existe !!!");
		}
		
	}

}


