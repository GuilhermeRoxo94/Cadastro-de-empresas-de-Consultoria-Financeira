package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.consultoriaFinanceira;
import modelo.consultoriaFinanceiraDao;

@WebServlet("/chamadaservlet")

public class MeuServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String acao = request.getParameter("acao");
		
		if(acao.equals("Cadastro")){
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Cadastro.html");
			rd.forward(request, response);
		}else if(acao.equals("mostratodos")){
			
			consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
			List<consultoriaFinanceira> consultoria = consultoriafinanceiradao.mostraTodos();
			
			request.setAttribute("consultoria", consultoria);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/mostratodos.jsp");
			rd.forward(request, response);
			
		}else if (acao.equals("exclui")){
			String nomeEmpresa = request.getParameter("nomeEmpresa");
			
			consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
			consultoriafinanceiradao.excluiPorNomeEmpresa(nomeEmpresa);
			
			response.sendRedirect("http://localhost:8080/sistema/chamadaservlet?acao=mostratodos");
		}else if(acao.equals("altera")){
			
			String nomeEmpresa = request.getParameter("nomeEmpresa");
		
			consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
			consultoriaFinanceira consultoriafinanceira = consultoriafinanceiradao.mostraPorNome(nomeEmpresa);
		
			request.setAttribute("consultoriafinanceira", consultoriafinanceira);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/altera.jsp");
			rd.forward(request, response);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String acao = request.getParameter("acao");
		
		if(acao.equals("cadastro")){
			String nomeEmpresa = request.getParameter("txtnomeEmpresa");
			int clientesAtivos = Integer.parseInt(request.getParameter("txtclientesAtivos"));
			double mediaRetornoInvestimento = Double.parseDouble(request.getParameter("txtmediaRetornoInvestimento"));
			double honorarios = Double.parseDouble(request.getParameter("txthonorarios"));
			double comissoes = Double.parseDouble(request.getParameter("txtcomissoes"));
			double retainers = Double.parseDouble(request.getParameter("txtretainers"));
			double salariosFuncionarios = Double.parseDouble(request.getParameter("txtsalariosFuncionarios"));
		
			consultoriaFinanceira consultoriafinanceira = new consultoriaFinanceira(nomeEmpresa, clientesAtivos, mediaRetornoInvestimento, honorarios, comissoes, retainers, salariosFuncionarios);
		
			consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
			consultoriafinanceiradao.cadastrar(consultoriafinanceira);
			
			response.sendRedirect("http://localhost:8080/sistema/chamadaservlet?acao=mostratodos");
		}else if(acao.equals("altera")){
			
			String nomeEmpresa = request.getParameter("txtnomeEmpresa");
			int clientesAtivos = Integer.parseInt(request.getParameter("txtclientesAtivos"));
			double mediaRetornoInvestimento = Double.parseDouble(request.getParameter("txtmediaRetornoInvestimento"));
			double honorarios = Double.parseDouble(request.getParameter("txthonorarios"));
			double comissoes = Double.parseDouble(request.getParameter("txtcomissoes"));
			double retainers = Double.parseDouble(request.getParameter("txtretainers"));
			double salariosFuncionarios = Double.parseDouble(request.getParameter("txtsalariosFuncionarios"));
			
			consultoriaFinanceira consultoriafinanceira = new consultoriaFinanceira(nomeEmpresa, clientesAtivos, mediaRetornoInvestimento, honorarios, comissoes, retainers, salariosFuncionarios);
			
			consultoriaFinanceiraDao consultoriafinanceiradao = new consultoriaFinanceiraDao();
			consultoriafinanceiradao.altera(consultoriafinanceira);
			
			response.sendRedirect("http://localhost:8080/sistema/chamadaservlet?acao=mostratodos");
		
		}
		
	}
	
}


