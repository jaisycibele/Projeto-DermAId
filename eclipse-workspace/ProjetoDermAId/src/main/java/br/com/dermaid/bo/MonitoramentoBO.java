package br.com.dermaid.bo;

import java.sql.SQLException;

import br.com.dermaid.beans.Monitoramento;
import br.com.dermaid.dao.MonitoramentoDao;

public class MonitoramentoBO {
	
	public void inserirBo(Monitoramento monitoramento) throws ClassNotFoundException, SQLException  {
		MonitoramentoDao monitoramentoDAO = new MonitoramentoDao();
		monitoramentoDAO.inserir(monitoramento);
	}

}
