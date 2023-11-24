package br.com.dermaid.bo;

import java.sql.SQLException;

import br.com.dermaid.beans.Perguntas;
import br.com.dermaid.dao.PerguntasDao;

public class PerguntasBO {
	
	public void inserirBo(Perguntas perguntas) throws ClassNotFoundException, SQLException  {
		PerguntasDao perguntasDAO = new PerguntasDao();
		perguntasDAO.inserir(perguntas);
	}

}
