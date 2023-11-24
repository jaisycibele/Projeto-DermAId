package br.com.dermaid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.dermaid.beans.Perguntas;
import br.com.dermaid.conexoes.ConexaoFactory;

public class PerguntasDao {
	
    public Connection minhaConexao;
	
    public PerguntasDao() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }
	
    public String inserir(Perguntas perguntas) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO formulario (texto_pergunta_forms, resposta_forms, cliente_cpf ) " +
                "VALUES (?, ?, ?)");
        stmt.setString(1, perguntas.getTextoPergunta());
        stmt.setString(2, perguntas.getResposta());
        stmt.setLong(3, perguntas.getCpf());
        stmt.execute();
        stmt.close();
        
        return "Pergunta cadastrada com sucesso!";
    }

}
