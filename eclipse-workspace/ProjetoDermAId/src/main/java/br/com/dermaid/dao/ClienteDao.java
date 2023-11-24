package br.com.dermaid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.dermaid.beans.Cliente;
import br.com.dermaid.conexoes.ConexaoFactory;

public class ClienteDao {

	
public Connection minhaConexao;
	
	public ClienteDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}

	// Inserir cliente no banco de dados
	public String inserir(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"INSERT INTO cliente (cpf, email, nome, senha, idade, genero) " +
				"VALUES (?, ?, ?, ?, ?, ?)"
		);
		
		stmt.setLong(1, cliente.getCpf());
		stmt.setString(2, cliente.getEmail());
		stmt.setString(3, cliente.getNome());
		stmt.setString(4, cliente.getSenha());
		stmt.setString(5, cliente.getIdade());
		stmt.setString(6, cliente.getGenero());
		
		stmt.execute();
		stmt.close();
		
		return "Cliente cadastrado com sucesso!";
	}
		
	public String atualizar(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("UPDATE CLIENTE SET SENHA = ? WHERE EMAIL = ?");
				stmt.setString(1, cliente.getSenha());
				stmt.setString(2, cliente.getEmail());
				stmt.executeUpdate();
				stmt.close();	
		return "Atualizado com Sucesso!";
	}
}

