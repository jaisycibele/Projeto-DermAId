package br.com.dermaid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.dermaid.beans.Monitoramento;
import br.com.dermaid.conexoes.ConexaoFactory;

public class MonitoramentoDao {
	
public Connection minhaConexao;
	
	public MonitoramentoDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String inserir(Monitoramento monitoramento) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(
				"INSERT INTO monitoramento (texto_pergunta_monitoramento, resposta_monitoramento, cliente_cpf) " +
				"VALUES (?, ?, ?)"
		);
		
		stmt.setString(1, monitoramento.getPerguntaMonitoramento());
		stmt.setInt(2, monitoramento.getRespostaMonitoramento());
		stmt.setLong(3, monitoramento.getCpf());
		stmt.execute();
		stmt.close();
		
		return "Monitoramento cadastrado com sucesso!";
	}

}
