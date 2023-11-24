package br.com.dermaid.bo;

import java.sql.SQLException;

import br.com.dermaid.beans.EsqueceuSenha;
import br.com.dermaid.dao.EsqueceuSenhaDao;

public class EsqueceuSenhaBO {

EsqueceuSenhaBO esqueceuSenhaBo;
	
	//cadastro
	
	public void inserirBo(EsqueceuSenha esqueceuSenha) throws ClassNotFoundException, SQLException  {
		EsqueceuSenhaDao esqueceuSenhaDAO = new EsqueceuSenhaDao();
		esqueceuSenhaDAO.inserir(esqueceuSenha);
	}

}
