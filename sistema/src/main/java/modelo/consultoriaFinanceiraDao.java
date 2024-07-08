package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class consultoriaFinanceiraDao {

	public void cadastrar(consultoriaFinanceira consultoriafinanceira) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "INSERT INTO consultoria(nome_empresa,clientes_ativos,media_retorno_investimento,honorarios,comissoes,retainers,salarios_funcionarios) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, consultoriafinanceira.getNomeEmpresa());
			preparador.setInt(2, consultoriafinanceira.getClientesAtivos());
			preparador.setDouble(3, consultoriafinanceira.getMediaRetornoInvestimento());
			preparador.setDouble(4, consultoriafinanceira.getHonorarios());
			preparador.setDouble(5, consultoriafinanceira.getComissoes());
			preparador.setDouble(6, consultoriafinanceira.getRetainers());
			preparador.setDouble(7, consultoriafinanceira.getSalariosFuncionarios());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("EMPRESA CADASTRADA COM SUCESSO !!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public List<consultoriaFinanceira> mostraTodos(){
		
		Connection con = Conexao.obterConexao();
		List<consultoriaFinanceira> consultoria = new ArrayList<>();
		String sql = "SELECT * FROM consultoria";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				
				consultoriaFinanceira consultoriafinanceira = new consultoriaFinanceira();
				consultoriafinanceira.setNomeEmpresa(resultado.getString("nome_empresa"));
				consultoriafinanceira.setClientesAtivos(resultado.getInt("clientes_ativos"));
				consultoriafinanceira.setMediaRetornoInvestimento(resultado.getDouble("media_retorno_investimento"));
				consultoriafinanceira.setHonorarios(resultado.getDouble("honorarios"));
				consultoriafinanceira.setComissoes(resultado.getDouble("comissoes"));
				consultoriafinanceira.setRetainers(resultado.getDouble("retainers"));
				consultoriafinanceira.setSalariosFuncionarios(resultado.getDouble("salarios_funcionarios"));
				
				consultoria.add(consultoriafinanceira);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return consultoria;
	}
		
	public consultoriaFinanceira mostraPorNome(String nomeEmpresa){
		
		Connection con = Conexao.obterConexao();
		consultoriaFinanceira consultoriafinanceira = null;
		String sql = "SELECT * FROM consultoria WHERE nome_empresa=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, nomeEmpresa);
			
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()){
				
				consultoriafinanceira = new consultoriaFinanceira();
				consultoriafinanceira.setNomeEmpresa(resultado.getString("nome_empresa"));
				consultoriafinanceira.setClientesAtivos(resultado.getInt("clientes_ativos"));
				consultoriafinanceira.setMediaRetornoInvestimento(resultado.getDouble("media_retorno_investimento"));
				consultoriafinanceira.setHonorarios(resultado.getDouble("honorarios"));
				consultoriafinanceira.setComissoes(resultado.getDouble("comissoes"));
				consultoriafinanceira.setRetainers(resultado.getDouble("retainers"));
				consultoriafinanceira.setSalariosFuncionarios(resultado.getDouble("salarios_funcionarios"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return consultoriafinanceira;
	}
	
	public void excluiPorNomeEmpresa(String nomeEmpresa) {
	
	Connection con = Conexao.obterConexao();
	
	String sql ="DELETE FROM consultoria WHERE nome_empresa=?";
	
	try {
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, nomeEmpresa);
		
		preparador.execute();
		preparador.close();
		
		System.out.println("Empresa excluida com sucesso !");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	public void altera(consultoriaFinanceira consultoriafinanceira){
		
		Connection con = Conexao.obterConexao();
		String sql = "UPDATE consultoria SET clientes_ativos=?,media_retorno_investimento=?,honorarios=?,comissoes=?,retainers=?,salarios_funcionarios=? WHERE nome_empresa=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, consultoriafinanceira.getClientesAtivos());
			preparador.setDouble(2, consultoriafinanceira.getMediaRetornoInvestimento());
			preparador.setDouble(3, consultoriafinanceira.getHonorarios());
			preparador.setDouble(4, consultoriafinanceira.getComissoes());
			preparador.setDouble(5, consultoriafinanceira.getRetainers());
			preparador.setDouble(6, consultoriafinanceira.getSalariosFuncionarios());
			preparador.setString(7, consultoriafinanceira.getNomeEmpresa());
		
			preparador.execute();
			preparador.close();
			
			System.out.println("Empresa Alterada Com Sucesso !!!");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}


