package br.com.dermaid.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.dermaid.beans.Monitoramento;
import br.com.dermaid.bo.MonitoramentoBO;

@Path("/Monitoramento")
public class MonitoramentoResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Teste Novo Yeah!";	}
	
private MonitoramentoBO monitoramentoBO = new MonitoramentoBO();	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (Monitoramento monitoramento, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		monitoramentoBO.inserirBo(monitoramento);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(monitoramento.getPerguntaMonitoramento());
		return Response.created(builder.build()).build();		
	}

}
