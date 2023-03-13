package model.dao.telefonia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.dao.Banco;
import model.vo.telefonia.Endereco;

public class EnderecoDAO {
	
	//INSERT
	public Endereco inseri(Endereco novoEndereco) {
		Connection conexao = Banco.getConnection();
		String sql = "INSERT INTO ENDERECO "
				+ "(RUA, CEP, BAIRRO, CIDADE, UF, NUMERO) "
				+ "VALUES "
				+ "(?,?,?,?,?,?)";
		
		PreparedStatement query  = Banco.getPreparedStatementWithPk(conexao, sql);
		
		try {
			query.setString(1, novoEndereco.getRua());
			query.setString(2, novoEndereco.getCep());
			query.setString(3, novoEndereco.getBairro());
			query.setString(4, novoEndereco.getCidade());
			query.setString(5, novoEndereco.getUf());
			query.setString(6, novoEndereco.getNumero());
			query.executeQuery();

			ResultSet resultado = query.getGeneratedKeys();
			
			if(resultado.next()) {
				novoEndereco.setIdEndereco(resultado.getInt(1));
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao inserir endereço."
					+ "\nCausa: " + e.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		
		return novoEndereco;
	}
	
	
	
	
	//DELETE
	//UPDATE
	//SELECT

}
