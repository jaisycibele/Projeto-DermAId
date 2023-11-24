package br.com.dermaid.bo;

import java.sql.SQLException;

import br.com.dermaid.beans.Cliente;
import br.com.dermaid.dao.ClienteDao;

public class ClienteBO {

ClienteBO clienteBo;
	
	public void inserirBo(Cliente cliente) throws ClassNotFoundException, SQLException  {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.inserir(cliente);
	}
	
	public void atualizarBo(Cliente cliente) throws ClassNotFoundException, SQLException  {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.atualizar(cliente);
	}
}
