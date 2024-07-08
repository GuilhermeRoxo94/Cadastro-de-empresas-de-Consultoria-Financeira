package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/consultoriafinanceira?useSSL=false","root","270105");
			System.out.println("O BANCO DE DADOS FOI CONECTADO COM SUCESSO!!!!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("NÃO FOI POSSÍVEL CONECTAR AO BANCO DE DADOS!!!!");
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}


