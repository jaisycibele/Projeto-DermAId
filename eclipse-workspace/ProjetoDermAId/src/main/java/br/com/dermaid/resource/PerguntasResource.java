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

import br.com.dermaid.beans.Perguntas;
import br.com.dermaid.bo.PerguntasBO;

@Path("/Perguntas")
public class PerguntasResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Teste Novo Yeah!";	}
	
private PerguntasBO perguntasBO = new PerguntasBO();	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (Perguntas perguntas, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		perguntasBO.inserirBo(perguntas);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(perguntas.getTextoPergunta());
		return Response.created(builder.build()).build();		
	}
	
}
