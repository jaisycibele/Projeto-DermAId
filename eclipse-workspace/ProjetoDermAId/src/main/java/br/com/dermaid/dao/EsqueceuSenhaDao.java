package br.com.dermaid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.dermaid.beans.EsqueceuSenha;
import br.com.dermaid.conexoes.ConexaoFactory;

public class EsqueceuSenhaDao {
public Connection minhaConexao;
	
	public EsqueceuSenhaDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String inserir(EsqueceuSenha esqueceuSenha) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
			("INSERT INTO esqueceu_senha (email, novasenha, cliente_cpf)VALUES (?, ?, ?)");{
	            stmt.setString(1, esqueceuSenha.getEmail());
	            stmt.setString(2, esqueceuSenha.getNovaSenha());
	            stmt.setLong(3, esqueceuSenha.getCpf());
	            stmt.execute();
	            return "Atualizado com Sucesso!";
	}}
	
	}
