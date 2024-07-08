package testes;

import java.util.List;

import modelo.consultoriaFinanceira;
import modelo.consultoriaFinanceiraDao;

public class testeMostraTodos {

	public static void main(String[] args) {
		
		consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
		List<consultoriaFinanceira> consultoria = consultoriafinanceiradao.mostraTodos();
		
		for(consultoriaFinanceira consultoriafinanceira :consultoria){
			
			System.out.println("Nome Empresa: " + consultoriafinanceira.getNomeEmpresa());
			System.out.println("Clientes Ativos: " + consultoriafinanceira.getClientesAtivos());
			System.out.println("Media Retorno Investimento: " + consultoriafinanceira.getMediaRetornoInvestimento());
			System.out.println("Honorarios: " + consultoriafinanceira.getHonorarios());
			System.out.println("Comissoes: " + consultoriafinanceira.getComissoes());
			System.out.println("Retainers: " + consultoriafinanceira.getRetainers());
			System.out.println("Salarios Funcionarios: " + consultoriafinanceira.getSalariosFuncionarios());
			System.out.println();
			
		}
		
	}

}


